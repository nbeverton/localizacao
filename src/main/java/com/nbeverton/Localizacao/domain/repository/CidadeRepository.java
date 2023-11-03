package com.nbeverton.Localizacao.domain.repository;

import com.nbeverton.Localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    // Busca por nome ou parte de nomes:
    List<Cidade> findByNome(String nome);
    List<Cidade> findByNomeStartingWith(String nome);
    List<Cidade> findByNomeEndingWith(String nome);
    List<Cidade> findByNomeContaining(String nome);

    // Substitui todas as outras querys - LIKE -
    @Query("select c from Cidade c where upper(c.nome) like upper(?1)")
    List<Cidade> findByNomeLike(String nome);


    List<Cidade> findByHabitantes(Long habitantes);
}
