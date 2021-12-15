package br.com.teste.modulo10;

import br.com.constantes.modulo10.StatusAluno;
import br.com.interfaces.modulo10.PermitirAcesso;
import br.com.modulo10.Aluno;
import br.com.modulo10.Disciplina;
import br.com.modulo10.Secretario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TesteAluno {

    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Informe o login");
        String senha = JOptionPane.showInputDialog("Informe a senha");

        PermitirAcesso permitirAcesso = new Secretario(login, senha);

        if (new Secretario().autenticar(login, senha)) {

            List<Aluno> alunos = new ArrayList<Aluno>();

            // uma lista que dentro dela temos uma chave que identifica uma sequência de
            // valores
            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

            for (int quantidade = 1; quantidade <= 5; quantidade++) {

                /**
                 * new Aluno() é uma instancia (Criação de Objeto) aluno1 é uma referência para
                 * o objeto aluno.
                 */

                String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + quantidade + " ?");
//		String idade = JOptionPane.showInputDialog("Informe a idade do aluno: ");
//		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento do aluno: ");
//		String rg = JOptionPane.showInputDialog("Informe o RG do aluno: ");
//		String cpf = JOptionPane.showInputDialog("Informe o CPF do aluno: ");
//		String ra = JOptionPane.showInputDialog("Informe o RA do aluno: ");
//		String mae = JOptionPane.showInputDialog("Informe o nome da mãe: ");
//		String pai = JOptionPane.showInputDialog("Informe o nome do pai: ");
//		String matricula = JOptionPane.showInputDialog("Data matricula do aluno: ");
//		String escola = JOptionPane.showInputDialog("Informe o nome da escola: ");
//		String curso = JOptionPane.showInputDialog("Informe o curso do aluno: ");
//
                Aluno aluno1 = new Aluno();

                aluno1.setNome(nome);
//		aluno1.setIdade(Integer.valueOf(idade));
//		aluno1.setDataNascimento(dataNascimento);
//		aluno1.setNumeroRg(rg);
//		aluno1.setNumeroCpf(cpf);
//		aluno1.setNumeroRa(ra);
//		aluno1.setNomeMae(mae);
//		aluno1.setNomePai(pai);
//		aluno1.setDataMatricula(matricula);
//		aluno1.setNomeEscola(escola);
//		aluno1.setCursoAluno(curso);

                for (int posicao = 1; posicao <= 1; posicao++) {
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + posicao + " ?");
                    String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + posicao + " ?");

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(Double.valueOf(notaDisciplina));

                    aluno1.getDisciplinas().add(disciplina);
                }

                int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

                if (escolha == 0) { // Opção SIM e ZERO

                    int continuarRemover = 0;
                    int auxiliar = 1;

                    while (continuarRemover == 0) {

                        String removerDisciplina = JOptionPane.showInputDialog("Escolha a disciplina [1, 2, 3 ou 4]");
                        aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - auxiliar);
                        auxiliar++;
                        continuarRemover = JOptionPane.showConfirmDialog(null, "Quer continuar à remove? ");
                    }
                }
                alunos.add(aluno1);
            }

            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            for (Aluno aluno : alunos) { // Aqui está separando em listas

                if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);
                } else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                } else {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }

            System.out.println("***** Lista dos aprovados *****");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("Resultado = " + " Nome do aluno: " + aluno.getNome() + ", "
                        + aluno.getAlunoAprovado() + ", média = " + aluno.getMediaNota());
            }

            System.out.println();
            System.out.println("***** Lista dos em recuperação *****");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("Resultado = " + " Nome do aluno: " + aluno.getNome() + ", "
                        + aluno.getAlunoAprovado() + ", média = " + aluno.getMediaNota());
            }

            System.out.println();
            System.out.println("***** Lista dos reprovados *****");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("Resultado = " + " Nome do aluno: " + aluno.getNome() + ", "
                        + aluno.getAlunoAprovado() + ", média = " + aluno.getMediaNota());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado!");
        }
    }
}

