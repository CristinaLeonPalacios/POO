package net.ug.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamentos")

public class Departamentos {
	@Id
	@Column (name="num_dept")
	private int id;
	
	@Column(name = "nom_dept")
	private String nombred;

	public Departamentos() {
		
	}

	public Departamentos(int id, String nombred) {
		super();
		this.id = id;
		this.nombred = nombred;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombred() {
		return nombred;
	}

	public void setNombred(String nombred) {
		this.nombred = nombred;
	}
	
	public void imprimir() {
		System.out.println(nombred);
	}
}
