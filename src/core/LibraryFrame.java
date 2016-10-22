package core;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import crud.AutorCRUD;
import crud.EditoraCRUD;
import crud.EmprestimoCRUD;
import crud.ExemplarCRUD;
import crud.ObraCRUD;
import crud.UsuarioCRUD;

/**
 * @author Mateus Resende
 */
public class LibraryFrame extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	JMenu autor;
	JMenu editora;
	JMenu emprestimo;
	JMenu exemplar;
	JMenu obra;
	JMenu usuario;

	public LibraryFrame() {
		super(new GridLayout(2, 1));

		add(this.createMenu(), 0);
		add(this.createMainPanel(), 1);
	}

	private Component createMainPanel() {
		JPanel panel = new JPanel();
		JLabel welcome = new JLabel("Bem Vindo");
		welcome.setMinimumSize(new Dimension(400, 400));
		panel.add(welcome);
		return panel;
	}

	protected JMenuBar createMenu() {
		JMenuBar menu = new JMenuBar();
		menu.setMaximumSize(new Dimension(200, 500));
		this.autor = new JMenu("Autor");
		this.autor.setMnemonic(KeyEvent.VK_A);
		menu.add(this.autor);
		this.createAutorMenuItems();
		// this.createMenuItems(this.autor);

		this.editora = new JMenu("Editora");
		this.editora.setMnemonic(KeyEvent.VK_E);
		menu.add(this.editora);
		this.createEditoraMenuItems();

		this.emprestimo = new JMenu("Emprestimo");
		this.emprestimo.setMnemonic(KeyEvent.VK_M);
		menu.add(this.emprestimo);
		this.createEmprestimoMenuItems();

		this.exemplar = new JMenu("Exemplar");
		this.exemplar.setMnemonic(KeyEvent.VK_P);
		menu.add(this.exemplar);
		this.createExemplarMenuItems();

		this.obra = new JMenu("Obra");
		this.obra.setMnemonic(KeyEvent.VK_O);
		menu.add(this.obra);
		this.createObraMenuItems();

		this.usuario = new JMenu("Usuario");
		this.usuario.setMnemonic(KeyEvent.VK_U);
		menu.add(this.usuario);
		this.createUsuarioMenuItems();

		return menu;
	}

	private void createObraMenuItems() {
		JMenuItem createObra = new JMenuItem("Criar Obra");
		createObra.setActionCommand("create_obra");
		createObra.addActionListener(this);
		this.obra.add(createObra);

		JMenuItem listObra = new JMenuItem("Listar Obra");
		listObra.setActionCommand("list_obra");
		listObra.addActionListener(this);
		this.obra.add(listObra);

		JMenuItem updateObra = new JMenuItem("Atualizar Obra");
		updateObra.setActionCommand("update_obra");
		updateObra.addActionListener(this);
		this.obra.add(updateObra);

		JMenuItem deleteObra = new JMenuItem("Deletar Obra");
		deleteObra.setActionCommand("delete_obra");
		deleteObra.addActionListener(this);
		this.obra.add(deleteObra);

	}

	private void createUsuarioMenuItems() {
		JMenuItem createUsuario = new JMenuItem("Criar Usuario");
		createUsuario.setActionCommand("create_usuario");
		createUsuario.addActionListener(this);
		this.usuario.add(createUsuario);

		JMenuItem listUsuario = new JMenuItem("Listar Usuario");
		listUsuario.setActionCommand("list_usuario");
		listUsuario.addActionListener(this);
		this.usuario.add(listUsuario);

		JMenuItem updateUsuario = new JMenuItem("Atualizar Usuario");
		updateUsuario.setActionCommand("update_usuario");
		updateUsuario.addActionListener(this);
		this.usuario.add(updateUsuario);

		JMenuItem deleteUsuario = new JMenuItem("Deletar Usuario");
		deleteUsuario.setActionCommand("delete_usuario");
		deleteUsuario.addActionListener(this);
		this.usuario.add(deleteUsuario);

	}

	protected void createAutorMenuItems() {
		JMenuItem createAutor = new JMenuItem("Criar Autor");
		createAutor.setActionCommand("create_autor");
		createAutor.addActionListener(this);
		this.autor.add(createAutor);

		JMenuItem listAutor = new JMenuItem("Listar Autor");
		listAutor.setActionCommand("list_autor");
		listAutor.addActionListener(this);
		this.autor.add(listAutor);

		JMenuItem updateAutor = new JMenuItem("Atualizar Autor");
		updateAutor.setActionCommand("update_autor");
		updateAutor.addActionListener(this);
		this.autor.add(updateAutor);

		JMenuItem deleteAutor = new JMenuItem("Deletar Autor");
		deleteAutor.setActionCommand("delete_autor");
		deleteAutor.addActionListener(this);
		this.autor.add(deleteAutor);
	}

	protected void createEditoraMenuItems() {
		JMenuItem createEditora = new JMenuItem("Criar Editora");
		createEditora.setActionCommand("create_editora");
		createEditora.addActionListener(this);
		this.editora.add(createEditora);

		JMenuItem listEditora = new JMenuItem("Listar Editora");
		listEditora.setActionCommand("list_editora");
		listEditora.addActionListener(this);
		this.editora.add(listEditora);

		JMenuItem updateEditora = new JMenuItem("Atualizar Editora");
		updateEditora.setActionCommand("update_editora");
		updateEditora.addActionListener(this);
		this.editora.add(updateEditora);

		JMenuItem deleteEditora = new JMenuItem("Deletar Editora");
		deleteEditora.setActionCommand("delete_editora");
		deleteEditora.addActionListener(this);
		this.editora.add(deleteEditora);
	}

	protected void createEmprestimoMenuItems() {
		JMenuItem createEmprestimo = new JMenuItem("Criar emprestimo");
		createEmprestimo.setActionCommand("create_emprestimo");
		createEmprestimo.addActionListener(this);
		this.emprestimo.add(createEmprestimo);

		JMenuItem listEmprestimo = new JMenuItem("Listar emprestimo");
		listEmprestimo.setActionCommand("list_emprestimo");
		listEmprestimo.addActionListener(this);
		this.emprestimo.add(listEmprestimo);

		JMenuItem updateEmprestimo = new JMenuItem("Atualizar emprestimo");
		updateEmprestimo.setActionCommand("update_emprestimo");
		updateEmprestimo.addActionListener(this);
		this.emprestimo.add(updateEmprestimo);

		JMenuItem deleteEmprestimo = new JMenuItem("Deletar emprestimo");
		deleteEmprestimo.setActionCommand("delete_emprestimo");
		deleteEmprestimo.addActionListener(this);
		this.emprestimo.add(deleteEmprestimo);
	}

	protected void createExemplarMenuItems() {
		JMenuItem createExemplar = new JMenuItem("Criar Exemplar");
		createExemplar.setActionCommand("create_exemplar");
		createExemplar.addActionListener(this);
		this.exemplar.add(createExemplar);

		JMenuItem listExemplar = new JMenuItem("Listar Exemplar");
		listExemplar.setActionCommand("list_exemplar");
		listExemplar.addActionListener(this);
		this.exemplar.add(listExemplar);

		JMenuItem updateExemplar = new JMenuItem("Atualizar Exemplar");
		updateExemplar.setActionCommand("update_exemplar");
		updateExemplar.addActionListener(this);
		this.exemplar.add(updateExemplar);

		JMenuItem deleteExemplar = new JMenuItem("Deletar Exemplar");
		deleteExemplar.setActionCommand("delete_exemplar");
		deleteExemplar.addActionListener(this);
		this.exemplar.add(deleteExemplar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand().split("_")[0];
		String model = e.getActionCommand().split("_")[1];

		switch (action) {
		case ("create"):
			this.createModel(model);
			break;

		case ("list"):
			this.listModel(model);
			break;

		case ("update"):
			this.updateModel(model);
			break;

		case ("delete"):
			this.deleteModel(model);
			break;

		}

	}

	public void createModel(String model) {
		switch (model) {
		case ("autor"):
			AutorCRUD.renderCreateAutor(this);
			break;

		case ("editora"):
			EditoraCRUD.renderCreateEditora();
			break;

		case ("emprestimo"):
			EmprestimoCRUD.renderCreateEmprestimo();
			break;

		case ("exemplar"):
			ExemplarCRUD.renderCreateExemplar();
			break;

		case ("obra"):
			ObraCRUD.renderCreateObra();
			break;

		case ("usuario"):
			UsuarioCRUD.renderCreateUsuario();
			break;
		}
	}

	public void listModel(String model) {
		switch (model) {
		case ("autor"):
			AutorCRUD.renderListAutor(this);
			break;

		case ("editora"):
			EditoraCRUD.renderListEditora();
			break;

		case ("emprestimo"):
			EmprestimoCRUD.renderListEmprestimo();
			break;

		case ("exemplar"):
			ExemplarCRUD.renderListExemplar();
			break;

		case ("obra"):
			ObraCRUD.renderListObra();
			break;

		case ("usuario"):
			UsuarioCRUD.renderListUsuario();
			break;
		}
	}

	public void updateModel(String model) {
		switch (model) {
		case ("autor"):
			AutorCRUD.renderUpdateAutor(this);
			break;

		case ("editora"):
			EditoraCRUD.renderUpdateEditora();
			break;

		case ("emprestimo"):
			EmprestimoCRUD.renderUpdateEmprestimo();
			break;

		case ("exemplar"):
			ExemplarCRUD.renderUpdateExemplar();
			break;

		case ("obra"):
			ObraCRUD.renderUpdateObra();
			break;

		case ("usuario"):
			UsuarioCRUD.renderUpdateUsuario();
			break;
		}
	}

	public void deleteModel(String model) {
		switch (model) {
		case ("autor"):
			AutorCRUD.renderDeleteAutor(this);
			break;

		case ("editora"):
			EditoraCRUD.renderDeleteEditora();
			break;

		case ("emprestimo"):
			EmprestimoCRUD.renderDeleteEmprestimo();
			break;

		case ("exemplar"):
			ExemplarCRUD.renderDeleteExemplar();
			break;

		case ("obra"):
			ObraCRUD.renderDeleteObra();
			break;

		case ("usuario"):
			UsuarioCRUD.renderDeleteUsuario();
			break;
		}
	}

}
