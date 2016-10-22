package core;

import java.util.List;

import javax.swing.JFrame;

import models.Autor;
import models.Editora;
import models.Emprestimo;
import models.Exemplar;
import models.Obra;
import models.Usuario;

public class Biblioteca {

	private static List<Autor> autores;
	private static Editora editora;
	private static List<Emprestimo> emprestimo;
	private static List<Exemplar> exemplares;
	private static List<Obra> obras;
	private static List<Usuario> usuarios;

	public static void main(String args[]) {
		createAndShowGUI();
	}

	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("..::Biblioteca::..");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set window in the middle of the screen and size 500x500 px.
		frame.setLocationRelativeTo(null);

		// Add content to the window.
		frame.add(new LibraryFrame());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public static void setAutores(List<Autor> autores) {
		Biblioteca.autores = autores;
	}

	public static Editora getEditora() {
		return editora;
	}

	public static void setEditora(Editora editora) {
		Biblioteca.editora = editora;
	}

	public static List<Emprestimo> getEmprestimo() {
		return emprestimo;
	}

	public static void setEmprestimo(List<Emprestimo> emprestimo) {
		Biblioteca.emprestimo = emprestimo;
	}

	public static List<Exemplar> getExemplares() {
		return exemplares;
	}

	public static void setExemplares(List<Exemplar> exemplares) {
		Biblioteca.exemplares = exemplares;
	}

	public static List<Obra> getObras() {
		return obras;
	}

	public static void setObras(List<Obra> obras) {
		Biblioteca.obras = obras;
	}

	public static List<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(List<Usuario> usuarios) {
		Biblioteca.usuarios = usuarios;
	}

}
