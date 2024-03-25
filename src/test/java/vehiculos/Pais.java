package vehiculos;

import java.util.*;

public class Pais {
	private String nombre;
	public static ArrayList<Pais> paises=new ArrayList<Pais>();
	private int ventas;
	
	public static Pais paisMasVendedor() {
		Pais pais=new Pais("Venezuela");
		for (Pais i:paises) {
			if (i.ventas>pais.ventas) {
				pais=i;
			}
		}
		return pais;
	}
	
	public void masVentas() {
		ventas++;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais(String nombre) {
		this.nombre=nombre;
		paises.add(this);
	}
	
}
