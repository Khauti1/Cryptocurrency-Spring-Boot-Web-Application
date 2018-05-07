package io.springboot.webapp.snippet.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.springboot.webapp.snippet.repository.CryptocurrencyRepository;
import io.springboot.webapp.snippet.repository.SnippetRepository;

@RestController
public class SnippetController {

	private SnippetRepository snippetRepository;
	private CryptocurrencyRepository cryptocurrencyRepository;
	
	public SnippetController(SnippetRepository snippetRepository, CryptocurrencyRepository cryptocurrencyRepository) {
		this.snippetRepository = snippetRepository;
		this.cryptocurrencyRepository = cryptocurrencyRepository;
	}

	@RequestMapping("/")
	public ModelAndView home() {
		assert snippetRepository != null;
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("cryptocurrencies", cryptocurrencyRepository.findAll());
		model.put("snippets", snippetRepository.findAll());
		
		return new ModelAndView("views/home", model);
	}
	
	@RequestMapping("/snippets")
	public ResponseEntity<?> snippets() {
		assert snippetRepository != null;
		return ResponseEntity.ok(snippetRepository.findAll());
	}
}
