package WeatherToday.Server;

import WeatherToday.WeatherReport.WholeReport;
//maps the wholeReport to a Dto object

public class DTOMapper {

    public static WeatherTodayDTO from(WholeReport wholeReport) {

        // Weather array always has at least 1 element
        String weatherMain = wholeReport.getWeather().getFirst().getMain();
        String weatherDescription = wholeReport.getWeather().getFirst().getDescription();

        return new WeatherTodayDTO(
                wholeReport.getName(),                 // city
                wholeReport.getSys().getCountry(),     // ISO country
                wholeReport.getCoord().getLon(),       // longitude
                wholeReport.getCoord().getLat(),       // latitude
                wholeReport.getMain().getTemp(),       // temperature
                wholeReport.getMain().getFeels_like(), // feels like
                wholeReport.getMain().getHumidity(),   // humidity
                weatherMain,                           // weather main
                weatherDescription                      // weather description
        );
    }
}


