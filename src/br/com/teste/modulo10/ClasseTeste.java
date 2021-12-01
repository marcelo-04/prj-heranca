package br.com.teste.modulo10;

import br.com.modulo10.Aluno;

public class ClasseTeste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Marcelo");
		aluno.setIdade(52);
		aluno.setNomeEscola("Jdev - Treinamento");
		
		System.out.println(aluno);

	}

}
