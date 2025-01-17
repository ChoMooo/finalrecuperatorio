package com.example.TrabajointegradorbackendI.repository;

import com.example.TrabajointegradorbackendI.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
    @Query("Select o FROM Paciente o WHERE o.dni = ?1")
    Optional<Paciente> findByDni(String nombre);

}
