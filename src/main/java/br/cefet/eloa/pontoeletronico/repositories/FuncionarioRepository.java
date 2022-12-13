package br.cefet.eloa.pontoeletronico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cefet.eloa.pontoeletronico.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {

}