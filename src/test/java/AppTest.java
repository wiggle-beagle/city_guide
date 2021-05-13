import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class AppTest {

    @Test
    public void test_DownloadTheManual_success() {

        String path = "src/test/java/TestCities.txt";
        List<City> expected = new ArrayList<>(Arrays.asList(new City("Абакан", "Хакасия", "Сибирский", 165183, 1931),
                new City("Агидель", "Башкортостан", "Приволжский", 16365, 1980)));
        List<City> result = App.downloadTheDirectory(path);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void FAILED_test_DownloadTheManual() {

        String path = "src/test/java/FAILED_TestCities.txt";
        List<City> expected = new ArrayList<>(Arrays.asList(new City("Абакан", "Хакасия", "Сибирский", 165183, 1931),
                new City("Агидель", "Башкортостан", "Приволжский", 16365, 1980)));
        List<City> result = App.downloadTheDirectory(path);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test_FindTheCityWithTheLargestPopulation() {
        List<City> data = new ArrayList<>(Arrays.asList(
                new City("Абакан", "Хакасия", "Сибирский", 165183, 1931),
                new City("Горно-Алтайск", "Алтай", "Сибирский", 56928, 1830),
                new City("Абаза", "Хакасия", "Сибирский", 17111, 1867),
                new City("Агидель", "Башкортостан", "Приволжский", 16365, 1980),
                new City("Амурск", "Хабаровский край", "Дальневосточный", 42977, 1958)));

        String expected = "[0] = 165183";
        String result = App.FindTheCityWithTheLargestPopulation(data);
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void test_FindingTheNumberOfCitiesInRegions() {
        List<City> data = new ArrayList<>(Arrays.asList(
                new City("Абакан", "Хакасия", "Сибирский", 165183, 1931),
                new City("Горно-Алтайск", "Алтай", "Сибирский", 56928, 1830),
                new City("Абаза", "Хакасия", "Сибирский", 17111, 1867),
                new City("Агидель", "Башкортостан", "Приволжский", 16365, 1980),
                new City("Амурск", "Хабаровский край", "Дальневосточный", 42977, 1958)));


        Map<String, Integer> expected = new HashMap<>();
        expected.put("Хакасия", 2);
        expected.put("Алтай", 1);
        expected.put("Башкортостан", 1);
        expected.put("Хабаровский край", 1);

        Map<String, Integer> result = App.FindingTheNumberOfCitiesInRegions(data);
        Assertions.assertEquals(expected, result);


    }


}



