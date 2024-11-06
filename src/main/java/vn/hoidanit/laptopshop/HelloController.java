package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World from EDRIC!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Only USER can see this page!";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Only ADMIN can see this page!";
    }
}
