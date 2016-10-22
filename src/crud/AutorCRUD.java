package crud;

import javax.swing.JPanel;

import core.LibraryFrame;

public class AutorCRUD {

	public static void renderCreateAutor(LibraryFrame libraryFrame) {
		System.out.println("create author");
		JPanel a = (JPanel) libraryFrame.getComponent(1);
		// remove todos os componentes
		a.removeAll();
		// adiciona text fields para nome e id do autor
		// adiciona autor a lista de autores na biblioteca
	}

	public static void renderDeleteAutor(LibraryFrame libraryFrame) {
		System.out.println("delete author");
		// adiciona logica de deletar autor baseado no id
	}

	public static void renderUpdateAutor(LibraryFrame libraryFrame) {
		// adiciona logica de atualizar um autor baseado no id
		System.out.println("update author");
	}

	public static void renderListAutor(LibraryFrame libraryFrame) {
		System.out.println("list author");
		// adiciona logica de listar os autores que estao instanciados na
		// Biblioteca
	}

}
