package br.com.babalook.test;

import javax.persistence.EntityManager;

import br.com.babalook.model.Cor;
import br.com.babalook.model.Produto;
import br.com.babalook.util.JPAUtil;

public class TestaProduto {
	
	
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("Calca Leg tal");
		produto.setCor(Cor.CINZA);
		
		EntityManager em = new JPAUtil().getenEntityManager();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		em.close();
	}
}
