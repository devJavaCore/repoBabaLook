package br.com.babalook.DAO;

import javax.persistence.EntityManager;

public class TransacaoDAO {
	private EntityManager em;

	public TransacaoDAO(EntityManager em) {
		this.em = em;
	}
}
