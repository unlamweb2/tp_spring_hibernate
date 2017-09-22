package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Farmacia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String nombre;
	private String telefono;
	private String diaDeTurno;
	
	@ManyToOne (fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn (name="IdDireccion")
	private Direccion  direccion;	
	
	@OneToOne (fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn (name="IdPunto")
	private Punto punto;
	
	public Farmacia(Long id, String nombre, String telefono, String diaDeTurno) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.diaDeTurno = diaDeTurno;	
	}
	
	public Farmacia() {		
	}
	
	
	public Punto getPunto() {
		return punto;
	}
	public void setPunto(Punto punto) {
		this.punto = punto;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiaDeTurno() {
		return diaDeTurno;
	}
	public void setDiaDeTurno(String diaDeTurno) {
		this.diaDeTurno = diaDeTurno;
	}
			
		
}