import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    public static List<City> downloadTheDirectory(String path) {
        List<City> cities = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String[] cityData = scanner.nextLine().split(";");
                if (cityData.length != 6) {
                    System.out.println("Данные некорректны");
                }
                City city = new City(cityData[1], cityData[2], cityData[3], Integer.parseInt(cityData[4]), Integer.parseInt(cityData[5]));
                cities.add(city);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }

        return cities;
    }

    public static void printListCities(List<City> cities) {
        for (City city : cities) {
            System.out.println(city);
        }
    }


    public static String FindTheCityWithTheLargestPopulation(List<City> cities) {
        City[] citiesArr = cities.toArray(new City[0]);
        City city = citiesArr[0];
        int index = 0;
        for (int i = 0; i < citiesArr.length - 1; i++) {
            if (city.getPopulation() < citiesArr[i + 1].getPopulation()) {
                city = citiesArr[i + 1];
                index = i;
            }
        }

        return ("[" + index + "] = " + city.getPopulation());
    }

    public static Map<String, Integer> FindingTheNumberOfCitiesInRegions(List<City> cities) {
        Map<String, Integer> regions = new HashMap<>();
        for (int i = 0; i < cities.size(); i++) {
            if (!regions.containsKey(cities.get(i).getRegion())) {
                regions.put(cities.get(i).getRegion(), 1);
            } else {
                Integer count = regions.get(cities.get(i).getRegion());
                count += count;
                regions.put(cities.get(i).getRegion(), count);
            }
        }

        return regions;
    }
}
