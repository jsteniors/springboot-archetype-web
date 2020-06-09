package service;

import org.springframework.stereotype.Service;

import domain.DemoResponseDTO;
import exception.NotFoundException;
import repository.DemoRepository;

@Service
public class DemoService {
	
	private DemoRepository demoRepository;
	
	public DemoService(DemoRepository demoRepository) {
		this.demoRepository = demoRepository;
	}

	public DemoResponseDTO findById(Long id) throws NotFoundException {
		return demoRepository.findById(id)
						.map(entity -> new DemoResponseDTO(entity.getId()))
						.orElseThrow(() -> new NotFoundException());
	}
	
}
