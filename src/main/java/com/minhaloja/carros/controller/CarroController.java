package com.minhaloja.carros.controller;

import com.minhaloja.carros.model.Carro;
import com.minhaloja.carros.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public List<Carro> findAll() {
        return carroService.findAll();
    }

    @GetMapping("/{id}")
    public Carro findById(@PathVariable Long id) {
        return carroService.findById(id);
    }

    @PostMapping
    public Carro save(@RequestBody Carro carro) {
        return carroService.save(carro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        carroService.deleteById(id);
    }
}
