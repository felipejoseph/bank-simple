import java.util.Scanner;

public class checkbank {
	static Scanner s = new Scanner(System.in);
	

	public static void main(String[] args) throws InterruptedException {
		Boolean isRunning = Boolean.TRUE;
		
		
			System.out.println("Bem vindo ao Check Bank");
			while (isRunning) {
			System.out.println("Selecione a seguir alguma das opções");
			System.out.println("1 - Abertura de conta");
			System.out.print("");
			System.out.println("2 - Sacar");
			System.out.print("");
			System.out.println("3 - Depositar ");
			System.out.print("");
			System.out.println("4 - Transferir ");

			int opcao = s.nextInt();
			Conta primeiraconta = new Conta();

			switch (opcao) {
			case 1:
				System.out.println("Digite o seu nome");
				String titular = s.next();
				System.out.println("ola " + titular + " sua conta foi criada corretamente ");

				System.out.println("Deseja colocar algum valor ? 1-sim / 2-nao");

				int resposta = s.nextInt();

				if (resposta == 1) {
					System.out.println("por favor digite o valor desejado");
					double valor = s.nextDouble();
					primeiraconta.setSaldo(primeiraconta.getSaldo() + valor);
					System.out.println("Parabens pelo Deposito");

				} else {
					System.out.println("Ok");
					
				}

				System.out.println("Seu saldo atual é de R$ " + primeiraconta.getSaldo());
				System.out.println("");
				System.out.println("Deseja retornar ao menu ?");
				System.out.println("1-sim / 2-nao");
				int resposta2 = s.nextInt();
				if(resposta2 == 1) {
					
					System.out.println("Carregando...");
					Thread.sleep(3000);
					isRunning = Boolean.TRUE;
					System.out.println("");
				}else {
					System.out.println("até logo");
					isRunning = Boolean.FALSE;
				}
				
				break;

			case 2:
				System.out.println("opcao 2");
				System.out.println("olá qual o valor você deseja sacar ? ");

				break;
			case 3:
				System.out.println("opcao 3");
				break;
			case 4:
				System.out.println("opcao 4");
				break;
			default:
				System.out.println("Opção invalida ");
			}
		}
	}
}
