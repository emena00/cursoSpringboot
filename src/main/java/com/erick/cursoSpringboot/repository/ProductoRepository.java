package com.erick.cursoSpringboot.repository;

import com.erick.cursoSpringboot.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}