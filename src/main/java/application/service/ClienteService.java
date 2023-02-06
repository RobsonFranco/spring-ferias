package application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.repository.ClienteRepository;

/*Uma classe anotava com @Service possui as regras de negócio, as validações.*/
@Service
public class ClienteService {
	
	/*Instanciamos um objeto da classe de repositorio em serviço para que as operações sejam realizadas e o objeto possa sofrer modificações*/
	@Autowired
	private ClienteRepository repositorioCliente;

}
