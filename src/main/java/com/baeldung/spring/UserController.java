package com.baeldung.spring;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping(path = "/get")
    public Mono<ResponseEntity<Object>> createUser() {
        return Mono.justOrEmpty(ResponseEntity.ok("saved"));
    }


}
