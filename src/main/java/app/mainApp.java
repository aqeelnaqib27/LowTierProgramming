package app;
import java.util.*;
import API.API;

public class mainApp {
    public static void main(String[] args) {
        API api = new API();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter location: ");
        String loc = sc.nextLine();
        String weather = api.weatherAPI(loc);
        System.out.println(weather);

        System.out.print("Enter journal: ");
        String journal = sc.nextLine();
        String sentiment = api.geminiAPI(journal);
        System.out.println(sentiment);

        sc.close();
    }
}
