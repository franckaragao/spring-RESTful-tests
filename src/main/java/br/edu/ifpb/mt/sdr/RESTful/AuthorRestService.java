package br.edu.ifpb.mt.sdr.RESTful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.mt.sdr.model.Author;
import br.edu.ifpb.mt.sdr.repository.AuthorRepository;

@RestController("/authors")
public class AuthorRestService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Author>> findAll() {
		
		return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);
		
	}

}
