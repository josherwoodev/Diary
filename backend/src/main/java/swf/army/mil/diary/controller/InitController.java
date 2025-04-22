package swf.army.mil.diary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InitController {

    @GetMapping("/init/")
    public String get() {
        return "{\"data\": \"TESTING\"}";
    }
}
