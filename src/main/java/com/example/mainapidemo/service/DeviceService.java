package com.example.mainapidemo.service;

import com.example.mainapidemo.entity.Device;
import com.example.mainapidemo.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public void save(Device device) {
        deviceRepository.save(device);
    }

}
