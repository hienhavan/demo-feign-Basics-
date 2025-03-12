package org.example.feigndemo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DogResponse {
    private String message;
    private String status;
}
