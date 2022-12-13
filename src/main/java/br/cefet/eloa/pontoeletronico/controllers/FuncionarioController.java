package br.cefet.eloa.pontoeletronico.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cefet.eloa.pontoeletronico.entities.Funcionario;
import br.cefet.eloa.pontoeletronico.repositories.FuncionarioRepository;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
	@Autowired
	private FuncionarioRepository repository;

	@GetMapping
	public List<Funcionario> findAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{funcionario_id}")
	public Funcionario findAll(@PathVariable long funcionario_id) {
		return repository.findById(funcionario_id).get();
	}

	@PostMapping
	public Funcionario insert(@RequestBody Funcionario funcionario) {
		return repository.save(funcionario);
	}

	@DeleteMapping("/{funcionario_id}")
	public void delete(@PathVariable Long funcionario_id) {
		repository.deleteById(funcionario_id);
	}

	@PutMapping("/")
	public void update(@RequestBody Funcionario funcionario) {
		repository.save(funcionario);
	}
}
