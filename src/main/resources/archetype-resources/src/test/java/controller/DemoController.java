package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.DemoResponseDTO;
import exception.NotFoundException;
import service.DemoService;

@RestController
@RequestMapping("/test")
public class DemoController {
	
	private DemoService demoService;
	
    public DemoController(DemoService demoService) {
		this.demoService = demoService;
	}

	@GetMapping("/{id}")
    public ResponseEntity<DemoResponseDTO>findOneDemo(@PathVariable("id") Long id) throws NotFoundException {
        return ResponseEntity.ok(demoService.findById(id));
    }

}
