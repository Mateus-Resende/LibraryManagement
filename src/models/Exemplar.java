package models;

public class Exemplar {

	private Integer codigo;
	private String titulo;

	public Exemplar(Integer codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
