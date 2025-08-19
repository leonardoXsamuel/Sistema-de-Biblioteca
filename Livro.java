package Estudos_POO.Projeto_Biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private int anoLancamento;
    private String IBSN;
    private boolean disponivel;

    //constructor
    public Livro(String titulo, String autor, int anoLancamento, String IBSN ,boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.IBSN = IBSN;
        this.disponivel = disponivel;
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + ", Autor: " + autor; 
    }

    public void emprestar(){
        if (disponivel) {
            disponivel = false;
            System.out.println("o livro " + titulo + " foi emprestado!");
        } else {
            System.out.println("o livro " + titulo + " já foi emprestado!");
        }
    }

    public void devolver(){
        if (!disponivel) {
            disponivel = true;
            System.out.println("o livro " + titulo + " foi devolvido!");
        } else {
            System.out.println("livro já está disponível!");
        }
    }

    public void exibirInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Código IBSN: " + IBSN);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Lançamento: " + anoLancamento);

        if (disponivel) {
            System.out.println("disponivel: Sim");
        } else {
            System.out.println("disponivel: Não");
        }


    }

    //setters e getters
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getIBSN(){
        return IBSN;
    }
    
    public void setIBSN(String IBSN){
        this.IBSN = IBSN;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }
    
    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    

    



    

    

}