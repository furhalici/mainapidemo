package com.example.mainapidemo.service.v2.test;

import com.example.mainapidemo.entity.v2.DeviceV2;

public interface TestService<T extends DeviceV2> {

    void start(T deviceV2);
    void end(T deviceV2);

}
