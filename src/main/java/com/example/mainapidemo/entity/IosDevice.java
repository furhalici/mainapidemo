package com.example.mainapidemo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class IosDevice extends Device {

    @OneToOne(mappedBy = "iosDevice", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private IosData iosData;

    public void assignData(IosData iosData) {
        iosData.setIosDevice(this);
        setIosData(iosData);
    }

}