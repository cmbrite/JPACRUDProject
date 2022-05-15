package com.skilldistillery.dogparks.data;

import java.util.List;

import com.skilldistillery.dogparks.entities.DogPark;

public interface DogParkDAO {

		DogPark findById(int dogParkId);
		
		List<DogPark> findAll();
		
		DogPark addNewDogPark(DogPark dogPark);

		boolean deleteDogPark(int id);

		DogPark editDogPark(DogPark dogPark);
	}

