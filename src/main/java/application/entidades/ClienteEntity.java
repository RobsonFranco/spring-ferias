package application.entidades;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*As entidades representam as tabelas do banco de dados, informando o que cada objeto vindo dessa tabela possui.*/
/*Notação proveniente de JPA(Java Persistence API) . A anotação @Entity é utilizada para informar que uma classe também é uma entidade. A partir disso, a JPA estabelecerá a ligação entre a entidade e uma tabela de mesmo nome no banco de dados, onde os dados de objetos desse tipo poderão ser persistidos. */
@Entity
@Table(name = "clienteEntity")
public class ClienteEntity {
	
	/*O @Id é uma notação que se coloca no atributo que é a chava primary da tabela. 
	O @GeneratedValue usamos como "Auto-Increment". Possui diversas configurações. 
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nome", length=100)
	private String nome;
	
	/*Um para muitos, no caso, um cliente pode ter muitos pedidos*/
	@OneToMany(mappedBy ="cliente")
	private Set<PedidoEntity> pedidos;

	

	public Set<PedidoEntity> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<PedidoEntity> pedidos) {
		this.pedidos = pedidos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
