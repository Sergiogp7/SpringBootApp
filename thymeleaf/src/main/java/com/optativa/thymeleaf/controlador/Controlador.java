package com.optativa.thymeleaf.controlador;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.optativa.thymeleaf.entidad.*;

@Controller
public class Controlador {
	@GetMapping("/saludo")
	public String saludo(Model modelo) {
		System.out.println("###Entra en /saludo");
		String name = "Sergio";
		modelo.addAttribute("nombre", name);
		return "saludo";
	}

	@GetMapping("/productos")
	public String listado(Model model) {
		List<Producto> listaProductos = new ArrayList<Producto>();
		// String nombre, int precio, String categoria
		Producto p1 = new Producto("Pan", 1, "Alimentacion");
		Producto p2 = new Producto("PC", 3000, "Componentes");
		listaProductos.add(p1);
		listaProductos.add(p2);
		model.addAttribute("listaProductos", listaProductos);
		return "lista";
	}
}