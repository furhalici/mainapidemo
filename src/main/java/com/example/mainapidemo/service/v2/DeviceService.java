package com.example.mainapidemo.service.v2;

import com.example.mainapidemo.entity.v2.DeviceV2;
import com.example.mainapidemo.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public void save(DeviceV2 device){
        deviceRepository.save(device);
    }

}
