package com.nbeverton.Localizacao;

import com.nbeverton.Localizacao.domain.entity.Cidade;
import com.nbeverton.Localizacao.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

	@Autowired
	private CidadeRepository cidadeRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Initialized!");
		listarCidadesPorNome();
	}

	void listarCidadesPorNome(){
		cidadeRepository.findByNome("Natal").forEach(System.out::println);
		cidadeRepository.findByNomeEndingWith("tal").forEach(System.out::println);
		cidadeRepository.findByNomeStartingWith("Na").forEach(System.out::println);
		cidadeRepository.findByNomeContaining("ata").forEach(System.out::println);
	}

	void listarCidadesPorHabitantes(){
		cidadeRepository.findByHabitantes(1239L).forEach(System.out::println);
	}

	void salvarCidade(){
		var cidade = new Cidade(1L, "São Paulo", 12396372L);
		cidadeRepository.save(cidade);
	}

	void listarCidades(){
		cidadeRepository.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizacaoApplication.class, args);
	}

}
