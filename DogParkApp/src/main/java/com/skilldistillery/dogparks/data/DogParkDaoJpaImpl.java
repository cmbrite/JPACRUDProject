package com.skilldistillery.dogparks.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.dogparks.entities.DogPark;

@Service
@Transactional
public class DogParkDaoJpaImpl implements DogParkDAO{

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

}
