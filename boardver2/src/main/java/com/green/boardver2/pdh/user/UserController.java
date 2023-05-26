package com.green.boardver2.pdh.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("pdhUserController")
@RequestMapping("/pdh/user")
public class UserController {

    @PostMapping
    public int postUser() {
        return 0;
    }
}
