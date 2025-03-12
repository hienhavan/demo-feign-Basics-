package org.example.feigndemo.apis;

import org.example.feigndemo.apis.impl.StaticService;
import org.example.feigndemo.config.FeignConfig;
import org.example.feigndemo.model.DogResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "dogService",url = "https://dog.ceo/api/breeds/image/random", configuration = FeignConfig.class, fallback = StaticService.class)

public interface IStaticService {
    @GetMapping()
    DogResponse getIDog();
}
