package io.springboot.webapp.snippet.domain;

import java.util.Date;

public class Snippet {
	
	private String id;
	private String title;
	private String keywords;
	private String description;
	private Cryptocurrency24Hr cryptocurrency24hr;
	private Cryptocurrency cryptocurrency;
	private Date created;
	private Date modified;
	
	public Snippet() {
		this.id = java.util.UUID.randomUUID().toString().replaceAll("-", "");;
		this.created = new Date();
		this.modified = new Date();
	}
	
	public Snippet (String title, String keywords, String description, Cryptocurrency24Hr cryptocurrency24hr, Cryptocurrency cryptocurrency) {
		this();
		this.title = title;
		this.keywords = keywords;
		this.description = description;
		this.cryptocurrency24hr = cryptocurrency24hr;
		this.cryptocurrency = cryptocurrency;
	}

	public Snippet(String title, Cryptocurrency cryptocurrency, Cryptocurrency24Hr cryptocurrency24hr) {
		this(title, "", "", cryptocurrency24hr, cryptocurrency);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Cryptocurrency24Hr getCryptocurrency24hr() {
		return cryptocurrency24hr;
	}

	public void setCryptocurrency24hr(Cryptocurrency24Hr cryptocurrency24hr) {
		this.cryptocurrency24hr = cryptocurrency24hr;
	}

	public Cryptocurrency getCryptocurrency() {
		return cryptocurrency;
	}

	public void setCryptocurrency(Cryptocurrency cryptocurrency) {
		this.cryptocurrency = cryptocurrency;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}
	
}
