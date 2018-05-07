package io.springboot.webapp.snippet.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import io.springboot.webapp.snippet.domain.Cryptocurrency;

public class CryptocurrencyRepository implements SimpleRepository<Cryptocurrency>{
	private List<Cryptocurrency> cryptocurrencies = new ArrayList<>();
	
	public Iterable<Cryptocurrency> findAll() {
		return cryptocurrencies;
	}
	
	@Override
	public void saveAll(Collection<Cryptocurrency> cryptocurrencies) {
		this.cryptocurrencies.addAll(cryptocurrencies);
	}
	
	@Override
	public Cryptocurrency saveAll(Cryptocurrency item) {
		assert item.getSymbol() != null;
		
		Cryptocurrency cryptocurrency = this.findById(item.getSymbol());
		
		if(cryptocurrency == null) {
			this.cryptocurrencies.add(item);
			return item;
		}else {
			cryptocurrency.setSymbol(item.getSymbol());
			return cryptocurrency;
		}
	}
	
	@Override
	public Cryptocurrency findById(String symbol) {
		Optional<Cryptocurrency> cryptocurrency = cryptocurrencies
				.stream()
				.filter(crypto -> crypto.getSymbol().equals(symbol))
				.findFirst();
		
		if(cryptocurrency.isPresent()) return cryptocurrency.get();
		
		return null;
	}
}
