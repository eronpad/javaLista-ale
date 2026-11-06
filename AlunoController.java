import br.edu.fatecpg.JavaLista.Model.Aluno;
import java.util.ArrayList;
import java.util.List;
public class AlunoController {
    private List<Aluno> ListaAlunos;

    public AlunoController(){
        ListaAlunos = new ArrayList();
    }

    public void setAluno(Aluno a){
        ListaAlunos.add(a);
    }
    public Aluno getAluno(int index){
        return ListaAlunos.get(index);
    }
    public String mostrarAlunos(){
        StringBuilder sb = new StringBuilder();
        for(Aluno a :ListaAlunos){
            sb.append(a.toString()+"\n");
        }
        return sb.toString();
    }

    public void removerUltimo(){
       ListaAlunos.remove(ListaAlunos.size() - 1);
    }
    public void localizarIndex(int mat){
        for(Aluno a : ListaAlunos)
        {
            if(a.getMatricula() == mat)
            {
                System.out.println("LOCALIZOU A MATRICULA PELO INDEX: "+ListaAlunos.indexOf(a));
            }
        }
    }
    public void limparLista(){
        ListaAlunos.clear();
    }
    public void passarSem(){
        for(Aluno a :ListaAlunos)
        {
            a.setCiclo(a.getCiclo() +1);
        }
    }
}
