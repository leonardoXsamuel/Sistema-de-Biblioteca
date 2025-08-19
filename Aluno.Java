package Estudos_POO.Projeto_Biblioteca;

public class Aluno extends Usuario {

    private int matricula;

    public Aluno(String nome, String cpf, String email, int matricula){
        super(nome, cpf, email);
        this.matricula = matricula;
    }



}