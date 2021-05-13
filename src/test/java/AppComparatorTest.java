import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class AppComparatorTest {
    @Test
    public void test_SortedByName() {
        List<City> data = new ArrayList<>(Arrays.asList(
                new City("Абакан", "Хакасия", "Сибирский", 165183, 1931),
                new City("Горно-Алтайск", "Алтай", "Сибирский", 56928, 1830),
                new City("Абаза", "Хакасия", "Сибирский", 17111, 1867),
                new City("Агидель", "Башкортостан", "Приволжский", 16365, 1980),
                new City("Амурск", "Хабаровский край", "Дальневосточный", 42977, 1958)));

        List<City> expected = new ArrayList<>(Arrays.asList(
                new City("Абаза", "Хакасия", "Сибирский", 17111, 1867),
                new City("Абакан", "Хакасия", "Сибирский", 165183, 1931),
                new City("Агидель", "Башкортостан", "Приволжский", 16365, 1980),
                new City("Амурск", "Хабаровский край", "Дальневосточный", 42977, 1958),
                new City("Горно-Алтайск", "Алтай", "Сибирский", 56928, 1830)));

        Assertions.assertEquals(expected, AppComparator.sortedByName(data));
    }

    @Test
    public void test_SortedByDistrictAndName() {
        List<City> data = new ArrayList<>(Arrays.asList(
                new City("Абакан", "Хакасия", "Сибирский", 165183, 1931),
                new City("Горно-Алтайск", "Алтай", "Сибирский", 56928, 1830),
                new City("Абаза", "Хакасия", "Сибирский", 17111, 1867),
                new City("Агидель", "Башкортостан", "Приволжский", 16365, 1980),
                new City("Амурск", "Хабаровский край", "Дальневосточный", 42977, 1958)));

        List<City> expected = new ArrayList<>(Arrays.asList(
                new City("Амурск", "Хабаровский край", "Дальневосточный", 42977, 1958),
                new City("Агидель", "Башкортостан", "Приволжский", 16365, 1980),
                new City("Абаза", "Хакасия", "Сибирский", 17111, 1867),
                new City("Абакан", "Хакасия", "Сибирский", 165183, 1931),
                new City("Горно-Алтайск", "Алтай", "Сибирский", 56928, 1830)));

        Assertions.assertEquals(expected, AppComparator.sortedByDistrictAndName(data));
    }

}