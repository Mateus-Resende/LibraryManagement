package crud;

import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AutorCRUD {
	
	private Map<String, JPanel> crud;

	public AutorCRUD() {
		this.initializeCrud();
	}
	
	private void initializeCrud() {
		this.crud = new HashMap<>();
		
		crud.put("create", this.renderCreateAutor());
		crud.put("list", this.renderDeleteAutor());
		crud.put("update", this.renderUpdateAutor());
		crud.put("delete", this.renderListAutor());
	}
	

	public Map<String, JPanel> getCrud() {
		return crud;
	}

	private JPanel renderCreateAutor() {
		JPanel create = new JPanel(new GridLayout(2, 2));
		
		JLabel nameLabel = new JLabel("Nome: ");
		create.add(nameLabel);
		
		JTextField nameText = new JTextField(30);
		create.add(nameText);
		
		JLabel idLabel = new JLabel("Id: ");
		create.add(idLabel);
		
		JTextField idText = new JTextField(30);
		create.add(idText);
		
		return create;
	}

	private JPanel renderDeleteAutor() {
		return new JPanel();
	}

	private JPanel renderUpdateAutor() {
		return new JPanel();
	}

	private JPanel renderListAutor() {
		return new JPanel();
	}

}
