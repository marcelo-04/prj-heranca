package br.com.modulo10;

public class Secretario extends Pessoa {
	
	private String registro;
	private String nivelCargo;
	private String tempoExperiencia;
	
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
}
