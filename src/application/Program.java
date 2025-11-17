package application;

import java.awt.Rectangle;
import java.awt.Rectangle;

import javax.swing.JOptionPane;

public class Program {
	
	public static void main(String[] args) {
		
		entitites.Rectangle rectangle = new entitites.Rectangle(0, 0);
		int numero = 3;
		//"sim" é 0
		do {
			
			Double Largura = Double.parseDouble(JOptionPane.showInputDialog("Largura do retangulo")) ;
			Double Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do retangulo")) ;
			rectangle.resizeHeight(Largura);
			rectangle.resizeWidth(Altura);
			
			JOptionPane.showMessageDialog(null, rectangle);
			
			numero = JOptionPane.showConfirmDialog(null, "Quer continuar?");
			
		} while (numero == 0);
	
		System.out.println("Fim");
	}
		
		
	}


