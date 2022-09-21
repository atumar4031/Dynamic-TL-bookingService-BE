package link.attech.bookingservice.controller;

import link.attech.bookingservice.response.BaseResponse;
import link.attech.bookingservice.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("booking")
public class BookingController {
    private final BookingService bookingService;

    @GetMapping("/message")
    public BaseResponse<String> getGreeting(){
        return bookingService.getGreeting();

//        echo "# Dynamic-trasportAndLogisticd-bookingService-BE" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin git@github.com:atumar4031/Dynamic-trasportAndLogisticd-bookingService-BE.git
//        git push -u origin main

    }
}
