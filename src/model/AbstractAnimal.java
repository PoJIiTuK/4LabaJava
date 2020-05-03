package model;

public abstract class AbstractAnimal {

	private int ByVolumeOfTheAquarium;
	
 public AbstractAnimal() {
	super();
 }
	public AbstractAnimal(int byVolumeOfTheAquarium) {
		ByVolumeOfTheAquarium = byVolumeOfTheAquarium;
	}

	public int getByVolumeOfTheAquarium() {
		return ByVolumeOfTheAquarium;
	}

	public void setFoodConsumedInKilo(int byVolumeOfTheAquarium) {
		ByVolumeOfTheAquarium = byVolumeOfTheAquarium;
	}
	private int AnimalLife;
	protected int weight;
	protected int mediumYearLife;
	protected int yearLife;
	public void setByVolumeOfTheAquarium(int byVolumeOfTheAquarium) {
		ByVolumeOfTheAquarium = byVolumeOfTheAquarium;
	}
	protected String type;
	

	public int getAnimalLife() {
		return AnimalLife;
	}

	public void setAnimalLife(int AnimalLife) {
		this.AnimalLife = AnimalLife;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMediumYearLife() {
		return mediumYearLife;
	}

	public void setMediumYearLife(int mediumYearLife) {
		this.mediumYearLife = mediumYearLife;
	}

	public int getYearLife() {
		return yearLife;
	}

	public void setYearLife(int yearLife) {
		this.yearLife = yearLife;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AbstractAnimal(int animalLife,int byVolumeOfTheAquarium, int weight, int mediumYearLife, int yearLife, String type) {
		AnimalLife = animalLife;
		ByVolumeOfTheAquarium = byVolumeOfTheAquarium;
		this.weight = weight;
		this.mediumYearLife = mediumYearLife;
		this.yearLife = yearLife;
		this.type = type;
	}

	@Override
	public String toString() {
		return "AbstractAnimal [byVolumeOfTheAquarium=" + ByVolumeOfTheAquarium + ",animalLife=" + AnimalLife + ", weight=" + weight + ", mediumYearLife=" + mediumYearLife
				+ ", yearLife=" + yearLife + ", type=" + type + "]";
	}

}
