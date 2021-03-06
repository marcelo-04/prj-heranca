package br.com.modulo10;

public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String numeroRg;
	protected String numeroCpf;
	protected String numeroRa;
	protected String nomeMae;
	protected String nomePai;

	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroRg() {
		return numeroRg;
	}
	public void setNumeroRg(String numeroRg) {
		this.numeroRg = numeroRg;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNumeroRa() {return numeroRa; }
	public void setNumeroRa(String numeroRa) { this.numeroRa = numeroRa; }
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	/* Retorna true caso tenha 18 senão false*/
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}

}
