package models;

import java.util.ArrayList;
import java.util.List;

public class Editora {

	private String nome;
	private Integer id;
	private List<Obra> obras;

	public Editora(String nome, Integer id, List<Obra> obras) {
		this.nome = nome;
		this.id = id;
		this.obras = obras;
	}
	
	public Editora(String nome, Integer id) {
		this(nome, id, new ArrayList<Obra>());
	}

	public void setObras(List<Obra> obras) {
		this.obras = obras;
	}
	
	public List<Obra> getObras() {
		return this.obras;
	}
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
