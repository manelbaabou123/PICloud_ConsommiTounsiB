package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.entity.ray;
import tn.esprit.spring.repository.rayRepository;

@Service
public class rayService {
	@Autowired
	rayRepository rayRepository;
	public void create(ray ray){
		rayRepository.save(ray);
	}
	
	public List<ray> getAllRay(){
		List<ray> list = new ArrayList<>();
		
		this.rayRepository.findAll().forEach(i->list.add(i));
		return list;
			
	}
	
	public void deleteRay(Long id) {
	     rayRepository.deleteById(id);
	}
	public ray updateray(ray ray) {
		return rayRepository.save(ray);
	}
	
}
