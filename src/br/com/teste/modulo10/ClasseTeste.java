package br.com.teste.modulo10;

import br.com.modulo10.Aluno;
import br.com.modulo10.Diretor;
import br.com.modulo10.Secretario;

public class ClasseTeste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Marcelo");
		aluno.setIdade(52);
		aluno.setNomeEscola("Jdev - Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setNome("José Antonio");
		diretor.setIdade(55);
		diretor.setTempoDirecao(3);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Marcos Silva");
		secretario.setIdade(36);
		secretario.setNivelCargo("Administrador");
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

	}

}
