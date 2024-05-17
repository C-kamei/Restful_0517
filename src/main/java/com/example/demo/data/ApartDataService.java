package com.example.demo.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Apart;
import com.example.demo.repositories.ApartRepository;

@Service
public class ApartDataService {
	@Autowired
	private ApartRepository repository;
	
	public List<? extends ApartDataInterface> getAll() {
		System.out.println("Service:getAll");
		return repository.findAll();
	}
	
	public ApartDataInterface getById(int id) {
		System.out.println("Service:getById id[" + id + "]");
		return repository.findById(id).orElse(null);
	}
	
	public List<? extends ApartDataInterface> findByNameLike(String find) {
		System.out.println("Service:getByNameLike find[" + find + "]");
		return repository.findByNameLike("%" + find + "%");
	}
	
	/**
	 * 
	 * @param item
	 * @return 保存されたエンティティのID、成功しない場合0
	 */
	public int add(ApartDataInterface item) {
		System.out.println("Service:add [" + item + "]");
		if (item instanceof Apart) {
			Apart savedItem = repository.saveAndFlush((Apart)item);
			return savedItem.getId();
		}
		return 0;
	}
	
	public void delete(ApartDataInterface item) {
		System.out.println("Service:delete[" + item + "]");
		if (item instanceof Apart) {
			repository.delete((Apart) item);
		}
	}
}
