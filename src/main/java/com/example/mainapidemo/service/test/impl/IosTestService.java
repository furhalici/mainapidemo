package com.example.mainapidemo.service.test.impl;

import com.example.mainapidemo.entity.Device;
import com.example.mainapidemo.service.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("IOS")
@Slf4j
class IosTestService extends TestService {

    @Override
    public void start(Device device) {
        log.info("start ios test " + device.getIosData());
    }

    @Override
    public void end(Device device) {
        log.info("end ios test " + device.getIosData());
    }

}
