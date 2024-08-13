package view;
import controller.MdcController;
public class Principal {
public static void main(String[] args) {
	MdcController mdccontroller = new MdcController();
		int soma = 0;
		int Vet[]= {1,6,7,8,9};
		int tamanho= Vet.length-1;
		int resp = mdccontroller.Mdczin(int fatorA, int fatorB);
		System.out.println(resp);
	}