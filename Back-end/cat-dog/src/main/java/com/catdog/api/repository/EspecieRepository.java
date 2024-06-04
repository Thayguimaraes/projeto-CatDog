package com.catdog.api.repository;

import com.catdog.api.entity.Especie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecieRepository extends JpaRepository<Especie, Long> {


}
