package br.com.babalook.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("babalook");
	
	public EntityManager getenEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
