package com.skilldistillery.dogparks.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

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
		assertEquals("Anza Dog Park", park.getName());
		assertEquals("1000 N. Stone Ave", park.getAddress());
		assertEquals("Tucson", park.getCity());
		assertEquals("AZ", park.getState());
		assertEquals(1, park.getSize());
	}

	@Test
	@DisplayName("testing delete park mappings")
	void test2() {
		park = em.find(DogPark.class, 10);
		assertNull(park);
		
	}
	@Test
	@DisplayName("testing edit park mappings")
	void test3() {
		park = em.find(DogPark.class, 14);
		assertNotNull(park);
		assertEquals("Test Edit Park", park.getName());
		assertEquals("123 Main Street", park.getAddress());
		assertEquals("Tuscaloosa", park.getCity());
		assertEquals("AL", park.getState());
		assertEquals(4, park.getSize());
	}
	
	@Test
	@DisplayName("testing add new park")
	void test4() {
		park = em.find(DogPark.class, 17);
		assertNotNull(park);
		assertEquals("Lucky's Yard", park.getName());
		assertEquals("WY", park.getState());
		assertEquals("Sun City", park.getCity());
	}
	

}
