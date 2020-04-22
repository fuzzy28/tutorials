package org.jrue.springbootsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserResource {


    @GetMapping
    public String home() {
        return "Welcome!";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome user!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome admin!";
    }
}
