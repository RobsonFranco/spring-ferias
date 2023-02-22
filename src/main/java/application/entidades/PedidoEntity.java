package application.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidoEntity")
public class PedidoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	/*Relacional Muitos para um, no caso Muitos pedidos para um cliente*/
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private ClienteEntity cliente;
	private LocalDate dataPedido;
	@Column(name="total", length = 20, precision = 2)
	private BigDecimal total;
	
	public List<ItemPedidoEntity> getItens() {
		return itens;
	}
	public void setItens(List<ItemPedidoEntity> itens) {
		this.itens = itens;
	}
	@OneToMany(mappedBy ="pedido")
	private List<ItemPedidoEntity> itens;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ClienteEntity getCliente() {
		return cliente;
	}
	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
	
	
	
}
