
package livraria;

public class Emprestimo {
    public String dataEmprestimo;
    public String dataVencimento;
    public int diasAtraso;

    public void getDados() {
        System.out.println("Data Emprestimo: " + dataEmprestimo
        + " | Data Vencimento: " + dataVencimento
        + " | Dias de atraso: " + diasAtraso + "\n");
    }

    public double calcularMulta() {
        if (diasAtraso > 0) {
            return diasAtraso * 2;
        }
        return 0;
    }
    
    public void ObterLivros(){
       System.out.println("Obtendo Livros...");
    }
    
    public String datavencimento(){
        return dataVencimento;
    }
    
    public void VerificarLivrosEmprestados(){
        System.out.println("Verificando Livros...");
    }
    
    public void atualizarStatus(){
        System.out.println("Status atualizado");
    }

 }
