package com.example.mainapidemo;

import com.example.mainapidemo.entity.*;
import com.example.mainapidemo.service.DeviceService;
import com.example.mainapidemo.service.test.TestServiceRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
@Slf4j
public class MainapidemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MainapidemoApplication.class, args);
    }

    private DeviceService deviceService;
    private TestServiceRegistry testServiceRegistry;

    @Autowired
    public void setDeviceService(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @Autowired
    public void setTestServiceRegistry(TestServiceRegistry testServiceRegistry) {
        this.testServiceRegistry = testServiceRegistry;
    }

    @Override
    public void run(String... args) {
        log.info("started app");

        Device androidDevice = new Device();
        androidDevice.setDeviceType(DeviceType.ANDROID);
        androidDevice.setUdId(UUID.randomUUID().toString());
        androidDevice.assignAndroidData(AndroidData.builder().androidVersion("Android2.0.0").build());
        deviceService.save(androidDevice);

        Device iosDevice = new Device();
        iosDevice.setDeviceType(DeviceType.IOS);
        iosDevice.setUdId(UUID.randomUUID().toString());
        iosDevice.assignIosData(IosData.builder().iosVersion("Ios2.0.0").build());
        deviceService.save(iosDevice);

        testServiceRegistry.getTestService(androidDevice.getDeviceType()).start(androidDevice);
        testServiceRegistry.getTestService(iosDevice.getDeviceType()).start(iosDevice);

        testServiceRegistry.getTestService(androidDevice.getDeviceType()).click(androidDevice);
        testServiceRegistry.getTestService(iosDevice.getDeviceType()).click(iosDevice);
    }
}
