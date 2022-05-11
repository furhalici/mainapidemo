package com.example.mainapidemo.entity.v2;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class AndroidDeviceV2 extends DeviceV2 {

    @OneToOne
    @JoinColumn(name = "andorid_data_id", referencedColumnName = "id")
    private AndroidData androidData;

}
