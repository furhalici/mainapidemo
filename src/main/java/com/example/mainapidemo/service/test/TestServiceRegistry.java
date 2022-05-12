package com.example.mainapidemo.service.test;

import com.example.mainapidemo.entity.Device;
import com.example.mainapidemo.entity.DeviceType;

public interface TestServiceRegistry {

    TestService getTestService(DeviceType deviceType);

}
