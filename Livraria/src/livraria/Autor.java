
package livraria;


public class Autor {
    public String nome;
    public String biografia;
    
    public void getDados(){
        System.out.println("Nome: " +nome
            +"| Biografia: "+biografia+"\n");
    }
    
    public void listarObras(){
        System.out.println("Listando obras: "+biografia);
    }
}
