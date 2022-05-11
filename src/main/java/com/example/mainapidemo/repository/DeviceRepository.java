package com.example.mainapidemo.repository;

import com.example.mainapidemo.entity.v2.DeviceV2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<DeviceV2, Long> {
}
