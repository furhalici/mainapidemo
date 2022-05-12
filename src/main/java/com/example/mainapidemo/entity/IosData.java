package com.example.mainapidemo.entity;

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

    @OneToOne
    @MapsId
    @JoinColumn(name = "device_id")
    @ToString.Exclude
    private Device device;

    @Column
    private String iosVersion;
}
