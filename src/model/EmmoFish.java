package model;
import model.Climat;

@SuppressWarnings("unused")
public class EmmoFish extends AbstractAnimal {
	protected int numbersOfEmmo;
	protected String doublColor;

	public int getNumbersOfEmmo() {
		return numbersOfEmmo;
	}

	public void setNumbersOfEmmo(int numbersOfEmmo) {
		this.numbersOfEmmo = numbersOfEmmo;
	}

	public String getDoublColor() {
		return doublColor;
	}

	public void setDoublColor(String doublColor) {
		this.doublColor = doublColor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doublColor == null) ? 0 : doublColor.hashCode());
		result = prime * result + numbersOfEmmo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmmoFish other = (EmmoFish) obj;
		if (doublColor == null) {
			if (other.doublColor != null)
				return false;
		} else if (!doublColor.equals(other.doublColor))
			return false;
		if (numbersOfEmmo != other.numbersOfEmmo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmmoFish [numbersOfEmmo=" + numbersOfEmmo + ", doublColor=" + doublColor + "]";
	}

	public EmmoFish(int numbersOfEmmo, String doublColor, int weight , int mediumYearLife, int yearLife , String type) {
		super(weight, mediumYearLife, yearLife, yearLife, yearLife, type);
		this.numbersOfEmmo = numbersOfEmmo;
		this.doublColor = doublColor;
	}

}
