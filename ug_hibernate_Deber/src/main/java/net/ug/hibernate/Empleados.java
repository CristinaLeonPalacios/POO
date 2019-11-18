package net.ug.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleados {
	@Id
	@Column (name="num_emp")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	@Column(name = "fec_naci")
	private String fec_naci;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "fec_contrato")
	private String fec_contrato;
	
	public Empleados() {
			}


	public Empleados(int id, String fec_naci, String nombre, String apellido, String genero, String fec_contrato) {
		super();
		this.id = id;
		this.fec_naci = fec_naci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.fec_contrato = fec_contrato;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFec_naci() {
		return fec_naci;
	}


	public void setFec_naci(String fec_naci) {
		this.fec_naci = fec_naci;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getFec_contrato() {
		return fec_contrato;
	}


	public void setFec_contrato(String fec_contrato) {
		this.fec_contrato = fec_contrato;
	}
	
	
	public void imprimir() {
		System.out.println(nombre+" "+apellido);
	}	
	
}
