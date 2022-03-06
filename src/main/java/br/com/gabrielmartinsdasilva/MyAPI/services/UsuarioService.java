package br.com.gabrielmartinsdasilva.MyAPI.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
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
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado ! ID: " + id + "TIPO: " + Usuario.class.getName(), null));
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario update(Integer id, Usuario obj) {
		Usuario newObj = findById(id);
		newObj.setNome(obj.getNome());
		newObj.setLogin(obj.getLogin());
		newObj.setSenha(obj.getSenha());
		return repository.save(newObj);
	}
}
