package ar.edu.unlam.tallerweb1.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Comuna {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	private String nombre;
	
	@OneToMany (fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn (name="idComuna")
	private List<Barrio> barrios; 
	
	public Comuna(Long id, String nombre) {		
		this.id = id;
		this.nombre = nombre;	
	}
	
	public Comuna() {		
	}
			
					
	public List<Barrio> getBarrios() {
		return barrios;
	}
	public void setBarrios(List<Barrio> barrios) {
		this.barrios = barrios;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
		
}