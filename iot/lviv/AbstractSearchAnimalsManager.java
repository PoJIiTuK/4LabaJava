package iot.lviv;


	import java.util.LinkedList;

	import java.util.List;

	import org.junit.jupiter.api.BeforeEach;

	import model.AbstractAnimal;
	import model.Delfin;
	import model.EmmoFish;
	import model.Whale;
	
	public abstract class AbstractSearchAnimalsManager {
		protected List<AbstractAnimal> delfins;
		protected List<AbstractAnimal> emmoFishs;
		protected List<AbstractAnimal> whales;

		@BeforeEach
		public void joinDelfin() {
			delfins = new LinkedList<AbstractAnimal>();
			delfins.add(new Delfin(1, 1, 1, 1, null));
			delfins.add(new Delfin(2, 2, 2, 2, null));
			delfins.add(new Delfin(3, 3, 3, 3, null));
		}
		@BeforeEach
		public void joinEmmoFish() {
			emmoFishs = new LinkedList<AbstractAnimal>();
			emmoFishs.add(new EmmoFish(3, null, 3, 3, 3, null));
			emmoFishs.add(new EmmoFish(5, null, 5, 5, 5, null));
			emmoFishs.add(new EmmoFish(6, null, 6, 6, 6, null));
		}
		@BeforeEach
		public void joinWhale() {
			whales = new LinkedList<AbstractAnimal>();
			whales.add(new Whale(4, 4, 4, null, 0));
			whales.add(new Whale(5, 5, 5, null, 5));
			whales.add(new Whale(5, 5, 5, null, 1));
		}
	}
