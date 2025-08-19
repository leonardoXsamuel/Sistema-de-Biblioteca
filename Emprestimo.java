
package Estudos_POO.Projeto_Biblioteca;

import Estudos_POO.Projeto_Biblioteca.*;
import java.time.LocalDate;
import java.util.logging.ErrorManager;

    public class Emprestimo {

    private Livro livro;
    private Pessoa pessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Pessoa pessoa, LocalDate dataEmprestimo){
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
    }

    
    public void registrarDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao; 
        livro.setDisponivel(true);
    }

    public Livro getLivro(){
        return livro;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }

    public Pessoa getPessoa(){
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    

}
