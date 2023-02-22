package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entidades.PedidoEntity;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Integer> {

}
