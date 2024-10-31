package com.minhaloja.carros.repository;

import com.minhaloja.carros.model.Carro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
	// Método personalizado para encontrar carros por marca:
	List<Carro> findByMarca(String marca);
}
