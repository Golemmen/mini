package kz.iitu.smart1.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicrowaveController {

    @GetMapping("/status")
    public String getStatus() {
        return "Microwave is running";
    }
}