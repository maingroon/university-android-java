package ua.sumdu.borovyk.lab3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeerExpert {
    private final Map<String, List<String>> beerTypeNames = new HashMap<>();

    public BeerExpert() {
        beerTypeNames.put("light",
                Arrays.asList(
                        "Bud Light",
                        "Miller Lite",
                        "Michelob Ultra",
                        "Heineken Light",
                        "Lagunitas Daytime IPA"
                )
        );
        beerTypeNames.put("amber",
                Arrays.asList(
                        "Fat Tire Amber Ale",
                        "Tröegs Nugget Nectar",
                        "Hop Head Red",
                        "Bell’s Amber Ale",
                        "Flipside Red IPA"
                )
        );
        beerTypeNames.put("brown",
                Arrays.asList(
                        "Tommyknocker Brewery",
                        "New Planet Beer",
                        "Anderson Valley Brewing",
                        "West Sixth Brewing",
                        "Jackie O's Brewery"
                )
        );
        beerTypeNames.put("dark",
                Arrays.asList(
                        "Guinness",
                        "Murphy's",
                        "Newcastle Brown Ale",
                        "Samuel Smith's Oatmeal Stout",
                        "Young's Double Chocolate Stout"
                )
        );
    }

    public List<String> getNamesByType(String type) {
        return beerTypeNames.get(type);
    }
}
