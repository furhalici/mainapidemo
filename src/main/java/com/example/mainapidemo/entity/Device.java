package com.example.mainapidemo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity(name = "device")
@Data
@EqualsAndHashCode(of = "id")
@DiscriminatorColumn(name = "device_type", discriminatorType = DiscriminatorType.STRING)
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String udId;

    @Column(name = "device_type", nullable = false, insertable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    private DeviceType deviceType = DeviceType.UNKNOWN;


    @OneToOne(mappedBy = "device", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AndroidData androidData;

    @OneToOne(mappedBy = "device", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private IosData iosData;

    public void assignAndroidData(AndroidData androidData){
        androidData.setDevice(this);
        setAndroidData(androidData);
    }

    public void assignIosData(IosData iosData){
        iosData.setDevice(this);
        setIosData(iosData);
    }

}
