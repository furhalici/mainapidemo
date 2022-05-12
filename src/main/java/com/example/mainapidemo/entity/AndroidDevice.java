package com.example.mainapidemo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class AndroidDevice extends Device {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "andorid_data_id", referencedColumnName = "id")
    private AndroidData androidData;

    public void assignData(AndroidData androidData) {
        androidData.setAndroidDevice(this);
        setAndroidData(androidData);
    }

}
