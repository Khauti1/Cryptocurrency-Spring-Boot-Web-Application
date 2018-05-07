package io.springboot.webapp.snippet.repository;

import java.util.Collection;

public interface SimpleRepository<T> {

	Iterable<T> findAll();
	void saveAll(Collection<T> items);
	T saveAll(T items);
	T findById(String id);
}
