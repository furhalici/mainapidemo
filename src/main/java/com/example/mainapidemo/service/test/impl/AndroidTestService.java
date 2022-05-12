package com.example.mainapidemo.service.test.impl;

import com.example.mainapidemo.entity.AndroidDevice;
import com.example.mainapidemo.service.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("ANDROID")
@Slf4j
class AndroidTestService implements TestService<AndroidDevice> {


    @Override
    public void start(AndroidDevice device) {
        log.info("start android test " + device.getAndroidData());
    }

    @Override
    public void end(AndroidDevice device) {
        log.info("end android test " + device.getAndroidData());
    }
}
