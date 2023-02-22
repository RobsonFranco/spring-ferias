package application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.entidades.ClienteEntity;

/*Uma classe anotada com @Repository é responsavel por acessar a base de dados, as tabelas*/
@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {
	
	List<ClienteEntity> findByNomeLike(String nome);
	

}
