package com.example.mainapidemo.service.v2.test;

import com.example.mainapidemo.entity.DeviceType;
import com.example.mainapidemo.entity.v2.DeviceV2;

public interface TestServiceRegistry {

    <T extends DeviceV2> TestService<T> getTestService(DeviceType deviceType);

}
