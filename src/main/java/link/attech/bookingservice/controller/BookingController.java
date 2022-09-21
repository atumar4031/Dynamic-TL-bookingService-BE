package link.attech.bookingservice.controller;

import link.attech.bookingservice.model.BookingModel;
import link.attech.bookingservice.response.BaseResponse;
import link.attech.bookingservice.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("booking")
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/message")
    public BaseResponse<String> getGreeting(){
        return bookingService.getGreeting();
    }

    @PostMapping
    public BaseResponse<BookingModel> addBooking(@RequestBody BookingModel bookingModel){
        return bookingService.addBooking(bookingModel);
    }
}
