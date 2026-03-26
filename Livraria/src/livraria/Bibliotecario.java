
package livraria;


public class Bibliotecario {
    public String idFuncionario;
    public String nome;
    
    public void getDados(){
        System.out.println("ID: "+idFuncionario
            +"| Nome: "+nome+"\n");
    } 
    
    public void gerenciarAcervo(){
        System.out.println("Gerenciando acervo");
    }
}
