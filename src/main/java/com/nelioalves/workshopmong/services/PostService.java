package com.nelioalves.workshopmong.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmong.domain.Post;
import com.nelioalves.workshopmong.repository.PostRepository;
import com.nelioalves.workshopmong.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
	
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}
}
