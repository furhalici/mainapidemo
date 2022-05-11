package com.example.mainapidemo.entity.v1;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class IosDeviceV1 extends DeviceV1 {

    @Column
    private String iosVersion;

}
