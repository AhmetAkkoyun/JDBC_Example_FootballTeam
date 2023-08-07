package com.ahmetakkoyun.controller;

import com.ahmetakkoyun.repository.entity.Futbolcu;
import com.ahmetakkoyun.service.FutbolcuService;
import com.ahmetakkoyun.utility.ConnectionProvider;
import com.ahmetakkoyun.utility.ICrud;

import java.util.List;
import java.util.Optional;

public class FutbolcuController implements ICrud<Futbolcu> {

    private final FutbolcuService futbolcuService;

    public FutbolcuController(ConnectionProvider connectionProvider) {
        this.futbolcuService = new FutbolcuService(connectionProvider);
    }


    @Override
    public void save(Futbolcu futbolcu) {
        futbolcuService.save(futbolcu);

    }

    public void save2(Futbolcu futbolcu){
        futbolcuService.save2(futbolcu);
    }

    @Override
    public void update(Futbolcu futbolcu) {
        futbolcuService.update(futbolcu);

    }

    @Override
    public void deleteById(Long id) {
        futbolcuService.deleteById(id);

    }

    @Override
    public List findAll() {
        return futbolcuService.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return futbolcuService.findById(id);
    }
}
