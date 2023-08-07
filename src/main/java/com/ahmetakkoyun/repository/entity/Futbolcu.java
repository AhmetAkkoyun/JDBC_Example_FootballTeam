package com.ahmetakkoyun.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Futbolcu {

    private Long id;
    private String ad;
    private String mevki;
    private int formaNo;
    private long deger;
    private Long takim_id;

}
