package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entidades.ProdutoEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer> {

}
