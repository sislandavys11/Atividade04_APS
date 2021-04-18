package br.ufpb.dcx.aps.atividades.atv04;

import java.util.*;

public class Curso {
    private String nome;
    private Map<String,Disciplina> disciplinas = new HashMap<String,Disciplina>();
    private Map<String,Aluno> matriculas = new HashMap<String, Aluno>();

    public Curso(String nome){

        this.nome = nome;
    }

    public Curso(){

        this.nome = "";
    }

    public void setNome(String nome){

        this.nome = nome;
    }
    public String getNome(){

        return nome;
    }
    public void matricular(Aluno aluno){
        if (aluno == null){
            throw new IllegalArgumentException("aluno inválido:null");
        }
        if(matriculas.containsKey(aluno.getMatricula())){
            throw new RuntimeException("aluno já matriculado:"+aluno.getMatricula());
        }
        Aluno a = new Aluno(aluno.getMatricula(), aluno.getNome());
        matriculas.put(aluno.getMatricula(), a);
    }


    public Aluno getAlunoMatriculado(String matricula){
            if (matriculas.containsKey(matricula)){
                return matriculas.get(matricula);
            }
            throw new RuntimeException("Aluno não está matriculado no curso:"+getNome());
    }

    public boolean alunoMatriculado(String matricula){
        if (matriculas.containsKey(matricula)){
            return true;
        }
        return false;
    }
    public Collection<Aluno> getAlunosMatriculados(){

        return matriculas.values();
    }
    //FALTA ESSE
    public Disciplina criarDisciplina(String codigo, String nome){
        Disciplina d = new Disciplina(this,codigo, nome);
        disciplinas.put(codigo,d);
        return d;

    }
    public Disciplina getDisciplina(String codigo){
        if (disciplinas.containsKey(codigo)){
            return disciplinas.get(codigo);
        }
        throw new RuntimeException("Não existe disciplina com código:"+codigo);
    }

}
