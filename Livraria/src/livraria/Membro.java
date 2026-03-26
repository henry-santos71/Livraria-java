
package livraria;

import java.time.LocalDate;


public class Membro {
    public LocalDate dataAdesao;
    public String nome;
    
    public void getDados(){
        System.out.println("Data Adesao: "+dataAdesao
        +"| Nome: "+nome+"\n");
    }
    
    public void renovarMatricula1(){
        dataAdesao = LocalDate.now();
    }
}
