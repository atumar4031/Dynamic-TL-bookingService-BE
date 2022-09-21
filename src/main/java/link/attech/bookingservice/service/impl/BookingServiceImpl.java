package link.attech.bookingservice.service.impl;

import link.attech.bookingservice.entity.Booking;
import link.attech.bookingservice.model.BookingModel;
import link.attech.bookingservice.repository.BookingRepository;
import link.attech.bookingservice.response.BaseResponse;
import link.attech.bookingservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    @Override
    public BaseResponse<String> getGreeting() {
        return new BaseResponse<>(HttpStatus.OK, "welcome to booking service", "response");
    }

    @Override
    public BaseResponse<BookingModel> addBooking(BookingModel bookingModel) {
        String bookingReference = UUID.randomUUID().toString();
        Booking booking = Booking.builder()
                .email(bookingModel.getEmail())
                .phone(bookingModel.getPhone())
                .passenger(bookingModel.getPassenger())
                .bookingReference(bookingReference)
                .transportationSource(bookingModel.getTransportationSource())
                .transportationDestination(bookingModel.getTransportationDestination())
                .build();

        bookingRepository.save(booking);

        return new BaseResponse<>(HttpStatus.CREATED, "Booking success",
                BookingModel.builder()
                        .email(bookingModel.getEmail())
                        .transportationSource(bookingModel.getTransportationSource())
                        .transportationDestination(bookingModel.getTransportationDestination())
                        .bookingReference(bookingReference)
                        .build());
    }

    @Override
    public BaseResponse<List<BookingModel>> getBooking() {
        List<Booking> bookings = bookingRepository.findAll();

        return new BaseResponse<>(HttpStatus.OK, "All bookings", bookings.stream().map(booking -> BookingModel.builder()
                .email(booking.getEmail())
                .transportationSource(booking.getTransportationSource())
                .transportationDestination(booking.getTransportationDestination())
                .bookingReference(booking.getBookingReference())
                .build()).toList());
    }

}
