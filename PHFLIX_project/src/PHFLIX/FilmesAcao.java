package PHFLIX;

public class FilmesAcao extends Filmes {
	
	FilmesAcao(){
		super();
		
	}
	FilmesAcao(String filme1, String filme2, String filme3, String filme4, String filme5){
		super(filme1,filme2,filme3,filme4,filme5);
	}
	
	
	void Sinopse(){
		
		if(nomeFilme.equalsIgnoreCase(filme1)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("A ex-assassina conhecida apenas como Noiva acorda de um coma de quatro anos decidida a se vingar de Bill,\n"
					+ "seu ex-amante e chefe, que tentou matá-la no dia do casamento. Ela está motivada a acertar as contas com cada uma das pessoas envolvidas com a perda da filha,\n"
					+ "da festa de casamento e dos quatro anos de sua vida. Na jornada, a Noiva é submetida a dores físicas agonizantes ao enfrentar a inescrupulosa gangue de Bill,\n"
					+ "o Esquadrão Assassino de Víboras Mortais.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 8,2/10");
			System.out.println("Rotten Tomatos: 85%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme2)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Mansell é um pacato pai e marido que sempre arca com as injustiças da vida, sem revidar. Quando dois ladrões invadem sua casa,\n"
					+ "Hutch se recusa a defender a si mesmo e sua família na esperança de evitar qualquer violência, desapontando seus familiares com sua passividade.\n"
					+ "As consequências do incidente acabam despertando uma raiva latente nele, desencadeando instintos adormecidos e impulsionando-o em um caminho brutal.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7,4/10");
			System.out.println("Rotten Tomatos: 84%");
			System.out.println();
		}
		else if(nomeFilme.equalsIgnoreCase(filme3)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("John Wick é um lendário assassino de aluguel aposentado, lidando com o luto após perder o grande amor de sua vida.\n"
					+ "Quando um gângster invade sua casa, mata seu cachorro e rouba seu carro, ele é forçado a voltar à ativa e inicia sua vingança.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7,4/10");
			System.out.println("Rotten Tomatos: 86%");
			System.out.println();
		}
		
		else if(nomeFilme.equalsIgnoreCase(filme4)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Em Bangladesh, o mercenário do mercado negro Tyler Rake luta para sobreviver durante a missão para resgatar o filho sequestrado de um chefe do crime internacional.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 6,8/10");
			System.out.println("Rotten Tomatos: 67%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme5)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Em um trem-bala indo rapidamente de Tóquio a Morioka, cinco assassinos profissionais descobrem que possuem o mesmo objetivo.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 7,3/10");
			System.out.println("Rotten Tomatos: 54%");
			System.out.println();
		}
	}
	
}
