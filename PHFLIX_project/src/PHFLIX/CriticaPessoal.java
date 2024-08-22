package PHFLIX;
import java.util.Scanner;

public class CriticaPessoal extends ContaCliente{
	
	Scanner leitor= new Scanner(System.in);
	Scanner leitorNumb = new Scanner(System.in);
	
	
	private String critica[];
	private String filme[];
	
	public String[] getCritica() {
		return critica;
	}
	public void setCritica(String[] critica) {
		this.critica = critica;
	}
	
	public String[] getFilme() {
		return filme;
	}
	
	
	public void setFilme(String[] filme) {
		this.filme = filme;
	}
	
	void Critica() {
		
		int quant;
		System.out.println("Quantos filmes deseja adicionar sua critica? "); 
		quant = leitorNumb.nextInt();
		critica = new String[quant];
		filme = new String[quant];
		for(int i=0;i<quant;i++) {
			System.out.println("Nome do filme "+(i+1)+":");
			filme[i] = leitor.nextLine();
			System.out.println();
			System.out.println("Critica: ");
			critica[i] = leitor.nextLine();
			System.out.println();
		}
		
	}
	
	void ImprimirCritica(String nome) {
		
		System.out.println("CRITICA FEITA POR "+nome.toUpperCase()+":");
		System.out.println();
		if(critica == null) {
			System.out.println("...");
		}
		else {
			for(int i=0;i<critica.length;i++) {
				System.out.println((i+1)+" - "+filme[i].toUpperCase()+":");
				System.out.println(critica[i]);
				System.out.println();
			}
			
		}
	}





}
