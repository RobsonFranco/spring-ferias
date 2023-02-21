package application.entidades;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class ProdutoEntity {

	
	private Integer id;
	private String descricao;
	private BigDecimal precoUnit;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPrecoUnit() {
		return precoUnit;
	}
	public void setPrecoUnit(BigDecimal precoUnit) {
		this.precoUnit = precoUnit;
	}
	
	
	
}
