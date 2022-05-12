package com.example.mainapidemo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity(name = "device")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
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
}
