package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entidades.ItemPedidoEntity;

public interface ItemPedidoRepository extends JpaRepository<ItemPedidoEntity, Integer> {

}
