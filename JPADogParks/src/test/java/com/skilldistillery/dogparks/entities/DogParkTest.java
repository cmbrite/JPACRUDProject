package com.skilldistillery.dogparks.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DogParkTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private DogPark park;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPADogParks");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		park = em.find(DogPark.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		park = null;
	}

	@Test
	@DisplayName("testing basic park mappings")
	void test1() {
		assertNotNull(park);
		assertEquals("Anza Park", park.getName());
		
	}

}
