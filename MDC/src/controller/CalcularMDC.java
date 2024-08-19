package controller;

public class CalcularMDC {
	
public CalcularMDC() {
	super();}




public int Mdczin( int fatorA, int fatorB) {
	 if (fatorA==fatorB){
		 return fatorA;
} else {
	 if (fatorA > fatorB){
		 return Mdczin(fatorA- fatorB, fatorB);
	 } else {
         return Mdczin(fatorB- fatorA,fatorA);
}}}}