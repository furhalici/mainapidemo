package com.example.mainapidemo.entity.v2;

import com.example.mainapidemo.entity.DeviceType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity(name = "device_v2")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
@EqualsAndHashCode(of = "id")
@DiscriminatorColumn(name = "device_type", discriminatorType = DiscriminatorType.STRING)
public class DeviceV2 {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String udId;

    @Column(name = "device_type", nullable = false, insertable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    private DeviceType deviceType = DeviceType.UNKNOWN;
}
