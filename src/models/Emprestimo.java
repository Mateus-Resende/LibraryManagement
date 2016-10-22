package models;

public class Emprestimo {

	private Usuario usuario;
	private Exemplar exemplar;
	private String emprestimo;
	private String devolucao;

	public Emprestimo(Usuario usuario, Exemplar exemplar, String emprestimo, String devolucao) {
		this.usuario = usuario;
		this.exemplar = exemplar;
		this.emprestimo = emprestimo;
		this.devolucao = devolucao;
	}

	public String getDevolucao() {
		return devolucao;
	}

	public String getEmprestimo() {
		return emprestimo;
	}

	public Exemplar getExemplar() {
		return exemplar;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setDevolucao(String devolucao) {
		this.devolucao = devolucao;
	}

	public void setEmprestimo(String emprestimo) {
		this.emprestimo = emprestimo;
	}

	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}

	public void setUsuario(Usuario aluno) {
		this.usuario = aluno;
	}

}
