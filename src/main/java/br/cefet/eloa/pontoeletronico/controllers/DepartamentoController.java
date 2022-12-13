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

import br.cefet.eloa.pontoeletronico.entities.Departamento;
import br.cefet.eloa.pontoeletronico.repositories.DepartamentoRepository;

@RestController
@RequestMapping(value = "/departamentos")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoRepository repository;
	
	@GetMapping
	public List<Departamento> findAll() {
		return repository.findAll();
	}
	
	@GetMapping(value= "/{departamento_id}")
	public Departamento findAll(@PathVariable long departamento_id) {
		return repository.findById(departamento_id).get();
	}
	
	@PostMapping
	public Departamento insert(@RequestBody Departamento departamento) {
		return repository.save(departamento);
	}
	
	@DeleteMapping("/{departamento_id}")
	public void delete(@PathVariable long departamento_id) {
		repository.deleteById(departamento_id);
	}
	
	@PutMapping("/")
	public void update(@RequestBody Departamento departamento) {
		repository.save(departamento);
	}
}
