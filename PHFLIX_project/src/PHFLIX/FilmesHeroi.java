package PHFLIX;

public class FilmesHeroi extends Filmes {
	
	FilmesHeroi(){
		super();
		
	}
	FilmesHeroi(String filme1, String filme2, String filme3, String filme4, String filme5){
		super(filme1,filme2,filme3,filme4,filme5);
	}
	

	void Sinopse(){

		if(nomeFilme.equalsIgnoreCase(filme1)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Depois de ser picado por uma aranha geneticamente modificada em uma demonstracao cientifica,\n"
					+ "o jovem nerd Peter Parker ganha superpoderes. Inicialmente, ele pretende usa-los para para ganhar dinheiro,\n"
					+ "adotando o nome de Homem-Aranha e se apresentando em lutas de exibicao. Porem,\n"
					+ "ao presenciar o assassinando de seu tio Ben e sentir-se culpado,\n"
					+ "Peter decide nao mais usar seus poderes para proveito proprio e sim para enfrentar o mal.\n"
					+ "tendo como seu primeiro grande desafio o psicotico Duende Verde.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7,4/10");
			System.out.println("Rotten Tomatos: 90%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme2)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Batman tem conseguido manter a ordem em Gotham com a ajuda de Jim Gordon e Harvey Dent.\n"
					+ "No entanto, um jovem e anárquico criminoso, conhecido apenas como Coringa,\n"
					+ "pretende testar o Cavaleiro das Trevas e mergulhar a cidade em um verdadeiro caos.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 9/10");
			System.out.println("Rotten Tomatos: 94%");
			System.out.println();
		}
		else if(nomeFilme.equalsIgnoreCase(filme3)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("O governo envia os superviloes mais perigosos do mundo para a remota ilha de Corto Maltese,\n"
					+ "repleta de inimigos. Armados com armas de alta tecnologia, eles viajam pela selva perigosa em uma missao de busca e destruicao com o Coronel Rick Flag.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7,2/10");
			System.out.println("Rotten Tomatos: 90%");
			System.out.println();
		}
		
		else if(nomeFilme.equalsIgnoreCase(filme4)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Tony Stark e um industrial bilionário e inventor brilhante que realiza testes belicos no exterior,\n "
					+ "mas e sequestrado por terroristas que o forcam a construir uma arma devastadora. Em vez disso,\n"
					+ "ele constroi uma armadura blindada e enfrenta seus sequestradores.\n"
					+ "Quando volta aos Estados Unidos, Stark aprimora a armadura e a utiliza para combater o crime.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7,9/10");
			System.out.println("Rotten Tomatos: 94%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme5)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Após ser culpado pela morte de Harvey Dent e passar de herói a vilão,\n"
					+ "Batman desaparece. As coisas mudam com a chegada de uma ladra misteriosa, a Mulher-Gato,\n"
					+ "e Bane, um terrorista mascarado, que fazem Batman abandonar seu exílio forçado.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 8,4/10");
			System.out.println("Rotten Tomatos: 87%");
			System.out.println();
		}
	}

}
