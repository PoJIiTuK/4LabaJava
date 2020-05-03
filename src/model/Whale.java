package model;
import model.Climat;

@SuppressWarnings("unused")
public class Whale extends AbstractAnimal {
	protected int numberOfFins;

	public int getNumberOfFins() {
		return numberOfFins;
	}

	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfFins;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Whale other = (Whale) obj;
		if (numberOfFins != other.numberOfFins)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Whale [numberOfFins=" + numberOfFins + "]";
	}

	public Whale(int weight, int mediumYearLife, int yearLife, String type, int numberOfFins) {
		super(weight, mediumYearLife, yearLife, numberOfFins, numberOfFins, type);
		this.numberOfFins = numberOfFins;
	}

}
