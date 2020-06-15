import dominio.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

public class ProgramaCadastrar {

    public void cadastrar (){


        Produto produto1 = new Produto();
        produto1.setNome("pao");
        produto1.setQuantidade(2);

        Produto produto2 = new Produto();
        produto2.setNome("melado");
        produto2.setQuantidade(4);

        Conexao conexao = new Conexao();
        EntityManager em = conexao.getEntityManager();

        em.getTransaction().begin();
        em.persist(produto2);
        em.persist(produto1);

        em.getTransaction().commit();

       em.close();
       conexao.getEntityManager().close();

    }

}
