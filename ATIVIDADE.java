import java.util.Scanner;

public class a0005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner ( System.in);	 	
	System.out.println("informe o tipo do conbustivel" );
	
	 String combustivel = sc.nextLine ();
	 System.out.println("informe a capacidade do tanque" );
	    double capacidadeTanque= sc.nextDouble();
	if	(combustivel.equals("G")) {
        double valorPago= capacidadeTanque * 2.79; 
   System.out.println(" o valor pago na alcool :" + valorPago);
  
   }else {
	   
	Double valorPago = capacidadeTanque * 2.79;
	System.out.println("o valor pago: " + valorPago);
		
		
		
	}
	}

}
