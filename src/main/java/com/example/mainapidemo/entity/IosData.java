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

    @OneToOne(mappedBy = "iosData")
    @ToString.Exclude
    private IosDevice iosDevice;

    @Column
    private String iosVersion;
}
