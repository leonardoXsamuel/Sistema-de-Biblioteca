    package Estudos_POO.Projeto_Biblioteca;

    import java.time.LocalDate;
    import java.util.ArrayList;

    public class Biblioteca {
        private ArrayList<Livro> livros;
        private ArrayList<Pessoa> pessoa; 
        private ArrayList<Emprestimo> emprestimo; 

        public Biblioteca (){
            livros = new ArrayList<>();
            pessoa = new ArrayList<>();
            emprestimo = new ArrayList<>();
        }

        public void adicionarLivro(Livro l){
            livros.add(l);
        }

        public void cadastrarPessoa(Pessoa p){
            pessoa.add(p);
        }

        public void realizarEmprestimo(Pessoa p, Livro l){
            if (l.getDisponivel()) {
                Emprestimo e = new Emprestimo(l, p, LocalDate.now());
                emprestimo.add(e);
                l.setDisponivel(false);
                System.out.println("Empréstimo realizado com sucesso!");
            } else {
                System.out.println("O livro " + l.getTitulo() + " Não está disponível!");
        }
    }

        public void listarLivrosDisponiveis(){
            for (Livro livro : livros) {
                System.out.println(livro.toString());
            }
        }

        public void listarEmprestimosAtivos(){
            
        }
    }
