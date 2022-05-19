package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
