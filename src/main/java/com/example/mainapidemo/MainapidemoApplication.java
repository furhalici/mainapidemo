package com.example.mainapidemo;

import com.example.mainapidemo.entity.DeviceType;
import com.example.mainapidemo.entity.v2.AndroidData;
import com.example.mainapidemo.entity.v2.AndroidDeviceV2;
import com.example.mainapidemo.entity.v2.IosData;
import com.example.mainapidemo.entity.v2.IosDeviceV2;
import com.example.mainapidemo.service.v2.DeviceService;
import com.example.mainapidemo.service.v2.test.TestServiceRegistry;
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

        AndroidDeviceV2 androidDevice = new AndroidDeviceV2();
        androidDevice.setDeviceType(DeviceType.ANDROID);
        androidDevice.setUdId(UUID.randomUUID().toString());
        androidDevice.assignData(AndroidData.builder().androidVersion("Android2.0.0").build());
        deviceService.save(androidDevice);

        IosDeviceV2 iosDevice = new IosDeviceV2();
        iosDevice.setDeviceType(DeviceType.IOS);
        iosDevice.setUdId(UUID.randomUUID().toString());
        iosDevice.assignData(IosData.builder().iosVersion("Ios2.0.0").build());
        deviceService.save(iosDevice);

        testServiceRegistry.getTestService(androidDevice.getDeviceType()).start(androidDevice);
        testServiceRegistry.getTestService(iosDevice.getDeviceType()).start(iosDevice);

        testServiceRegistry.getTestService(androidDevice.getDeviceType()).end(androidDevice);
        testServiceRegistry.getTestService(iosDevice.getDeviceType()).end(iosDevice);
    }
}
