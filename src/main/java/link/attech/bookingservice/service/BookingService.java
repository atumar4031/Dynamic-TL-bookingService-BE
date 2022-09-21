package link.attech.bookingservice.service;

import link.attech.bookingservice.model.BookingModel;
import link.attech.bookingservice.response.BaseResponse;

import java.util.List;

public interface BookingService {
    BaseResponse<String> getGreeting();
    BaseResponse<BookingModel> addBooking(BookingModel bookingModel);
    BaseResponse<List<BookingModel>> getBooking();
}
