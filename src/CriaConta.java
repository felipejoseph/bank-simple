import java.util.Scanner;

public class CriaConta {
	static Scanner s = new Scanner(System.in);
 
 
	public static void main(String[] args) {
		System.out.println("Digite o seu nome");
		String titular = s.next();
		System.out.println("ola " + titular +" sua conta foi criada corretamente ");
		Conta primeiraconta = new Conta();
		primeiraconta.saldo = 0;
		System.out.println("Deseja colocar algum valor ? 1-sim / 2-nao");
		
		int resposta = s.nextInt();
		
		if(resposta == 1) {
			System.out.println("por favor digite o valor desejado");
			double valor = s.nextDouble();
			 primeiraconta.saldo += valor;
			 System.out.println("Parabens pelo Deposito");
			
		}else {
			System.out.println("Ok");
		}
		
		
		
		
		
		System.out.println("Seu saldo é de R$ " + primeiraconta.saldo);
		
		
		
	}
}
