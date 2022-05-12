package com.example.mainapidemo.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloService {

    public void hello() {
        log.info("hello");
    }

}
