package br.com.teste.modulo10;

import br.com.modulo10.Aluno;
import br.com.modulo10.Diretor;
import br.com.modulo10.Pessoa;
import br.com.modulo10.Secretario;

public class ClasseTeste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Marcelo");
		aluno.setIdade(17);
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
		System.out.println();
		
		System.out.println(aluno.pessoaMaiorIdade()+ " - "+ aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		System.out.println();

		System.out.println("Salário do Aluno: "+ aluno.salario());
		System.out.println("Salário do Diretor: "+ diretor.salario());
		System.out.println("Salário do Secretario: "+ secretario.salario());
		System.out.println();

		teste(aluno);
		teste(diretor);
		teste(secretario);
	}

	public static void teste(Pessoa pessoa) {
		System.out.println("O Senhor: "+ pessoa.getNome()
				+", tem o salário de R$ "
				+ pessoa.salario());
	}

}
