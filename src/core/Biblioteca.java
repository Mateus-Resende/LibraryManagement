package core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import crud.AutorCRUD;
import crud.EditoraCRUD;
import crud.EmprestimoCRUD;
import crud.ExemplarCRUD;
import crud.ObraCRUD;
import crud.UsuarioCRUD;
import models.Autor;
import models.Editora;
import models.Emprestimo;
import models.Exemplar;
import models.Obra;
import models.Usuario;

public class Biblioteca extends JPanel {

	/**
	 * @author mresende
	 */
	private static final long serialVersionUID = 1L;

	private static List<Autor> autores;
	private static Editora editora;
	private static List<Emprestimo> emprestimo;
	private static List<Exemplar> exemplares;
	private static List<Obra> obras;
	private static List<Usuario> usuarios;

	private AutorCRUD autorCrud;
	private EditoraCRUD editoraCrud;
	private EmprestimoCRUD emprestimoCrud;
	private ExemplarCRUD exemplarCrud;
	private ObraCRUD obraCrud;
	private UsuarioCRUD usuarioCrud;

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("..::Biblioteca::..");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set window in the middle of the screen and size 500x500 px.
		frame.setLocation(500, 500);
		frame.add(new Biblioteca(new SpringLayout()));

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	protected Biblioteca(SpringLayout layout) {
		super(layout);

		autorCrud = new AutorCRUD();

		setPreferredSize(new Dimension(500, 500));

		JList<String> modelsList = Biblioteca.getModelsList();
		modelsList.setSelectedIndex(0);

		add(modelsList);

		layout.putConstraint(SpringLayout.WEST, modelsList, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, modelsList, 5, SpringLayout.NORTH, this);

		JTabbedPane tabbedPane = getTabbedPane(modelsList.getSelectedValue());
		add(tabbedPane);

		layout.putConstraint(SpringLayout.WEST, tabbedPane, 120, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, tabbedPane, 5, SpringLayout.NORTH, this);

		this.addActionListeners(modelsList);
	}

	protected void addActionListeners(JList<String> modelsList) {
		modelsList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				updateTabbedPane(modelsList.getSelectedValue());
			}
		});
	}

	protected JTabbedPane getTabbedPane(String modelName) {
		JTabbedPane pane = new JTabbedPane();

		addTabs(pane, modelName);

		pane.setTabPlacement(JTabbedPane.TOP);
		pane.setPreferredSize(new Dimension(300, 100));
		return pane;
	}

	public void updateTabbedPane(String modelName) {
		JTabbedPane pane = (JTabbedPane) super.getComponent(1);

		pane.removeAll();
		addTabs(pane, modelName);
		pane.setTabPlacement(JTabbedPane.TOP);

		pane.setPreferredSize(new Dimension(300, 100));
	}

	protected void addTabs(JTabbedPane pane, String modelName) {
		Map<String, JPanel> currentModelPanels = this.getCurrentModelPanels(modelName);
		pane.addTab("Criar", currentModelPanels.get("create"));
		pane.addTab("Atualizar", makeTextPanel("Panel update " + modelName));
		pane.addTab("Listar", makeTextPanel("Panel list " + modelName));
		pane.addTab("Deletar", makeTextPanel("Panel delete " + modelName));
	}

	protected JComponent makeTextPanel(String text) {
		JPanel panel = new JPanel(false);
		JLabel filler = new JLabel(text);
		filler.setHorizontalAlignment(JLabel.CENTER);
		panel.setLayout(new GridLayout(1, 1));
		panel.setPreferredSize(new Dimension(100, 100));
		panel.add(filler);
		return panel;
	}

	protected static JList<String> getModelsList() {
		String[] models = new String[6];
		models[0] = "Autor";
		models[1] = "Editora";
		models[2] = "Emprestimo";
		models[3] = "Exemplar";
		models[4] = "Obra";
		models[5] = "Usuario";

		JList<String> list = new JList<String>(models);
		list.setPreferredSize(new Dimension(100, 480));
		list.setBackground(Color.WHITE);
		return list;
	}

	protected Map<String, JPanel> getCurrentModelPanels(String modelName) {
		Map<String, JPanel> currentModel = null;

		switch (modelName) {
		case "Autor":
			currentModel = this.autorCrud.getCrud();
			break;

		case "Editora":
			break;

		case "Emprestimo":
			break;

		case "Exemplar":
			break;

		case "Obra":
			break;

		case "Usuario":
			break;
		}

		return currentModel;
	}

	protected JPanel getAutorModelPane(String action) {
		return this.autorCrud.getCrud().get(action);
	}

}
