package model;
import model.Climat;

@SuppressWarnings("unused")
public class Delfin extends AbstractAnimal {
	protected int tailLeight;

	public int getTailLeight() {
		return tailLeight;
	}

	public void setTailLeight(int tailLeight) {
		this.tailLeight = tailLeight;
	}

	@Override
	public String toString() {
		return "Delfin [tailLeight=" + tailLeight + "]";
	}

	public Delfin(int tailLeight, int weight , int mediumYearLife, int yearLife , String type) {
		super(weight, mediumYearLife, yearLife, yearLife, yearLife, type);
		this.tailLeight = tailLeight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tailLeight;
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
		Delfin other = (Delfin) obj;
		if (tailLeight != other.tailLeight)
			return false;
		return true;
	}

	

}
