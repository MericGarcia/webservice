package fr.keyconsulting.formation.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;

import fr.keyconsulting.formation.model.Calcul;
import fr.keyconsulting.formation.service.PersistenceService;

public class ORMPersistenceService implements PersistenceService{

	private static final String PERSISTENCE_UNIT_NAME = "model";
	private EntityManagerFactory factory;
	private EntityManager em;

	public ORMPersistenceService() {
		this.factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		this.em = factory.createEntityManager();
	}

	@Override
	public void persist(Calcul calcul) {
		em.getTransaction().begin();
		if(em.find(Calcul.class, calcul.getId()) != null){
			em.merge(calcul);
		}
		em.persist(calcul);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Calcul> load() {	
		Session session = em.unwrap(Session.class);
		Criteria crit = session.createCriteria(Calcul.class);
		List<Calcul> calculs = crit.list();
		return calculs;
	}
	
	

}
