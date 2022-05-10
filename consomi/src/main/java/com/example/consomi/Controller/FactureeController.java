package com.example.consomi.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.Facturee;
import com.example.springboot.repository.FactureeRepository;




@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class FactureeController {
	@Autowired
	private FactureeRepository factureeRepository;
	
//get all facturees
@GetMapping("/facturees")
public List<Facturee> getAllFacturees(){
	return factureeRepository.findAll();
}

//create facturee rest api
	@PostMapping("/facturees")
	public Facturee createFacturee(@RequestBody Facturee facturee) {
		return factureeRepository.save(facturee);
	}
	
	// get employee by id rest api
	@GetMapping("/facturees/{id}")
	public ResponseEntity<Facturee> getEmployeeById(@PathVariable Long id) {
		Facturee facturee = factureeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Facturee not exist with id :" + id));
		return ResponseEntity.ok(facturee);
	}
	
	// update employee rest api
	
	@PutMapping("/facturees/{id}")
	public ResponseEntity<Facturee> updateEmployee(@PathVariable Long id, @RequestBody Facturee factureeDetails){
		Facturee facturee = factureeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Facturee not exist with id :" + id));
		
		facturee.setTotal(factureeDetails.getTotal());
		facturee.setDate(factureeDetails.getDate());
	
		
		Facturee updatedFacturee = factureeRepository.save(facturee);
		return ResponseEntity.ok(updatedFacturee);
	}
	
	// delete employee rest api
	@DeleteMapping("/facturees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteFacturee(@PathVariable Long id){
		Facturee facturee = factureeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Facturee not exist with id :" + id));
		
		factureeRepository.delete(facturee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	
}
