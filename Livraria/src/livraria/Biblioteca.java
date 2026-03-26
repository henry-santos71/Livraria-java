
package livraria;


public class Biblioteca {
    public String nome;
    public String endereco;
    
    public void getDados(){
        System.out.println("Biblioteca: "+nome
        +"| Endereco "+endereco+"\n");
    }
    
    public void adicionarLivro(Livro l){
        System.out.println("Adicionado: "+l.titulo);
    }
    
    public void removerLivro(Livro l){
        System.out.println("Livro removido: "+l.titulo);
    }
    
    public void buscarLivro(Livro l){
        System.out.println("Buscando Livro: "+l.titulo);
    }
}
