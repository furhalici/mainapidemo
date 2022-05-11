package com.example.mainapidemo.entity.v2;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class IosData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "iosData")
    private IosDeviceV2 iosDeviceV2;

    @Column
    private String iosVersion;
}
