package com.minhaloja.carros.repository;

import com.minhaloja.carros.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	// Método personalizado para encontrar usuário por e-mail:
	Optional<Usuario> findByEmail(String email);
}
