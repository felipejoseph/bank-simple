import java.util.Scanner;

public class checkbank {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Bem vindo ao Check Bank");
		System.out.println("Selecione a seguir alguma das opções");
		System.out.println("1 - Abertura de conta");
		System.out.print("");
		System.out.println("2 - Sacar");
		System.out.print("");
		System.out.println("3 - Depositar ");
		System.out.print("");
		System.out.println("4 - Transferir ");
		
		int opcao = s.nextInt();
	

		if(opcao == 1) {
			System.out.println("teste de if");
			
		}else if (opcao == 2) {
			System.out.println("opcao 2");
		}else if (opcao == 3) {
			System.out.println("opcao 3");
		}else if (opcao ==4) {
			System.out.println("opcao 4");
		}else {
			System.out.println("Opção invalida ");
		}
}}

