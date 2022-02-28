package br.com.gabrielmartinsdasilva.MyAPI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gabrielmartinsdasilva.MyAPI.domain.Usuario;
import br.com.gabrielmartinsdasilva.MyAPI.repositories.UsuarioRepository;

@SpringBootApplication
public class MyApiApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	Usuario u1 = new Usuario(null, "Gabriel M", "Gabriel", "123");
	Usuario u2 = new Usuario(null, "Juninho F","Juninho","321");
	
	
	
	usuarioRepository.saveAll(Arrays.asList(u1,u2));
	
	}

}
