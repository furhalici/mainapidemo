package com.example.mainapidemo.entity.v2;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class IosDeviceV2 extends DeviceV2 {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ios_data_id", referencedColumnName = "id")
    private IosData iosData;

    public void assignData(IosData iosData){
        iosData.setIosDeviceV2(this);
        setIosData(iosData);
    }

}
