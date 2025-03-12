package org.example.feigndemo.controller;

import lombok.RequiredArgsConstructor;
import org.example.feigndemo.apis.IStaticService;
import org.example.feigndemo.model.DogResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpenFeign {
    private final IStaticService service;

    @GetMapping("/get-IDog")
    public DogResponse getIDog() {
        return service.getIDog();
    }
}
