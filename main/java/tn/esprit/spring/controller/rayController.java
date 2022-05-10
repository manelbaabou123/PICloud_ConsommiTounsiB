package tn.esprit.spring.controller;

import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.entity.ray;

import tn.esprit.spring.service.rayService;

@RestController
@RequestMapping("/ray")
public class rayController {
	@Autowired
	rayService rayService;
	// http://localhost:8089/SpringMVC/ray/retrieve-all-ray
	@GetMapping("/retrieve-all-ray")
	@ResponseBody
	public List<ray> getAllRay() {
	List<ray> listray = rayService.getAllRay();
	return listray;
	}
	// http://localhost:8089/SpringMVC/ray/add-ray
	
		@PostMapping("/add-ray")
		public void create(@RequestBody ray ray)
		{
		 rayService.create(ray);
		
		
		}
		// http://localhost:8089/SpringMVC/ray/DeleteRay/
		@DeleteMapping("/DeleteRay/{idRay}")
		@ResponseBody
		public void Delete(@PathVariable("idRay") long id)
		{
			rayService.deleteRay(id);
		}
		// http://localhost:8089/SpringMVC/ray/update
		 @PutMapping("/update")
		 @ResponseBody
		 public void updateray(@RequestBody ray ray)
		 {
		  rayService.updateray(ray);
		  }


}
