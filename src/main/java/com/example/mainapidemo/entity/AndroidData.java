package com.example.mainapidemo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AndroidData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "device_id")
    @ToString.Exclude
    private AndroidDevice androidDevice;

    @Column
    private String androidVersion;
}
