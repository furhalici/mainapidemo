package com.example.mainapidemo.service.test;

import com.example.mainapidemo.entity.Device;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public abstract class TestService<T extends Device> {

    public abstract void start(T device);

    public abstract void end(T device);

    public void click(T device) {
        log.info("clicked {} device({})", device.getDeviceType(), device.getUdId());
    }
}
