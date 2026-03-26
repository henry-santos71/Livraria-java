
package livraria;


public class ItemLivro {
    public String codigoBarras;
    public boolean eReferencia;
    public String status;
    
    public void getDados(){
        System.out.println("Codigo: "+codigoBarras
            +"| Referencia: "+eReferencia
            +"| Status: "+status+"\n");
    }
    
    public void atualizarStatus(String novoStatus){
        status = novoStatus;
    }
    
    public boolean verificarItem(){
        if(status.equals("Disponivel")){
            return true;
        }
        return false;
    }
    
    public void sairEmprestimo(){
        status = "Emprestado";
    }
}
