package com.example.mainapidemo.service.v2.test.impl;

import com.example.mainapidemo.entity.v2.IosDeviceV2;
import com.example.mainapidemo.service.v2.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("IOS")
@Slf4j
class IosTestService implements TestService<IosDeviceV2> {

    @Override
    public void start(IosDeviceV2 deviceV2) {
        log.info("start ios test " + deviceV2.getIosData());
    }

    @Override
    public void end(IosDeviceV2 deviceV2) {
        log.info("end ios test " + deviceV2.getIosData());
    }
}
