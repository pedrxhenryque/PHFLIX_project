package PHFLIX;

public class FilmesTerror extends Filmes {
	
	FilmesTerror(){
		super();
		
	}
	FilmesTerror(String filme1, String filme2, String filme3, String filme4, String filme5){
		super(filme1,filme2,filme3,filme4,filme5);

	}
	
	
	void Sinopse(){
		
		if(nomeFilme.equalsIgnoreCase(filme1)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Uma atriz vai gradativamente tomando consciência de que a sua filha de doze anos está tendo um comportamento completamente assustador.\n"
					+ "Deste modo, ela pede ajuda a um padre, que também é um psiquiatra, e este chega a conclusão de que a garota está possuída pelo demônio.\n"
					+ "Ele solicita então a ajuda de um segundo sacerdote, especialista em exorcismo, para tentar livrar a menina desta terrível possessão.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 8,1/10");
			System.out.println("Rotten Tomatos: 78%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme2)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Os investigadores paranormais Ed e Lorraine Warren trabalham para ajudar a família aterrorizada por uma entidade demoníaca em sua fazenda.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7,5/10");
			System.out.println("Rotten Tomatos: 86%");
			System.out.println();
		}
		else if(nomeFilme.equalsIgnoreCase(filme3)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Apos a morte da reclusa avo, a família Graham começa a desvendar algumas coisas. Mesmo após a partida da matriarca, ela permanece como se fosse uma sombra sobre a família,\n"
					+ "especialmente sobre a solitária neta adolescente, Charlie, por quem ela sempre manteve uma fascinação não usual. Com um crescente terror tomando conta da casa, a família explora lugares mais escuros para escapar do infeliz destino que herdaram.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7,3/10");
			System.out.println("Rotten Tomatos: 90%");
			System.out.println();
		}
		
		else if(nomeFilme.equalsIgnoreCase(filme4)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Uma mulher se encontra em uma luta por sua vida quando um livro antigo dá à luz demônios sedentos por sangue. Eles se tornam cada vez mais agressivos em um prédio em Los Angeles.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 6,6/10");
			System.out.println("Rotten Tomatos: 84%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme5)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Um grupo de amigos descobre uma mão embalsamada que lhes permite conjurar espíritos. Viciado na emoção, um deles vai longe demais e abre a porta para o mundo espiritual.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7,2/10");
			System.out.println("Rotten Tomatos: 94%");
			System.out.println();
		}
	}



}
