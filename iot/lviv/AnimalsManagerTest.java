package iot.lviv;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.AbstractAnimal;
import iot.lviv.AbstractSearchAnimalsManager;
import manager.AnimalManager;

import org.junit.jupiter.api.BeforeEach;

class AnimalsManagerTest extends AbstractSearchAnimalsManager {
	private AnimalManager animalManager;

	@BeforeEach
	public void setUp() {
		animalManager = new AnimalManager();
		animalManager.addAnimals(delfins);
		animalManager.addAnimals(emmoFishs);
		animalManager.addAnimals(whales);
	}

	@Test
	public void testFindAnimalLiveMoreFiveYear() {
		List<AbstractAnimal> animals = animalManager.findAnimalLiveMoreFiveYear(3);
		assertEquals(5, animals.size());
		assertEquals(5, animals.get(0).getByVolumeOfTheAquarium());
		assertEquals(6, animals.get(1).getByVolumeOfTheAquarium());
		assertEquals(4, animals.get(2).getByVolumeOfTheAquarium());
		assertEquals(5, animals.get(3).getByVolumeOfTheAquarium());
		assertEquals(5, animals.get(4).getByVolumeOfTheAquarium());
		
	}

}