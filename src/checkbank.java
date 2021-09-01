import java.util.Scanner;
import java.time.LocalDateTime;

//@version 0.0.3
public class checkbank {
	static Scanner s = new Scanner(System.in);
	

	public static void main(String[] args) throws InterruptedException {
		Boolean isRunning = Boolean.TRUE;
		Conta primeiraconta = new Conta();
		
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
				System.out.println("olá qual o valor você deseja sacar ? ");
				double saqueConta = s.nextDouble();
					if(primeiraconta.getSaldo() >= saqueConta) {
						primeiraconta.setSaldo(primeiraconta.getSaldo() - saqueConta);
						System.out.println("=================================================");
						System.out.println("Transação realizada com sucesso");
						System.out.println("Data da transação: " + LocalDateTime.now());
						System.out.println("Valor do saque " + saqueConta);;
						System.out.println("Saldo atual da sua conta " + primeiraconta.getSaldo());
						System.out.println("=================================================");
					}else {
						System.out.println("O valor para saque excede o limite disponivel");
						System.out.println("O valor disponivel para saque é de R$:"+primeiraconta.getSaldo());
					}
					System.out.println("");
					System.out.println("Deseja retornar ao menu ?");
					System.out.println("1-sim / 2-nao");
					int resposta21 = s.nextInt();
					if(resposta21 == 1) {
						System.out.println("Carregando...");
						Thread.sleep(3000);
						isRunning = Boolean.TRUE;
						System.out.println("");
					}else {
						System.out.println("até logo");
						isRunning = Boolean.FALSE;
					}

				break;
			case 3:
				System.out.println("Olá qual o valor que você deseja depositar? ");
				double deposita = s.nextDouble();
				System.out.println("O valor digitado é de R$ " + deposita);
				System.out.println("Você confirma o valor do deposito ?");
				System.out.println("1-sim / 2-nao");
				int respostaDeposito = s.nextInt();
				if(respostaDeposito == 1) {
					primeiraconta.depositar(deposita);
					
					System.out.println("=================================================");
					System.out.println("Transação realizada com sucesso");
					System.out.println("Data da transação: " + LocalDateTime.now());
					System.out.println("Valor do deposito " + deposita);;
					System.out.println("Saldo atual da sua conta " + primeiraconta.getSaldo());
					System.out.println("=================================================");
					
				}else {
					System.out.println("Deposito não realizado");
					System.out.println("Retornando ao Menu");
					Thread.sleep(3000);
				}
				System.out.println("");
				System.out.println("Deseja retornar ao menu ?");
				System.out.println("1-sim / 2-nao");
				int resposta31 = s.nextInt();
				if(resposta31 == 1) {
					System.out.println("Carregando...");
					Thread.sleep(3000);
					isRunning = Boolean.TRUE;
					System.out.println("");
				}else {
					System.out.println("até logo");
					isRunning = Boolean.FALSE;
				}
				
				break;
			case 4:
				//transfere
				System.out.println("Bem vindo a area de transferências");
				System.out.println("Por favor digite o valor desejado:");
				double digitaValor = s.nextDouble();
				System.out.println("o valor digitado foi de R$ " + digitaValor);
				System.out.println("Voce confirma esse valor ?");
				System.out.println("1-sim / 2-nao");
				int resposta41 = s.nextInt();
				if(resposta41 ==1) {
					System.out.println("Digite a Conta de destino sem digito");
					int destino = s.nextInt();
					System.out.println("Agora digite o nome :");
					String nomeDestino = s.next();
					System.out.println("=================================================");
					System.out.println("Você confirma os dados a seguir?");
					System.out.println("Nome do favorecido:" + nomeDestino);
					System.out.println("Numero da conta destino: "+ destino+"-0");
					System.out.println("Valor a ser transferido: R$" +digitaValor);
					System.out.println("=================================================");
					System.out.println("1-sim / 2-nao");
					int resposta42 = s.nextInt();
					if(resposta42 == 1) {
						primeiraconta.transferir(digitaValor);
						System.out.println("=================================================");
						System.out.println("Transação realizada com sucesso");
						System.out.println("Data da transação: " + LocalDateTime.now());
						System.out.println("Valor da Transfêrencia " + digitaValor);;
						System.out.println("Saldo atual da sua conta " + primeiraconta.getSaldo());
						System.out.println("=================================================");
						
					}else {
						System.out.println("Deposito não realizado");
						System.out.println("Retornando ao Menu");
						Thread.sleep(3000);
					}
					
				}else {
					System.out.println("até logo");
					isRunning = Boolean.FALSE;
				}
				
				
				break;
			default:
				System.out.println("Opção invalida ");
			}
		}
	}
}
