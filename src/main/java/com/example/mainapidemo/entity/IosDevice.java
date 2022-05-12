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
public class IosDevice extends Device {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ios_data_id", referencedColumnName = "id")
    private IosData iosData;

    public void assignData(IosData iosData) {
        iosData.setIosDevice(this);
        setIosData(iosData);
    }

}
