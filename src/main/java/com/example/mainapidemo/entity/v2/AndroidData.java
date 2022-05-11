package com.example.mainapidemo.entity.v2;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AndroidData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "androidData")
    private AndroidDeviceV2 androidDeviceV2;

    @Column
    private String androidVersion;
}
