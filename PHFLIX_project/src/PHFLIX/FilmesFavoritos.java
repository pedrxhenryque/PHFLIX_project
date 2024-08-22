package PHFLIX;

import java.util.Scanner;

public class FilmesFavoritos {
	
	Scanner leitor= new Scanner(System.in);
	Scanner leitorNumb = new Scanner(System.in);
	
	protected String filmes[];
	
	public void setFilmes(String[] filmes) {
		this.filmes = filmes;
	}
	public String[] getFilmes() {
		return filmes;
	}
	
	void Favoritos() {
		
		int ranking;
		System.out.println("Informe quantos filmes favoritos vc tem: ");
		ranking = leitorNumb.nextInt();
		filmes = new String[ranking];
		for(int i=0;i<ranking;i++) {
			System.out.println("Ranking "+(i+1)+":");
			filmes[i] = leitor.nextLine();
		}
		
	}
	
	void ImprimirFavoritos() {
		if(filmes==null) {
			System.out.println("...");
		}
		else {
			for(int i=0;i<filmes.length;i++) {
				System.out.println((i+1)+" - "+filmes[i]);		
			}
		}
	}
	

}
