
package livraria;


public class Livro {
    public String isbn;
    public String titulo;
    public String autor;
    public boolean disponivel;
    
    public void getDados(){
        System.out.println("ISBN: "+isbn
                +"| Titulo: "+titulo
                +"| Autor: "+autor
                +"| Disponivel:"+disponivel+"\n");
    }
    
    public void obterDetalhes(){
        System.out.println(titulo + " - " + autor);
    }
    
    public boolean verificarDisponibilidade(){
        return disponivel;
    }
    
    public void listarAutores(){
        System.out.println("Autores: "+autor);
    }
}

