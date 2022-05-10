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
import com.example.springboot.model.Cart;
import com.example.springboot.repository.CartRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2/")
public class CartController {
	@Autowired
	private CartRepository cartRepository;
	
//get all carts
@GetMapping("/carts")
public List<Cart> getAllCarts(){
	return cartRepository.findAll();
}

//create cart rest api
	@PostMapping("/carts")
	public Cart createCart(@RequestBody Cart cart) {
		return cartRepository.save(cart);
	}
	
	// get employee by id rest api
	@GetMapping("/carts/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable Long id) {
		Cart cart = cartRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Cart not exist with id :" + id));
		return ResponseEntity.ok(cart);
	}
	
	// update employee rest api
	
	@PutMapping("/cartss/{id}")
	public ResponseEntity<Cart> updateCart(@PathVariable Long id, @RequestBody Cart cartDetails){
		Cart cart = cartRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Facturee not exist with id :" + id));
		
		cart.setTotal(cartDetails.getTotal());
		cart.setQuantite(cartDetails.getQuantite());
		cart.setDateCreation(cartDetails.getDateCreation());
	
		
		Cart updatedCart = cartRepository.save(cart);
		return ResponseEntity.ok(updatedCart);
	}
	
	// delete employee rest api
	@DeleteMapping("/carts/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteCart(@PathVariable Long id){
		Cart cart = cartRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Facturee not exist with id :" + id));
		
		cartRepository.delete(cart);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
