package com.example.mainapidemo.service.test;

import com.example.mainapidemo.entity.Device;
import com.example.mainapidemo.repository.DeviceRepository;
import com.example.mainapidemo.repository.HelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public abstract class TestService {

    private HelloService helloService;

    @Autowired
    void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public abstract void start(Device device);

    public abstract void end(Device device);

    public void click(Device device) {
        log.info("clicked {} device({})", device.getDeviceType(), device.getUdId());
        helloService.hello();
    }
}
