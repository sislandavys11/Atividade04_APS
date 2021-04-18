package br.ufpb.dcx.aps.atividades.atv04;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();
    private Disciplina disciplina;

    public Turma(int codigo, Disciplina disciplina){
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public int getCodigo() {

        return codigo;
    }

    public Professor getProfessor() {

        return professor;
    }

    public void setProfessor(Professor professor) {

        this.professor = professor;
    }
    public void addAluno(Aluno aluno){
        disciplina.getCurso().getAlunoMatriculado(aluno.getMatricula());
        alunos.add(aluno);

    }
    public List<Aluno> getAlunos(){

        return alunos;
    }
    public Disciplina getDisciplina(){

        return disciplina;
    }

}
