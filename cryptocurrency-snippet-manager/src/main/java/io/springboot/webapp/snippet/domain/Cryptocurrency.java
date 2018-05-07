package io.springboot.webapp.snippet.domain;

public class Cryptocurrency {
	private String id;
	private String symbol;
	
	public Cryptocurrency() {
		this.id = java.util.UUID.randomUUID().toString().replaceAll("-", "");;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
