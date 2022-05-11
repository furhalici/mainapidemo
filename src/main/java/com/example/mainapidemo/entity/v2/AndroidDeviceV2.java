package com.example.mainapidemo.entity.v2;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.aspectj.weaver.ast.And;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class AndroidDeviceV2 extends DeviceV2 {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "andorid_data_id", referencedColumnName = "id")
    private AndroidData androidData;

    public void assignData(AndroidData androidData){
        androidData.setAndroidDeviceV2(this);
        setAndroidData(androidData);
    }

}
