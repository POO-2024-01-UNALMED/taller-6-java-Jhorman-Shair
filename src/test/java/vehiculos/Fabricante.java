package vehiculos;

import java.util.*;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int ventas;
	static ArrayList<Fabricante> fabricantes=new ArrayList<Fabricante>();
	
	public void masVentas() {
		ventas++;
		this.pais.masVentas();
	}
	
	public static Fabricante fabricaMayorVentas() {
		Pais pais=new Pais("Venezuela");
		Fabricante fabrica=new Fabricante("Juan",pais);
		for (Fabricante i:fabricantes) {
			if (i.ventas>fabrica.ventas) {
				fabrica=i;
			}
		}
		return fabrica;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		fabricantes.add(this);
	}
}
