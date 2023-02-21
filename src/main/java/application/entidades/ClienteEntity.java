package application.entidades;

import javax.persistence.Entity;

/*As entidades representam as tabelas do banco de dados, informando o que cada objeto vindo dessa tabela possui.*/
/*Notação proveniente de JPA(Java Persistence API) . A anotação @Entity é utilizada para informar que uma classe também é uma entidade. A partir disso, a JPA estabelecerá a ligação entre a entidade e uma tabela de mesmo nome no banco de dados, onde os dados de objetos desse tipo poderão ser persistidos. */
@Entity
public class ClienteEntity {
	private Integer id;
	private String nome;

	
	
	
	
	
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
