package com.example.mainapidemo.entity.v2;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IosData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "iosData")
    @ToString.Exclude
    private IosDeviceV2 iosDeviceV2;

    @Column
    private String iosVersion;
}
