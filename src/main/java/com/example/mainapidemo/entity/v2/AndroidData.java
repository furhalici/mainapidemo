package com.example.mainapidemo.entity.v2;

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

    @OneToOne(mappedBy = "androidData")
    @ToString.Exclude
    private AndroidDeviceV2 androidDeviceV2;

    @Column
    private String androidVersion;
}
