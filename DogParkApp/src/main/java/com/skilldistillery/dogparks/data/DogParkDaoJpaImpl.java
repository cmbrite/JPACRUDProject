package com.skilldistillery.dogparks.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.dogparks.entities.DogPark;

@Service
@Transactional
public class DogParkDaoJpaImpl implements DogParkDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public DogPark findById(int dogParkId) {

		return em.find(DogPark.class, dogParkId);
	}

	@Override
	public List<DogPark> findAll() {
		String jpql = "SELECT dp FROM DogPark dp";
		List<DogPark> dogParks = em.createQuery(jpql, DogPark.class).getResultList();
		return dogParks;
	}

	public DogPark addNewDogPark(DogPark dogPark) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADogParks");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(dogPark);

		em.getTransaction().commit();
		em.close();
		return dogPark;
	}

	public boolean deleteDogPark(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADogParks");
		EntityManager em = emf.createEntityManager();
		boolean wasDeleted = false;

		DogPark dogPark = em.find(DogPark.class, id);
		if (dogPark != null) {
			em.getTransaction().begin();

			em.remove(dogPark);

			em.getTransaction().commit();
		} else if (dogPark == null) {
			return false;
		}

		wasDeleted = !em.contains(dogPark);

		em.close();
		emf.close();
		return wasDeleted;
	}

	public DogPark editDogPark(DogPark dogPark) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADogParks");
		em = emf.createEntityManager();
		int id = dogPark.getId();

		// open a transaction
		em.getTransaction().begin();

		// retrieve a "managed" customer entity
		DogPark editedDogPark = em.find(DogPark.class, id);

		// update the values of the managed entity
		editedDogPark.setName(dogPark.getName());
		editedDogPark.setAddress(dogPark.getAddress());
		editedDogPark.setCity(dogPark.getCity());
		editedDogPark.setState(dogPark.getState());
		editedDogPark.setSize(dogPark.getSize());
		editedDogPark.setSize(dogPark.getOpen());
		editedDogPark.setSize(dogPark.getClose());

		// actually make changes
		em.getTransaction().commit();
		
		return editedDogPark;
	}
}
