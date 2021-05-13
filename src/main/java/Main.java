import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<City> cities = App.downloadTheDirectory("src/main/java/Cities.txt");
        App.printListCities(cities);

        AppComparator.sortedByName(cities);
        App.printListCities(cities);

        AppComparator.sortedByDistrictAndName(cities);
        App.printListCities(cities);

        App.FindingTheNumberOfCitiesInRegions(cities);
    }

}