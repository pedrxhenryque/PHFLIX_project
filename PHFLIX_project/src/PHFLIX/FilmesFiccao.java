package PHFLIX;

public class FilmesFiccao extends Filmes {
	
	FilmesFiccao(){
		super();
		
	}
	FilmesFiccao(String filme1, String filme2, String filme3, String filme4, String filme5){
		super(filme1,filme2,filme3,filme4,filme5);
	}
	
	
	void Sinopse(){

		
		if(nomeFilme.equalsIgnoreCase(filme1)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("As reservas naturais da Terra estão chegando ao fim e um grupo de astronautas recebe a missao de verificar possíveis planetas para receberem a população mundial,\n"
					+ "possibilitando a continuacao da especie. Cooper e chamado para liderar o grupo e aceita a missao sabendo que pode nunca mais ver os filhos. Ao lado de Brand, Jenkins e Doyle,\n"
					+ "ele seguirá em busca de um novo lar.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 8,7/10");
			System.out.println("Rotten Tomatos: 73%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme2)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("Os paleontólogos Alan Grant, Ellie Sattler e o matemático Ian Malcolm,\n"
					+ "fazem parte de um seleto grupo escolhido para visitar uma ilha habitada por dinossauros criados a partir de DNA pre-histórico.\n"
					+ "O idealizador do projeto e bilionário John Hammond garante a todos que a instalacao e completamente segura.\n"
					+ "Mas apos uma queda de energia, os visitantes descobrem, aos poucos, que varios predadores ferozes estao soltos e a caça.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 8,2/10");
			System.out.println("Rotten Tomatos: 91%");
			System.out.println();
		}
		else if(nomeFilme.equalsIgnoreCase(filme3)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("O adolescente Marty McFly e transportado para 1955 quando uma experiência do excêntrico cientista Doc Brown da errado.\n"
					+ "Ele viaja pelo tempo em um carro modificado e acaba conhecendo seus pais ainda jovens. O problema e que Marty pode deixar de existir porque ele interferiu na rotina dos pais,\n"
					+ "que correm o risco de nao se apaixonar mais. Para complicar ainda mais a situacao, Marty precisa voltar para casa a tempo de salvar o cientista.\n");
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 8,5/10");
			System.out.println("Rotten Tomatos: 93%");
			System.out.println();
		}
		
		else if(nomeFilme.equalsIgnoreCase(filme4)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("O jovem programador Thomas Anderson e atormentado por estranhos pesadelos em que esta sempre conectado por cabos a um imenso sistema de computadores do futuro.\n"
					+ "A medida que o sonho se repete, ele começa a desconfiar da realidade. Thomas conhece os misteriosos Morpheus e Trinity e descobre que e vitima de um sistema inteligente e artificial chamado Matrix,\n"
					+ "que manipula a mente das pessoas e cria a ilusao de um mundo real enquanto usa os cerebros e corpos dos individuos para produzir energia.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 8,7/10");
			System.out.println("Rotten Tomatos: 83%");
			System.out.println();
			
		}
		else if(nomeFilme.equalsIgnoreCase(filme5)) {
			System.out.printf("Sinopse:\n");
			System.out.printf("No condado de Bucks, Pensilvania, vive o viuvo Graham Hess e seus dois filhos, Morgan e Bo.\n"
					+ "Ele costumava ser o pastor da regiao, mas se recusa a ser chamado assim desde que sua mulher, Colleen,\n"
					+ "morreu atropelada por Ray Reddy, um de seus vizinhos.\n"
					+ "Os Hess ficam intrigados com o aparecimento de misteriosos circulos em sua plantacao sem que haja o menor vestigio de quem os fez ou por qual motivo teriam sido feitos.\n");
			
			
			System.out.printf("Critica:\n");
			System.out.println("IMDB: 6,8/10");
			System.out.println("Rotten Tomatos: 75%");
			System.out.println();
		}
	}
	
	
}
