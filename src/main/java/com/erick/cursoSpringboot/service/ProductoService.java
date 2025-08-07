package com.erick.cursoSpringboot.service;

import com.erick.cursoSpringboot.model.Producto;
import com.erick.cursoSpringboot.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }
    
    public Producto obtenerPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
    
    public Producto crear(Producto producto) {
        return productoRepository.save(producto);
    }
    
    public Producto actualizar(Long id, Producto producto) {
        if (productoRepository.existsById(id)) {
            producto.setId(id);
            return productoRepository.save(producto);
        }
        return null;
    }
    
    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }
}