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
public class AndroidDevice extends Device {

    @OneToOne(mappedBy = "androidDevice", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AndroidData androidData;

    public void assignData(AndroidData androidData) {
        androidData.setAndroidDevice(this);
        setAndroidData(androidData);
    }

}
