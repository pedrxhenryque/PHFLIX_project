package PHFLIX;

public class Filmes {
	
	protected String filme1;
	protected String filme2;
	protected String filme3;
	protected String filme4;
	protected String filme5;
	protected String nomeFilme;
	
	Filmes(){
		super();
		
	}
	
	Filmes(String filme1, String filme2, String filme3, String filme4, String filme5){
		super();
		this.filme1 = filme1 ;
		this.filme2 = filme2 ;
		this.filme3 = filme3 ;
		this.filme4 = filme4 ;
		this.filme5 = filme5 ;
	}

	public String getFilme1() {
		return filme1;
	}

	public void setFilme1(String filme1) {
		this.filme1 = filme1;
	}

	public String getFilme2() {
		return filme2;
	}

	public void setFilme2(String filme2) {
		this.filme2 = filme2;
	}

	public String getFilme3() {
		return filme3;
	}

	public void setFilme3(String filme3) {
		this.filme3 = filme3;
	}

	public String getFilme4() {
		return filme4;
	}

	public void setFilme4(String filme4) {
		this.filme4 = filme4;
	}

	public String getFilme5() {
		return filme5;
	}

	public void setFilme5(String filme5) {
		this.filme5 = filme5;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	
	void Sinopse(){
		
	}
	

}
