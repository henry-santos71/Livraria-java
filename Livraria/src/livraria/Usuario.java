
package livraria;

import java.time.LocalDate;


public class Usuario {
    public int idUsuario;
    public String nome;
    public String status;
    public LocalDate dataCadastro;
    
    public void getDados(){
        System.out.println("ID: "+idUsuario
            +"| Nome: "+nome
            +"| Status: "+status
            +"| Data do Cadastro: "+dataCadastro+"\n");
    }
    
    public void realizarEmprestimo(){
        System.out.println(nome + " realizou emprestimo com sucesso");
    }
    
    public double calcularMultaAtraso(int dias){
        double multa = dias * 2;
        return multa;
    } 
    
    public boolean verificarCadastro(){
        if(status.equals("Ativo")){
            return true;
        }
        return false;
    }
}
