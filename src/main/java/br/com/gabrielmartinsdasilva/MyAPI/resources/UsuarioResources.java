package br.com.gabrielmartinsdasilva.MyAPI.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielmartinsdasilva.MyAPI.domain.Usuario;
import br.com.gabrielmartinsdasilva.MyAPI.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResources {

	
	@Autowired
	private UsuarioService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Integer id){
		Usuario obj = this.service.findById(id);
				return ResponseEntity .ok().body(obj);
	}
	
}
