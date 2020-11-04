package br.myapp.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.myapp.rest.model.Candidato;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController { 

	    @PostMapping
	    public ResponseEntity criar(@RequestBody Candidato candidato) {
	        return ResponseEntity.status(HttpStatus.CREATED).body(candidato);
	    }

	    @GetMapping
	    public List<Candidato> listar() {
	        return new ArrayList<Candidato>();
	    }
//
//	    @GetMapping(path = "/{id}")
//	    public Usuario byId(@PathVariable Long id) {
//	        return new Usuario();
//	    }
//
//	    @PutMapping(path = "/{id}")
//	    public ResponseEntity atualizar(@RequestBody Usuario usuario, @PathVariable Long id) {
//	        return ResponseEntity.status(HttpStatus.OK).body(usuario);
//	    }
//
//	    @DeleteMapping(path = "/{id}")
//	    public ResponseEntity delete(@PathVariable Long id) {
//	        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//	    }
}
