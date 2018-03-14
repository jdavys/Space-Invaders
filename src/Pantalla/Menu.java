package Pantalla;
import java.awt.Toolkit;
import java.awt.*;
import javax.swing.*;

import Enemigos.ListaBasic;

import javax.imageio.*;
import java.io.*;


//HileraActual()
//HileraporSalir()
//Nivel()
//CantidadPuntos()
public class Menu {
	public static void main(String[] args) {
		ListaBasic lista = new ListaBasic();
		
		lista.addDato("hola");
		lista.addDato("hola");
		lista.addDato("hola");
		lista.addDato("hola");
		lista.addDato("hola");
		
		for(int i = 0; i<lista.getTamaño();i++) {
			lista.addDato(lista.getDato(i));
		}
		Ventana v = new Ventana();
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Termina la aplicación cuando se cierra
		
		}
	}




class Ventana extends JFrame{
	/**
	 * Generar pantalla y posicionarla
	 */
	
	public Ventana() {
		
		setTitle("Space Invaders");
		setBounds(350,150,700,600);
		Lienzo lienzo = new Lienzo();
		add(lienzo);
		
	}
	
}
class Lienzo extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		/**
		 * tipo de letra
		 */
		Font fuente = new Font("Chalkduster",Font.BOLD,26);
		g.setFont(fuente);
		g.drawString("Jugar", 320,170);
		g.drawString("Estadisticas", 270,250);
		g.drawString("Salir", 325,330);
		
		
		
		
		
	}
}