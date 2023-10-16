package stardust_solution_a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stardust_solution_a.model.Acesso;
import stardust_solution_a.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	
	public Acesso save(Acesso acesso) {
		
		/*Qualquer tipo de validação*/
		
		return acessoRepository.save(acesso);
	}

}
