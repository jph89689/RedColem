package com.RedColem.RedColem.com.redcolem.app.publicacion.repositories;

import com.RedColem.RedColem.com.redcolem.app.publicacion.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
