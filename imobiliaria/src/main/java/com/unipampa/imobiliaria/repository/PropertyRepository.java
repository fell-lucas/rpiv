package com.unipampa.imobiliaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unipampa.imobiliaria.model.Property;

public interface PropertyRepository extends JpaRepository<Property, Long>{

}
