import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AlunoController ac = new AlunoController();
        ac.setAluno(new Aluno(10, " Ale", "ADS", 1));
        ac.setAluno(new Aluno(20, " São Paulo", "DSM", 6));
        ac.setAluno(new Aluno(30, " Jundiai", "MKT", 3));
        ac.setAluno(new Aluno(40, " Mark", "DSM", 2));

        System.out.println("Pega o Auno por um INDEX"+ac.getAluno(2));
        System.out.println("Mostra alunos\n"+ac.mostrarAlunos());
        ac.removerUltimo();
        System.out.println("REMOVEU O ULTIMO\n" + ac.mostrarAlunos());
        ac.localizarIndex(30);
        ac.passarSem();
        System.out.println(ac.mostrarAlunos());
        ac.limparLista();
        System.out.println("LIMPOU A LISTA"+ac.mostrarAlunos());
    }
}