package controller;

public class MdcController {
	
public MdcCotroller() {
	super();}



 public int Mdczin(int fatorA, int fatorB) {
	 if (fatorA==fatorB){
		 return fatorA;
 } else {
		 if (fatorA>fatorB){
			 return Mdczin(fatorA- fatorB, fatorB);
		 }
		 else {
			 if (fatorA>fatorB){
				 return Mdczin(fatorA, fatorB- fatorA);
		 }
	 }
 }
 }
}


 

