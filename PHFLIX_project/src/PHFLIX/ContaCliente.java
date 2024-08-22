package PHFLIX;

import java.util.Scanner;

public class ContaCliente  {
	
	Scanner leitor = new Scanner(System.in);
	
	protected String nome;
	private String email;
	private String senha;
	private Filmes movies;
	
	ContaCliente(){
		
	}
	
	ContaCliente(String nome,String email,String senha){
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return senha;
	}

	public Filmes getMovies() {
		return movies;
	}

	public void setMovies(Filmes movies) {
		this.movies = movies;
	}
	
	void Cadastro() {
		
		System.out.println("informe seu nome: ");
		nome = leitor.nextLine();
		System.out.println("informe seu email: ");
		email= leitor.nextLine();
		System.out.println("informe sua senha: ");
		senha = leitor.nextLine();
		System.out.println();
		System.out.println("Cadastro concluido :) ");
		System.out.println();
	}

	
	void ImprimirDados(Filmes movies) {
		movies.setNomeFilme(movies.nomeFilme);
		
		System.out.println();
		System.out.println("Nome do usuario: "+nome);
		System.out.println();
		System.out.println("Filme Recomendado: "+movies.getNomeFilme());

	}
	
	void ImprimirCritica(String nome) {
		
	}


}



