package com.example.mainapidemo.service.test;

import com.example.mainapidemo.entity.Device;
import com.example.mainapidemo.entity.DeviceType;

public interface TestServiceRegistry {

    <T extends Device> TestService<T> getTestService(DeviceType deviceType);

}
