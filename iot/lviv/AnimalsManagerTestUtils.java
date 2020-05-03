package iot.lviv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.AbstractAnimal;
import model.SortType;

public class AnimalsManagerTestUtils extends AbstractSearchAnimalsManager {

	@Test
	public void testSortDescending() {
		AnimalsManagerTestUtils.sortByVolumeOfTheAquarium(delfins, SortType.DESCENDING);
		assertEquals(1, delfins.get(0).getByVolumeOfTheAquarium());
		assertEquals(2, delfins.get(1).getByVolumeOfTheAquarium());
		assertEquals(3, delfins.get(2).getByVolumeOfTheAquarium());
		
	}
	@Test
	public void testSortAscending() {
		AnimalsManagerTestUtils.sortByVolumeOfTheAquarium(delfins, SortType.ASCENDING);
		assertEquals(1, delfins.get(0).getByVolumeOfTheAquarium());
		assertEquals(2, delfins.get(1).getByVolumeOfTheAquarium());
		assertEquals(3, delfins.get(2).getByVolumeOfTheAquarium());
		
	}
	

	private static void sortByVolumeOfTheAquarium(List<AbstractAnimal> delfins, SortType descending) {
		
	}
	

	@Test
	public void testSortByPointLionsAscending() {
		AnimalsManagerTestUtils.sortByPointLions(delfins, SortType.ASCENDING);
		assertEquals("women", delfins.get(0).getPoint());
		assertEquals("man", delfins.get(1).getPoint());
		assertEquals("women",delfins.get(2).getPoint());

	}

	@Test
	public void testSortByPointLionsDescending() {
		AnimalsManagerTestUtils.sortByPointLions( delfins, SortType.DESCENDING);
		assertEquals("women", delfins.get(2).getPoint());
		assertEquals("man", delfins.get(1).getPoint());
		assertEquals("women", delfins.get(0).getPoint());

	}

	private static void sortByPointLions( List<AbstractAnimal> delfins, SortType descending) {

	}

	@Test
	public void testSortByAgeInYearsLionsDescending() {
		AnimalsManagerTestUtils.sortByAgeInYearsLions(delfins, SortType.DESCENDING);
		assertEquals(11, delfins.get(2).getAgeInYears());
		assertEquals(12, delfins.get(1).getAgeInYears());
		assertEquals(10, delfins.get(0).getAgeInYears());

	}

	@Test
	public void testSortByAgeInYearsLionsAscending() {
		AnimalsManagerTestUtils.sortByAgeInYearsLions(delfins,SortType.DESCENDING);
		assertEquals(10, delfins.get(0).getAgeInYears());
		assertEquals(12, delfins.get(1).getAgeInYears());
		assertEquals(11, delfins.get(2).getAgeInYears());

	}

	private static void sortByAgeInYearsLions(List<AbstractAnimal> delfins, SortType descending) {

	}

}
}