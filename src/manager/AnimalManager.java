package manager;

import java.util.LinkedList;
import java.util.List;

import model.AbstractAnimal;

public class AnimalManager {
	private List<AbstractAnimal> animals = new LinkedList<>();

	public void addAnimals(List<AbstractAnimal> animals) {

		this.animals.addAll(animals);
	}

	public void addAnimal(AbstractAnimal animal) {
		this.animals.add(animal);
	}

	public List<AbstractAnimal> findAnimalLiveMoreFiveYear(float lifeAnimalMoreFiveYear) {
		List<AbstractAnimal> result = new LinkedList<>();
		for (AbstractAnimal animal : animals) {
			if (animal.getByVolumeOfTheAquarium() > lifeAnimalMoreFiveYear) {
				result.add(animal);
			}
		}
		return result;
	}
}