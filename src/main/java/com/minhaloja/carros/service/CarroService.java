package com.minhaloja.carros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.minhaloja.carros.model.Carro;
import com.minhaloja.carros.repository.CarroRepository;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> findAll() {
        return carroRepository.findAll();
    }

    public Carro findById(Long id) {
        return carroRepository.findById(id).orElse(null);
    }

    public Carro save(Carro carro) {
        return carroRepository.save(carro);
    }

    public void deleteById(Long id) {
        carroRepository.deleteById(id);
    }
}
