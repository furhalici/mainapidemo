package com.example.mainapidemo.service.test.impl;

import com.example.mainapidemo.entity.Device;
import com.example.mainapidemo.service.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("ANDROID")
@Slf4j
class AndroidTestService extends TestService {


    @Override
    public void start(Device device) {
        log.info("start android test " + device.getAndroidData());
    }

    @Override
    public void end(Device device) {
        log.info("end android test " + device.getAndroidData());
    }
}
