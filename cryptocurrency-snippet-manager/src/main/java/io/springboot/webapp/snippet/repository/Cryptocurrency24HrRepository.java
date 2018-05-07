package io.springboot.webapp.snippet.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import io.springboot.webapp.snippet.domain.Cryptocurrency24Hr;

@Repository
public class Cryptocurrency24HrRepository implements SimpleRepository<Cryptocurrency24Hr>{
	
	private List<Cryptocurrency24Hr> cryptocurrency24HrList = new ArrayList<>();
	
		public Iterable<Cryptocurrency24Hr> findAll() {
			return cryptocurrency24HrList;
		}
		
		@Override
		public void saveAll(Collection<Cryptocurrency24Hr> cryptocurrency24Hr) {
			this.cryptocurrency24HrList.addAll(cryptocurrency24Hr);
		}
		
		@Override
		public Cryptocurrency24Hr saveAll(Cryptocurrency24Hr item) {
			assert item.getSymbol() != null;
			
			Cryptocurrency24Hr cryptocurrency24Hr = this.findById(item.getSymbol());
			
			if(cryptocurrency24Hr == null) {
				this.cryptocurrency24HrList.add(item);
				return item;
			}else {
				cryptocurrency24Hr.setSymbol(item.getSymbol());
				cryptocurrency24Hr.setSyntax(item.getSyntax());
				return cryptocurrency24Hr;
			}
		}
		
		@Override
		public Cryptocurrency24Hr findById(String symbol) {
			Optional<Cryptocurrency24Hr> cryptocurrency24Hr = cryptocurrency24HrList
					.stream()
					.filter(crypto -> crypto.getSymbol().equals(symbol))
					.findFirst();
			
			if(cryptocurrency24Hr.isPresent()) return cryptocurrency24Hr.get();
			
			return null;
		}
}
