package com.farmacia.FarmaciaGeneration.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	private String descricao;

	/* mappedBy = "" define o atributo, classe, trabela etc. que estamos mapeando. 
	Cascade, quando estamos falando de relacionamento de tabelas, temos uma integrida que se por acaso excluírmos alguma categoria, receberos alguma mensagem dizendo que a categoria não pdera ser excluída
	se por acaso formaos alterar algo referente a esta categoria, ou seja, todas as postagens que pertencem a esta categoria serão alteradas.*/
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL) 
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}


}