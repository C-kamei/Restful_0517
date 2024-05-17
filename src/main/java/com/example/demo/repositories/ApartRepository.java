package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Apart;

@Repository
public interface ApartRepository extends JpaRepository<Apart, Integer> {
	public Optional<Apart> findById(int id);
	public List<Apart> findByName(String key);
	public List<Apart> findByNameLike(String key);
}
