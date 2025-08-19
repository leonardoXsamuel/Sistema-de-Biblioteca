package Estudos_POO.Projeto_Biblioteca;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String email;


    public Pessoa(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
    }

}
