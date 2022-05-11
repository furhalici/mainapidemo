package com.example.mainapidemo.service.v2.test.impl;

import com.example.mainapidemo.entity.v2.AndroidDeviceV2;
import com.example.mainapidemo.service.v2.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("ANDROID")
@Slf4j
class AndroidTestService implements TestService<AndroidDeviceV2> {


    @Override
    public void start(AndroidDeviceV2 deviceV2) {
        log.info("start android test " + deviceV2.getAndroidData());
    }

    @Override
    public void end(AndroidDeviceV2 deviceV2) {
        log.info("end android test " + deviceV2.getAndroidData());
    }
}
