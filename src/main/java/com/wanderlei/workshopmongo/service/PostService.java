package com.wanderlei.workshopmongo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanderlei.workshopmongo.domain.Post;
import com.wanderlei.workshopmongo.repository.PostRepository;
import com.wanderlei.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}	
}
