package com.example.TrabajointegradorbackendI.service;

import com.example.TrabajointegradorbackendI.entity.Odontologo;

import java.util.List;
import java.util.Optional;

public interface IOdontologoService {
    Odontologo guardar (Odontologo odontologo) throws Exception;

    List<Odontologo> listarTodos();

    Optional<Odontologo> buscarPorId(Long id);
    void actualizar(Odontologo odontologo) throws Exception;
    void eliminar(Long id);
    Optional<List<Odontologo>> findByNombre(String nombre);
    Optional<List<Odontologo>> findByApellido(String apellido);
    Optional<Odontologo> findByMatricula(String matricula);

}
