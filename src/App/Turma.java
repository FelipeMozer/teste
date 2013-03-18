package App;
import java.util.ArrayList;

public class Turma {

    protected int codigo;
    protected String descricao;    

    public Turma(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    ArrayList<Aluno> alunos = new ArrayList<>();

    public float quantAluno() {
        return alunos.size();
    }

    public float quantAprovados() {
       return alunos.get(codigo).getMedia();
    }

    public float quantReprovados() {
        return alunos.get(codigo).getMedia();
    }

    public float porcemAprovados() {
        float porc;
        porc =(quantAprovados()*100)/quantAluno();
        return porc;
    }

    public float PRCAReprovados() {
        float porcR;
        porcR =(quantReprovados()*100)/quantAluno();
        return porcR;
    }

    public float MEDTurma() {
        return alunos.get(codigo).getMedia()/quantAluno();
    }
}
