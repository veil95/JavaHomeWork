package prac13.num3;

import java.util.StringTokenizer;

public class Adress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Adress(String adress){
        parseUsingSplit(adress);
    }

    public Adress(String adress, String delimiters){
        parseUsingStringTokenizer(adress, delimiters);
    }
    public void parseUsingSplit(String adress){
        String[] parts = adress.split(",");
        if (parts.length < 7){
            System.out.println("Incorrect format");
            return;
        }
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }
    public void parseUsingStringTokenizer(String adress, String delimiters){
        StringTokenizer tokenizer = new StringTokenizer(adress, delimiters);
        String[] parts = new String[7];
        int i = 0;
        while (tokenizer.hasMoreTokens() && i < 7){
            parts[i] = tokenizer.nextToken();
            i++;
        }
        if (i != 7){
            System.out.println("Incorrect format");
            return;
        }
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }
    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
