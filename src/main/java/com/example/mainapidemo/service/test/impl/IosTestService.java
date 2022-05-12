package com.example.mainapidemo.service.test.impl;

import com.example.mainapidemo.entity.IosDevice;
import com.example.mainapidemo.service.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("IOS")
@Slf4j
class IosTestService implements TestService<IosDevice> {

    @Override
    public void start(IosDevice device) {
        log.info("start ios test " + device.getIosData());
    }

    @Override
    public void end(IosDevice device) {
        log.info("end ios test " + device.getIosData());
    }
}
