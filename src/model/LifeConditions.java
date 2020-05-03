package model;

public class LifeConditions extends AbstractAnimal {
	protected String climat;
	protected String typeLife;

	public String getClimat() {
		return climat;
	}

	public void setClimat(String climat) {
		this.climat = climat;
	}

	public String getTypeLife() {
		return typeLife;
	}

	public void setTypeLife(String typeLife) {
		this.typeLife = typeLife;
	}

	public LifeConditions(int weight, int mediumYearLife, int yearLife, String type, String climat, String typeLife) {
		super(weight, mediumYearLife, yearLife, yearLife, yearLife, type);
		this.climat = climat;
		this.typeLife = typeLife;
	}

}
