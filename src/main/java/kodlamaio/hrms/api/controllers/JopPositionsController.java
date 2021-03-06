package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPositions")
public class JopPositionsController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JopPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getAll")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
	
}
