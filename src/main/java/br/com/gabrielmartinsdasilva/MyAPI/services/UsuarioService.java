package br.com.gabrielmartinsdasilva.MyAPI.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gabrielmartinsdasilva.MyAPI.domain.Usuario;
import br.com.gabrielmartinsdasilva.MyAPI.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	public Usuario findById(Integer id) {
		
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElse(null);
	}
}