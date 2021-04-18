package br.ufpb.dcx.aps.atividades.atv04;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private List<Turma> turmas = new LinkedList<Turma>();
    private Curso curso;


    public Disciplina(Curso curso, String  codigo, String nome){
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public String getCodigo() {

        return codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public Turma getTurma(int numero){
        for (Turma t: turmas){
            if (numero == t.getCodigo()){
                return t;
            }
        }
        if (numero <= 0){
            throw new IllegalArgumentException("código inválido:"+numero);
        } else {
            throw new RuntimeException("Não existe turma com código:"+numero);
        }
    }

    public Turma criarTurma(){
        Turma t = new Turma(CodTurma(), this);
        turmas.add(t);
        return t;

    }
    public List<Turma> getTurmas(){

        return turmas;
    }

    private int CodTurma(){
        int num = 1;
        for( Turma t: turmas){
            num = t.getCodigo();
            num ++;
        }
        return num;
    }


}
