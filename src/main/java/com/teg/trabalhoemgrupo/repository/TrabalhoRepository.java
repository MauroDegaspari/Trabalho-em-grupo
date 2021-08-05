package com.teg.trabalhoemgrupo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.teg.trabalhoemgrupo.model.TrabalhoModel;

public interface TrabalhoRepository extends JpaRepository<TrabalhoModel, String>{
	TrabalhoModel findByCodigo(long codigo);
}
