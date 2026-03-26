
package livraria;

import java.time.LocalDate;

public class Livraria {

  
    public static void main(String[] args) {
       Livro livro1 = new Livro();
        Autor autor1 = new Autor();
        Usuario usuario1 = new Usuario();
        ItemLivro item1 = new ItemLivro();
        Emprestimo emprestimo1 = new Emprestimo();
        Biblioteca biblioteca1 = new Biblioteca();
        Bibliotecario funcionario1 = new Bibliotecario();
        Membro membro1 = new Membro();
        
        livro1.isbn = "123";
        livro1.titulo = "Java Basico";
        livro1.autor = "Joao";
        livro1.disponivel = true;

        autor1.nome = "Joao";
        autor1.biografia = "Autor de programaçao";

        usuario1.idUsuario = 1;
        usuario1.nome = "Henry";
        usuario1.status = "Ativo";
        usuario1.dataCadastro = LocalDate.now();

        item1.codigoBarras = "ABC123";
        item1.eReferencia = false;
        item1.status = "Disponivel";

        emprestimo1.dataEmprestimo = "01/03/2026";
        emprestimo1.dataVencimento = "10/03/2026";
        emprestimo1.diasAtraso = 2;

        biblioteca1.nome = "Central";
        biblioteca1.endereco = "Rua A";

        funcionario1.idFuncionario = "F01";
        funcionario1.nome = "Carlos";

        membro1.nome = "Ana";
        membro1.dataAdesao = LocalDate.now();
        
        livro1.getDados();
        autor1.getDados();
        usuario1.getDados();
        item1.getDados();
        emprestimo1.getDados();
        biblioteca1.getDados();
        funcionario1.getDados();
        membro1.getDados();
        
        biblioteca1.adicionarLivro(livro1);
        biblioteca1.buscarLivro(livro1);
        biblioteca1.removerLivro(livro1);
        
        usuario1.realizarEmprestimo();
        
        System.out.println("Usuario ativo: " + usuario1.verificarCadastro());
        System.out.println("Multa usuario: " + usuario1.calcularMultaAtraso(3));
        
        System.out.println("Multa emprestimo: " + emprestimo1.calcularMulta());
        
        item1.atualizarStatus("Disponivel");
        System.out.println("Item disponivel: " + item1.verificarItem());
        
        funcionario1.gerenciarAcervo();
        
        membro1.renovarMatricula1();
        membro1.getDados();

        
    }
    
}
