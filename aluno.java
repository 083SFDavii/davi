import java.util.Scanner;

public class aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("informe o salario:");
		double salario = sc.nextDouble();
		
		double salarioDesconto = (salario * 30)/100;
		
		System.out.println("informe o valor da prestacao :");
		double prestacao = sc.nextDouble();
		
		if (salarioDesconto > prestacao) {
			System.out.println( "liberar a prestacao!!!");
			
			}
		else {
			System.out.println(" credito negado, vai catar coquinho");
		}
	
		
		
		
		
		
		
	}

}
