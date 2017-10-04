package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Calculador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Float Operando1;
	private Float Operando2;
	private Float Resultado;
	private String Operador;
		
	
	public Float getOperando1() {
		return Operando1;
	}

	public void setOperando1(Float operando1) {
		Operando1 = operando1;
	}

	public Float getOperando2() {
		return Operando2;
	}

	public void setOperando2(Float operando2) {
		Operando2 = operando2;
	}

	public Float getResultado() {
		return Resultado;
	}

	public void setResultado(Float resultado) {
		Resultado = resultado;
	}

	public String getOperador() {
		return Operador;
	}

	public void setOperador(String operador) {
		Operador = operador;
	}
			

}