package link.attech.bookingservice.service.impl;

import link.attech.bookingservice.request.BookingRequest;
import link.attech.bookingservice.response.BaseResponse;
import link.attech.bookingservice.response.BookingResponse;
import link.attech.bookingservice.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Override
    public BaseResponse<String> getGreeting() {
        return new BaseResponse<>(HttpStatus.OK, "welcome to booking service", "response");
    }

    @Override
    public BaseResponse<BookingResponse> addBooking(BookingRequest bookingRequest) {
        return null;
    }
}
