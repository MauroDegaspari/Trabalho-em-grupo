package com.teg.trabalhoemgrupo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teg.trabalhoemgrupo.model.ParticipanteModel;

public interface ParticipanteRepository extends JpaRepository<ParticipanteModel, String> {

}
