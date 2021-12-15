package br.com.modulo10;

import br.com.interfaces.modulo10.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String registro;
	private String nivelCargo;
	private String tempoExperiencia;
	private String login;
	private String senha;

	public Secretario() {
	}

	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getTempoExperiencia() {
		return tempoExperiencia;
	}

	public void setTempoExperiencia(String tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", tempoExperiencia="
				+ tempoExperiencia + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", numeroRg=" + numeroRg + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai="
				+ nomePai + "]";
	}

	@Override
	public double salario() {
		return 1800.80 * 0.9;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		//return login.equals("admin") && senha.equals("admin");
		this.login = login;
		this.senha = senha;
		return  autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
}
