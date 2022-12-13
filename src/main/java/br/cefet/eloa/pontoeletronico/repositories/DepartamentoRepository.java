package br.cefet.eloa.pontoeletronico.repositories;

import br.cefet.eloa.pontoeletronico.entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository <Departamento, Long> {
	
}
