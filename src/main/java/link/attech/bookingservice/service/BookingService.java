package link.attech.bookingservice.service;

import link.attech.bookingservice.request.BookingRequest;
import link.attech.bookingservice.response.BaseResponse;
import link.attech.bookingservice.response.BookingResponse;

public interface BookingService {
    BaseResponse<String> getGreeting();
    BaseResponse<BookingResponse> addBooking(BookingRequest bookingRequest);
}
