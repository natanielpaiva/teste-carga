package testecarga.com.testecarga;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping
    public User getUser(){
        return User.builder()
                .name("Nataniel Paiva")
                .email("nataniel.paiva@gmail.com")
                .build();
    }
}
