package manager;

import java.util.Comparator;
import java.util.List;

import model.AbstractAnimal;
import model.SortType;

@SuppressWarnings("unused")
public class AnimalManegerUtil {
	public static void sortByVolumeOfTheAquarium() {
		private static final DelfinsSortByVolumeOfTheAquarium SORT_BY_VOLUME_OF_THE_AQUARIUM = new DelfinsSortByVolumeOfTheAquarium();

		public static void sortByVolumeOfTheAquarium(List<AbstractAnimal> animals, SortType sortType) {

			animals.sort(sortType == SortType.ASCENDING ? SORT_BY_VOLUME_OF_THE_AQUARIUM
					: SORT_BY_VOLUME_OF_THE_AQUARIUM.reversed());
		}

		static class DelfinsSortByVolumeOfTheAquarium implements Comparator<AbstractAnimal> {

			@Override
			public int compare(AbstractAnimal firstAnimal, AbstractAnimal secondAnimal) {
				return firstAnimal.getByVolumeOfTheAquarium() - secondAnimal.getByVolumeOfTheAquarium();
			}

		}
//
		public static void sortByPointDelfins(List<AbstractAnimal> animals, SortType sortType) {
			Comparator<AbstractAnimal> comparator = Comparator.comparing(AbstractAnimal::getPoint);
			animals.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
		}

		class SorterByPointDelfins implements Comparator<AbstractAnimal> {

			@Override
			public int compare(AbstractAnimal firstAnimal, AbstractAnimal secondAnimal) {
				return firstAnimal.getPoint().compareTo(secondAnimal.getPoint());
			}
		}

		public static void sortByAgeInYearsDelfins(List<AbstractAnimal> animals, SortType sortType) {
			Comparator<AbstractAnimal> comparator = new Comparator<AbstractAnimal>() {

				@Override
				public int compare(AbstractAnimal firstAnimal, AbstractAnimal secondAnimal) {
					return (int) (firstAnimal.getAgeInYears() - secondAnimal.getAgeInYears());

				}
			};

			if (sortType == SortType.ASCENDING) {
				animals.sort(comparator);
			}

			else {
				animals.sort(comparator.reversed());

			}
		}
	}
	
