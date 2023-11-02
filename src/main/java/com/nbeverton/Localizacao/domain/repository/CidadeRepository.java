package com.nbeverton.Localizacao.domain.repository;

import com.nbeverton.Localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
