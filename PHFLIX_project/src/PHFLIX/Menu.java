package PHFLIX;

import java.util.Scanner;

public class Menu {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static Scanner leitorNumb = new Scanner(System.in);
	
	public static Filmes NomeFilme = new Filmes();
	
	public static FilmesFavoritos filmes = new FilmesFavoritos();
	
	public static CriticaPessoal critica = new CriticaPessoal();
	
	public static ContaCliente conta = new ContaCliente(); 
	
	public static FilmesHeroi lista1 = new FilmesHeroi("Homem aranha(2002)", "Batman: Cavaleiro das trevas", "Esquadrao Suicida 2", "Homem de ferro(2008)", "Batman: Cavaleiro das trevas ressurge");
	
	public static FilmesFiccao lista2 = new FilmesFiccao("Interestelar", "Jurassic Park", "De volta pro futuro", "Matrix", "Sinais");

	public static FilmesAcao lista3 = new FilmesAcao("Kill Bill", "Anonimo", "John Wick", "O Resgate", "Trem Bala");
	
	public static FilmesComedia lista4 = new FilmesComedia("Todo mundo em Panico 1","Todo mundo em Panico 3","Super Heroi - o Filme","As branquelas","American Pie 1");
	
	public static FilmesTerror lista5 = new FilmesTerror("O Exorcista", "Invocacao do mal", "Hereditario", "Evil Dead(2023)", "Fale Comigo");
	
	
	
	public static void FilmeHeroi() {
		

		System.out.printf("-------------------------- \n");
		System.out.printf("RECOMENDADOS: FILMES DE HEROIS \n");
		System.out.printf("-------------------------- \n");
		System.out.println();
		System.out.println("- "+lista1.getFilme1());
		System.out.println("- "+lista1.getFilme2());
		System.out.println("- "+lista1.getFilme3());
		System.out.println("- "+lista1.getFilme4());
		System.out.println("- "+lista1.getFilme5());
		System.out.println();
		System.out.printf("Escolha seu filme digitando o nome dele: \n");
		lista1.setNomeFilme(leitor.nextLine().trim().toLowerCase());
		NomeFilme.setNomeFilme(lista1.getNomeFilme());
		System.out.println();
		
		
		if(lista1.getNomeFilme().equalsIgnoreCase(lista1.getFilme1().toLowerCase())) {
			System.out.println();
			lista1.Sinopse();
			Voltar();

		}
		else if(lista1.getNomeFilme().equalsIgnoreCase(lista1.getFilme2().toLowerCase())) {
			System.out.println();
			lista1.Sinopse();
			Voltar();

			
		}
		else if(lista1.getNomeFilme().equalsIgnoreCase(lista1.getFilme3().toLowerCase())) {
			System.out.println();
			lista1.Sinopse();
			Voltar();

			
		}
		else if(lista1.getNomeFilme().equalsIgnoreCase(lista1.getFilme4().toLowerCase())) {
			System.out.println();
			lista1.Sinopse();
			Voltar();

			
		}
		else if(lista1.getNomeFilme().equalsIgnoreCase(lista1.getFilme5().toLowerCase())) {
			System.out.println();
			lista1.Sinopse();
			Voltar();

			
		}
		else {
			System.out.printf("Filme indisponivel, Escolha Novamente!! \n");
			System.out.println();
			FilmeHeroi();
		}
		
		System.out.println();
	
	
	}
	
	public static void FilmeSciFi() {
		

		System.out.printf("------------------------------------- \n");
		System.out.printf("RECOMENDADOS: FILMES DE FICCAO CIENTIFICA \n");
		System.out.printf("------------------------------------- \n");
		System.out.println();
		System.out.println("- "+lista2.getFilme1());
		System.out.println("- "+lista2.getFilme2());
		System.out.println("- "+lista2.getFilme3());
		System.out.println("- "+lista2.getFilme4());
		System.out.println("- "+lista2.getFilme5());
		System.out.println();
		System.out.printf("Escolha seu filme digitando o nome dele: \n");
		lista2.setNomeFilme(leitor.nextLine().trim().toLowerCase());
		NomeFilme.setNomeFilme(lista2.getNomeFilme());
		System.out.println();
		
		if(lista2.getNomeFilme().equalsIgnoreCase(lista2.getFilme1().toLowerCase())) {
			System.out.println();
			lista2.Sinopse();
			Voltar();

			
		}
		else if(lista2.getNomeFilme().equalsIgnoreCase(lista2.getFilme2().toLowerCase())) {
			System.out.println();
			lista2.Sinopse();
			Voltar();

			
		}
		else if(lista2.getNomeFilme().equalsIgnoreCase(lista2.getFilme3().toLowerCase())) {
			System.out.println();
			lista2.Sinopse();
			Voltar();

			
		}
		else if(lista2.getNomeFilme().equalsIgnoreCase(lista2.getFilme4().toLowerCase())) {
			System.out.println();
			lista2.Sinopse();
			Voltar();

			
		}
		else if(lista2.getNomeFilme().equalsIgnoreCase(lista2.getFilme5().toLowerCase())) {
			System.out.println();
			lista2.Sinopse();
			Voltar();

			
		}	
		else {
			System.out.printf("Filme indisponivel, Escolha Novamente!! \n");
			System.out.println();
			FilmeSciFi();
		}
		
		System.out.println();
	
	}
	
	public static void FilmeAcao() {
		
		
		System.out.printf("------------------------- \n");
		System.out.printf("RECOMENDADOS: FILMES DE ACAO \n");
		System.out.printf("------------------------- \n");
		System.out.println();
		System.out.println("- "+lista3.getFilme1());
		System.out.println("- "+lista3.getFilme2());
		System.out.println("- "+lista3.getFilme3());
		System.out.println("- "+lista3.getFilme4());
		System.out.println("- "+lista3.getFilme5());
		System.out.println();
		System.out.printf("Escolha seu filme digitando o nome dele: \n");
		lista3.setNomeFilme(leitor.nextLine().trim().toLowerCase());
		NomeFilme.setNomeFilme(lista3.getNomeFilme());
		System.out.println();
		
		if(lista3.getNomeFilme().equalsIgnoreCase(lista3.getFilme1().toLowerCase())) {
			System.out.println();
			lista3.Sinopse();
			Voltar();
		}
		else if(lista3.getNomeFilme().equalsIgnoreCase(lista3.getFilme2().toLowerCase())) {
			System.out.println();
			lista3.Sinopse();
			Voltar();
			
		}
		else if(lista3.getNomeFilme().equalsIgnoreCase(lista3.getFilme3().toLowerCase())) {
			System.out.println();
			lista3.Sinopse();
			Voltar();
			
		}
		else if(lista3.getNomeFilme().equalsIgnoreCase(lista3.getFilme4().toLowerCase())) {
			System.out.println();
			lista3.Sinopse();
			Voltar();
			
		}
		else if(lista3.getNomeFilme().equalsIgnoreCase(lista3.getFilme5().toLowerCase())) {
			System.out.println();
			lista3.Sinopse();
			Voltar();
			
		}
		else {
			System.out.printf("Filme indisponivel, Escolha Novamente!! \n");
			System.out.println();
			FilmeAcao();
		}
		
		System.out.println();
	
	}
	
	public static void FilmeComedia() {
		
		
		System.out.printf("--------------------------- \n");
		System.out.printf("RECOMENDADOS: FILMES DE COMEDIA \n");
		System.out.printf("--------------------------- \n");
		System.out.println();
		System.out.println("- "+lista4.getFilme1());
		System.out.println("- "+lista4.getFilme2());
		System.out.println("- "+lista4.getFilme3());
		System.out.println("- "+lista4.getFilme4());
		System.out.println("- "+lista4.getFilme5());
		System.out.println();
		System.out.printf("Escolha seu filme digitando o nome dele: \n");
		lista4.setNomeFilme(leitor.nextLine().trim().toLowerCase());
		NomeFilme.setNomeFilme(lista4.getNomeFilme());
		System.out.println();
		
		if(lista4.getNomeFilme().equalsIgnoreCase(lista4.getFilme1().toLowerCase())) {
			System.out.println();
			lista4.Sinopse();
			Voltar();

		}
		else if(lista4.getNomeFilme().equalsIgnoreCase(lista4.getFilme2().toLowerCase())) {
			System.out.println();
			lista4.Sinopse();
			Voltar();

		}
		else if(lista4.getNomeFilme().equalsIgnoreCase(lista4.getFilme3().toLowerCase())) {
			System.out.println();
			lista4.Sinopse();
			Voltar();

		}
		else if(lista4.getNomeFilme().equalsIgnoreCase(lista4.getFilme4().toLowerCase())) {
			System.out.println();
			lista4.Sinopse();
			Voltar();

		}
		else if(lista4.getNomeFilme().equalsIgnoreCase(lista4.getFilme5().toLowerCase())) {
			System.out.println();
			lista4.Sinopse();
			Voltar();

		}
		else {
			System.out.printf("Filme indisponivel, Escolha Novamente!! \n");
			System.out.println();
			FilmeComedia();
		}
		
		System.out.println();
		
	}
	
	public static void FilmeTerror() {
		
		
		System.out.printf("-------------------------- \n");
		System.out.printf("RECOMENDADOS: FILMES DE TERROR \n");
		System.out.printf("-------------------------- \n");
		System.out.println();
		System.out.println("- "+lista5.getFilme1());
		System.out.println("- "+lista5.getFilme2());
		System.out.println("- "+lista5.getFilme3());
		System.out.println("- "+lista5.getFilme4());
		System.out.println("- "+lista5.getFilme5());
		System.out.println();
		System.out.printf("Escolha seu filme digitando o nome dele: \n");
		lista5.setNomeFilme(leitor.nextLine().trim().toLowerCase());
		NomeFilme.setNomeFilme(lista5.getNomeFilme());
		System.out.println();
		
		if(lista5.getNomeFilme().equalsIgnoreCase(lista5.getFilme1().toLowerCase())) {
			System.out.println();
			lista5.Sinopse();
			Voltar();
		}
		else if(lista5.getNomeFilme().equalsIgnoreCase(lista5.getFilme2().toLowerCase())) {
			System.out.println();
			lista5.Sinopse();
			Voltar();
		}
		else if(lista5.getNomeFilme().equalsIgnoreCase(lista5.getFilme3().toLowerCase())) {
			System.out.println();
			lista5.Sinopse();
			Voltar();
		}
		else if(lista5.getNomeFilme().equalsIgnoreCase(lista5.getFilme4().toLowerCase())) {
			System.out.println();
			lista5.Sinopse();
			Voltar();
		}
		else if(lista5.getNomeFilme().equalsIgnoreCase(lista5.getFilme5().toLowerCase())) {
			System.out.println();
			lista5.Sinopse();
			Voltar();
		}
		else {
			System.out.printf("Filme indisponivel, Escolha Novamente!! \n");
			System.out.println();
			FilmeTerror();
		}
		
		System.out.println();
		
	}
	
	
	
	public static void Imprimir() {
		
		if(conta.getNome()==null && conta.getEmail()==null && conta.getSenha()==null) {
			System.out.println("Cadastro nao existente!!");
			System.out.println();
		}
		else {
			System.out.println();
			conta.ImprimirDados(NomeFilme);
			System.out.println();
			System.out.printf("SEU RANKING FAVORITO: \n");
			filmes.ImprimirFavoritos();
			System.out.println();
			critica.ImprimirCritica(conta.getNome());
		}
		System.out.println();
			
	}
	
	public static void Recomendacoes() {
		int movie;
		System.out.printf("Informe sua opcao de filme: \n 1-Filmes de Heroi \n 2-Filmes de Ficcao Cientifica \n 3-Filmes de Acao \n 4-Filmes de Comedia \n 5-Filmes de Terror \n 0-Voltar pro Menu \n ");
		movie = leitor.nextInt();
		leitor.nextLine();
		if(movie==1) {
			FilmeHeroi();
		}
		else if(movie==2) {
			FilmeSciFi();	
		}
		else if(movie==3) {
			FilmeAcao();	
		}
		else if(movie==4) {
			FilmeComedia();
		}
		else if(movie==5) {
			FilmeTerror();
		}
		else {
			System.out.println();
			System.out.printf("Voltando...\n");
			System.out.println();
			
		}
		
	}
	
	
	public static void Voltar() {
		
		int opcao;
		System.out.printf("DIGITE: \n 1-Voltar para Recomendacoes \n 0-Voltar pro Menu \n ");
		opcao = leitorNumb.nextInt();
		switch(opcao) {
		case 1:
			System.out.println();
			Recomendacoes();
			break;
		case 0:
			System.out.println("Voltando...");
			System.out.println();
			break;
		default:
			System.out.printf("opcao invalida!! \n");
			return;
		}
	}
	
	

	public static void Menu() {
		
		int opcao;
		System.out.printf("------------------------- \n");
		System.out.printf("SEJA BEM VINDO A PHFLIX!! \n");
		System.out.printf("------------------------- \n");
		System.out.println();
		do {
			System.out.printf("MENU: \n 1-FAZER LOGIN \n 2-RECOMENDACOES DE FILME \n 3-FILMES FAVORITOS \n 4-CRITICA PESSOAL \n 5-MOSTRAR DADOS \n 0-SAIR \n ");
			opcao = leitorNumb.nextInt();
			System.out.println();
			
			switch(opcao) {
			
			case 1:
				conta.Cadastro();;
				break;
			case 2:
				Recomendacoes();
				break;
			case 3: 
				filmes.Favoritos();
				break;
			case 4:
				critica.Critica();
				break;
			case 5:
				Imprimir();
				break;
			case 0:
				System.out.printf("ate logo :) \n");
				break;
				
			default:
				System.out.printf("opcao invalida!! \n");
				break;
			}	
			
			
		}while(opcao!=0);
	}
	
	
	
	public static void main(String[] args) {
		Menu();
		
    }

}
