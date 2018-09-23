import java.util.Scanner;
public class Principal{
	public static Scanner x = new Scanner(System.in);
	public static void main(String args[]){
		int tam = 5;
		int aux = 0;
		String aux2, aux3, opcao = "";
		System.out.println("Digite o tamanho da sala!");
		tam = Integer.parseInt(x.nextLine());
		Cliente sub = new Cliente("" , "");
		Sala nova = new Sala(tam, sub, new Cliente[tam]);
		while(!opcao.equals("sair")){
			System.out.println("Digite alguma opção ou ajuda");
			opcao = x.nextLine();
			if(opcao.equals("criar")){
				System.out.println("Digite o tamanho da sala!");
				tam = Integer.parseInt(x.nextLine());
				sub = new Cliente("" , "");
				nova = new Sala(tam, sub, new Cliente[tam]);
			}
			String escolha[] = opcao.split(" ");
			switch(escolha[0]){
				case "show":
					System.out.println(nova.toString());
					break;
				case "reservar":
					sub = new Cliente(escolha[1], escolha[2]);
					aux = Integer.parseInt(escolha[3]);
					if(nova.reservar(sub, aux)){
						System.out.println("Reserva efetuada!");
					}
					else{
						System.out.println("Erro : assento já reservado!");
					}
					break;
				case "cancelar":
					sub = new Cliente("" , "");
					if(nova.cancelar(escolha[1], sub)){
						System.out.println("Reserva cancelada com sucesso");
					}
					else{
						System.out.println("Erro: Assento não possui reserva para ser cancelada!");
					}
					break;
				case "criar":
					break;
				case "sair":
					System.out.println("Volte sempre!");
					break;
				case "ajuda":
					System.out.println("       Bem-vindo à central de ajuda! Você tem as seguintes opções:\n        1 - criar -> Para criar a sala de cinema!\n        2 - show -> Para ver os dados da sala!\n        3 - reservar _id _fone _assento -> Para reservar um assento no cinema!\n        4 - cancelar _id -> Para cancelar a reserva de um assento!\n        5 - sair -> Para sair do programa!");
					break;
				default:
					System.out.println("Erro: Opção não encontrada!");
			}
		}

	}
}