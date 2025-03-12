package org.example.feigndemo.apis.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.feigndemo.apis.IStaticService;
import org.example.feigndemo.model.DogResponse;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class StaticService implements IStaticService {
    @Override
    public DogResponse getIDog() {
        log.error("Static service is slow");
        return null;
    }


}
