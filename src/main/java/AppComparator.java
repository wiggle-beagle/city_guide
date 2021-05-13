import java.util.List;

public class AppComparator {
    public static List<City> sortedByName(List<City> cities) {
        cities.sort(((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName())));
        return cities;
    }

    public static List<City> sortedByDistrictAndName(List<City> cities) {
        cities.sort((o1, o2) -> {
            if (o1.district.equals(o2.district)) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getDistrict().compareTo(o2.getDistrict());
            }
        });
        return cities;
    }
}
