package com.ahmetakkoyun;

/*
    futbolAppDb
    --Futbolcu
    --Takım
 */

import com.ahmetakkoyun.controller.FutbolcuController;
import com.ahmetakkoyun.repository.FutbolcuRepository;
import com.ahmetakkoyun.repository.TakimRepository;
import com.ahmetakkoyun.repository.entity.Futbolcu;
import com.ahmetakkoyun.repository.entity.Takim;
import com.ahmetakkoyun.utility.ConnectionProvider;

public class Main {
    public static void main(String[] args) {

        Takim takim = Takim.builder().ad("Beşiktaş").build();
        ConnectionProvider connectionProvider = new ConnectionProvider();
        TakimRepository takimRepository = new TakimRepository(connectionProvider);
//        FutbolcuRepository futbolcuRepository = new FutbolcuRepository(connectionProvider);
        FutbolcuController futbolcuController = new FutbolcuController(connectionProvider);


//        takimRepository.save(takim);
//        System.out.println(takim);
        Futbolcu futbolcu = Futbolcu.builder().id(7L).
                ad("Mustafa").mevki("Defans").formaNo(4).takim_id(7L).deger(1000000000L).build();
//         futbolcuController.save2(futbolcu);
//        futbolcuController.update(futbolcu);

//        futbolcuController.deleteById(6L);

//        futbolcuController.findAll().forEach(System.out::println);

        System.out.println(futbolcuController.findById(7L));

    }
}