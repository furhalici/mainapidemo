package com.example.mainapidemo.service.test;

import com.example.mainapidemo.entity.Device;

public interface TestService<T extends Device> {

    void start(T device);

    void end(T device);

}
