package PHFLIX;

public class FilmesComedia extends Filmes {

	
	FilmesComedia(){
		super();
	}
	FilmesComedia(String filme1, String filme2, String filme3, String filme4, String filme5){
		super(filme1,filme2,filme3,filme4,filme5);

	}
	
	
	
	void Sinopse(){

		
		if(nomeFilme.equalsIgnoreCase(filme1)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Depois do assassinato de uma bela colega de classe, um grupo de adolescentes desorientados descobre que há um assassino entre eles.\n"
					+ "A heroína Cindy Campbell e a sua turma de amigos tentam se proteger do perigo, mas Gail Hailstorm, uma repórter irritante, simplesmente não os deixa em paz\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 6,3/10");
			System.out.println("Rotten Tomatos: 51%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme2)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Depois de a repórter de jornal Cindy assistir acidentalmente uma estranha fita de vídeo que faz com que o espectador morra dentro de uma semana,\n"
					+ "ela descobre que a fita é apenas um dos muitos acontecimentos estranhos recentes. Os agricultores locais Tom e George relataram círculos enormes que aparecem durante a noite em seus campos.\n"
					+ "Cindy encontra uma ligação entre a fita e os círculos nas plantações com a ajuda do presidente dos Estados Unidos e uma tia gentil.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 5,5/10");
			System.out.println("Rotten Tomatos: 35%");
			System.out.println();
		}
		else if(nomeFilme.equalsIgnoreCase(filme3)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Rick Riker é um estudante comum do colegial. Porém, ao ser mordido por uma libélula geneticamente modificada ganha superpoderes.\n"
					+ "Agora sua missão é proteger a cidade das mãos do malvado Hourglass, que suga a vida de suas vítimas.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 4,6/10");
			System.out.println("Rotten Tomatos: 16%");
			System.out.println();
		}
		
		else if(nomeFilme.equalsIgnoreCase(filme4)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Dois irmãos agentes do FBI, Marcus e Kevin Copeland, acidentalmente evitam que bandidos sejam presos em uma apreensão de drogas.\n"
					+ "Como castigo, eles são forçados a escoltar um par de socialites nos Hamptons. Quando as meninas descobrem o plano da agência, elas se recusam a ir.\n"
					+ "Sem opções, Marcus e Kevin, dois homens negros, decidem fingir que são as irmãs e se transformam em um par de loiras.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 5,7/10");
			System.out.println("Rotten Tomatos: 15%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme5)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Jim Levenstein, Kevin Myers, Oz Ostreicher e Paul Finch são quatro amigos virgens às vésperas do baile de formatura.\n"
					+ "Em meio a suas tentativas frustradas de fazer sexo com as namoradas, olhar mulheres nuas na internet e até mesmo atacar uma torta recém-saída do forno,\n"
					+ "os rapazes fazem um pacto e prometem deixar a virgindade para trás antes do baile de formatura. Agora eles têm 24 horas para cumprir esse acordo.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7/10");
			System.out.println("Rotten Tomatos: 61%");
			System.out.println();
		}
	}
	
}
