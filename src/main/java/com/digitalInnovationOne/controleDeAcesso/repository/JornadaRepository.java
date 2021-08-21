package com.digitalInnovationOne.controleDeAcesso.repository;


import com.digitalInnovationOne.controleDeAcesso.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long>{
}
