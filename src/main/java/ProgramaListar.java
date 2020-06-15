import dominio.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ProgramaListar {

    public void  listar(){

        List<Produto> listaprodutos = new ArrayList<Produto>();
        Conexao conexao = new Conexao();
        EntityManager em = conexao.getEntityManager();

        Query query = em.createQuery("select p from Produto p ",Produto.class);

        listaprodutos = query.getResultList();


        for (Produto produto: listaprodutos) {
            System.out.println("========= Produto ============ ");
            System.out.println("Produto: "+produto.getNome());
            System.out.println("quantidade "+produto.getQuantidade());
        }

        em.close();
        conexao.getEntityManager().close();
    }

}
