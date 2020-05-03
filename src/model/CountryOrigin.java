package model;

import model.LifeConditions;

@SuppressWarnings("unused")
public class CountryOrigin extends AbstractAnimal {
	protected String countryOrigin;
	protected AbstractAnimal animal;
	protected float lifeAnimalMoreFiveYear;

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public AbstractAnimal getAnimal() {
		return animal;
	}

	public void setAnimal(AbstractAnimal animal) {
		this.animal = animal;
	}

	public float getLifeAnimalMoreFiveYear() {
		return lifeAnimalMoreFiveYear;
	}

	public void setLifeAnimalMoreFiveYear(float lifeAnimalMoreFiveYear) {
		this.lifeAnimalMoreFiveYear = lifeAnimalMoreFiveYear;
	}

	public CountryOrigin(int weight, int mediumYearLife, int yearLife, String type, String countryOrigin,
			AbstractAnimal animal, float lifeAnimalMoreFiveYear) {
		super(weight, mediumYearLife, yearLife, yearLife, yearLife, type);
		this.countryOrigin = countryOrigin;
		this.animal = animal;
		this.lifeAnimalMoreFiveYear = lifeAnimalMoreFiveYear;
	}

}
