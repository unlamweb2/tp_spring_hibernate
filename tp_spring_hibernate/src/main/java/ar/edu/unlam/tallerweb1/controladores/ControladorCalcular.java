package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Calculador;

@Controller
public class ControladorCalcular {
	
	@RequestMapping(path="/calculadora", method = RequestMethod.POST)
	public ModelAndView irACalcular() {
		ModelMap modelo = new ModelMap();
		
		Calculador calculo = new Calculador();
		modelo.put("calculador", calculo);
		
		//modelo.put("mensaje", "hola mundo");
		
		return new ModelAndView("calcular", modelo);
	}

}
