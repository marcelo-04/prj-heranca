package br.com.modulo10;

public class Aluno extends Pessoa{
	
	private String dataMatricula;
	private String nomeEscola;
	private String nomeCurso;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String dataMatricula, String nomeEscola, String nomeCurso) {
		super();
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.nomeCurso = nomeCurso;
	}
	
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", nomeCurso=" + nomeCurso
				+ "]";
	}

	@Override
	public double salario() {
		return 1500.90;
	}

	@Override // o Override identifica o método sobreescrito*/
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
		
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? 
				"Você é maior de idade." : "Você é menor de idade!";
	}
}
