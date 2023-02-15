package DIO;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero; //Modifiquei o Tipo para utilizar o método matches
		String nomeCliente;
		int[] agencia = new int[4];
		double saldo = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao sistema via terminal\n");
		
		System.out.print("Primeiramente, digite o nome do Cliente: ");
		nomeCliente = sc.nextLine();
		
		System.out.print("Digite o numero da conta: ");
		numero = sc.nextLine();
		
			if(numero.matches("\\d+"))
			{
				int numero2 = Integer.parseInt(numero);
			}else {
				System.out.println("A entrada não é um número válido.");
			}
	
		System.out.println("\nAgência será gerado automaticamente, Só um momento...");
		Random random = new Random();
		
		for(int i = 0; i < 4; i++) {
			
			agencia[i] = random.nextInt(1000);
			if(i < 4) {
				agencia[4-1] += agencia[i];
			}
		}
		
		String numeroString = Integer.toString(agencia[3]);
		String agenciaFormatada = numeroString.substring(0,3) + "-" + numeroString.substring(2);  ;
		
		System.out.print("E por fim, Digite o saldo do cliente: ");
		saldo = sc.nextDouble();
		
		if(saldo < 0.0) {
			System.out.println("Deposito inválido");
			saldo = 0.0;
		}else {
			saldo = saldo;
		
		}
		
		
		System.out.printf(" \n Seja bem vindo %s, Obrigado(a) por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.", nomeCliente, agenciaFormatada, numero, saldo); 
		
		sc.close();

	}

}
