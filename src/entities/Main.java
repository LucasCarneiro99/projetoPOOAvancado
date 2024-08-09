package entities;

import java.util.*;

public class Main {
	
	public void mostrarConteudo() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usuario = "adm";
		String senha = "123";
		Scanner sc = new Scanner(System.in);
		int numeroEscolhido = 0;
		
		/*Fluxo:
		 * mostrar menu principal,
		 * caso aperte 1 - mostrar o menu principal
		 * caso aperte 2 - listar conteudo
		 * caso aperte 4 finalizar programa
		 *
		 *
		 */
		
		
		
		do{
			System.out.println("Menu Principal: ");
			System.out.println("1. Login: Fazer login no sistema.");
			System.out.println("2. Listar Conteúdos: Listar os conteúdos.");		
			System.out.println("3. Sair: Sair do sistema.");
			
			numeroEscolhido = sc.nextInt();
			
			switch(numeroEscolhido){
				case 1:
					System.out.println("Digite o usuário");
					String temp_usuario = sc.next();
					System.out.println("Digite a senha");
					String temp_senha = sc.next();
					
					break;
				case 2:
					break;
				case 3:
					break;
				default:System.out.println("Opcao Invalida!");
			};
		}while(numeroEscolhido != 4);
		
		
		sc.close();
	}

}
