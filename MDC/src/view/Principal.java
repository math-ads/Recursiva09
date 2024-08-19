package view;
import javax.swing.JOptionPane;

import controller.CalcularMDC;
public class Principal {
public static void main(String[] args) {
	CalcularMDC mdczin = new CalcularMDC();
	    int fatorA= Integer.parseInt(JOptionPane.showInputDialog("Insira primeiro valor"));
	    int fatorB= Integer.parseInt(JOptionPane.showInputDialog("Insira segundo valor"));
		int resp = mdczin.Mdczin(fatorA, fatorB);
		System.out.println(resp);
	}}