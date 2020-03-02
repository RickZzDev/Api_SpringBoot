package br.senai.sp.jandira.odonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.jandira.odonto.model.Dentista;
//É praticamente a DAO
public interface DentistaRepository extends JpaRepository<Dentista, Long>{

	
	
}
