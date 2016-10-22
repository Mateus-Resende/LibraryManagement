package models;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Obra {

	private Integer ano;
	private HashMap<Integer, Autor> autores;
	private Editora editora;
	private String isbn;
	private List<Exemplar> exemplares;

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}

	public Obra(Map<Integer, Autor> autores, Integer ano, Editora editora, String isbn, List<Exemplar> exemplares) {
		this.ano = ano;
		this.autores = new HashMap<Integer, Autor>(5);
		this.addAutores(autores);
		this.editora = editora;
		this.isbn = isbn;
		this.exemplares = exemplares;
	}

	public boolean addAutores(Map<Integer, Autor> autores) {
		if (autores.size() <= 5 && this.autores.size() < 5) {
			this.autores.putAll(autores);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addAutor(Autor autor) {
		Map<Integer, Autor> mapAutor = new HashMap<Integer, Autor>();
		mapAutor.put(autor.getId(), autor);
		return this.addAutores(mapAutor);
	}

	public Integer getAno() {
		return ano;
	}

	public Autor getAutorById(Integer id) {
		return this.autores.get(id);
	}

	public Collection<Autor> getAutores() {
		return autores.values();
	}

	public Editora getEditora() {
		return editora;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
