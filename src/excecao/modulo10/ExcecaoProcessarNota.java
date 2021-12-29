package excecao.modulo10;

public class ExcecaoProcessarNota extends Exception {

    public ExcecaoProcessarNota(String erro) {
        super("Um erro no processamento ao processar as notas do aluno.");
    }
}
