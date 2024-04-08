package com.example.demo.repository;

import com.example.demo.entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // this annotation is not necessary now
public interface UsuariosRepository extends JpaRepository<UsuariosEntity,Long> {
}
