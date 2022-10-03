package lab3;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class House {
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double area;
    private double numberOfFloors;

    public House(int numberOfBedrooms, int numberOfBathrooms, double area, double numberOfFloors) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.area = area;
        this.numberOfFloors = numberOfFloors;
    }

    public static House createFromText(String text) throws ParseException {
        // Implement static factory method
        int numberOfBedrooms = 0;
        int numberOfBathrooms = 0;
        double area = 0;
        double numberOfFloors = 0;

        Pattern pattern = Pattern.compile("[0-9]+\\sbed", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            numberOfBedrooms = Integer.parseInt(String.valueOf(matcher.group().charAt(0)));
        }
        Pattern pattern1 = Pattern.compile("[0-9]+\\sbath", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(text);
        while (matcher1.find()) {
            numberOfBathrooms = Integer.parseInt(String.valueOf(matcher1.group().charAt(0)));
        }
        Pattern pattern2 = Pattern.compile("[0-9]?\\,?[0-9]*\\ssq", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()) {
            NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
            Number number = format.parse(matcher2.group().split(" ")[0]);
            area = number.doubleValue();
        }
        if (text.contains("single") || text.contains("1 story") || text.contains("1-")) {
            numberOfFloors = 1;
        } else if (text.contains("Two+")) {
            numberOfFloors = 2.5;
        }
        return new House(numberOfBedrooms, numberOfBathrooms, area, numberOfFloors);
    }

    @Override
    public String toString() {
        return "House{numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", area="+ area +", numberOfFloors=" + numberOfFloors + "}";
    }
}

public class NewMain {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        String text = sc.nextLine();
        System.out.println(House.createFromText(text));
    }
}

// The Yosemite II is a 1,366 sq. ft. 3 bedroom, 2 bathroom single-story home.
// House{numberOfBedrooms=3, numberOfBathrooms=2, area=1.366, numberOfFloors=1.0}
// single-story

// The Burkburnett II 1 story plan, featuring approximately 2469 sq. ft., is a home with 3 bedrooms, 2 bathrooms, and a 2-car attached garage.
// House{numberOfBedrooms=3, numberOfBathrooms=2, area=2469.0, numberOfFloors=1.0}
// 1 story

// Name: 23 Oak Ridge Type: Detached Two+ Story Ownership: Fee simple Beds: 4 Beds Baths: 3 Baths Interior Size: 2812 SqFt Lot Size: - Ceiling Heights: -
// House{numberOfBedrooms=4, numberOfBathrooms=3, area=2812.0, numberOfFloors=2.5}
// Two+ Story

// <span style="padding-top: 5px;display:inline-block;">3 Beds</span><span style="padding-top: 5px;display:inline-block;">2 Baths</span><span style="padding-top: 5px;display:inline-block;">2 Baths</span><span style="padding-top: 5px;display:inline-block;">1959 SqFt</span>This elegant 1-story is soaring with 11-foot ceilings and a spacious floor plan!
// House{numberOfBedrooms=3, numberOfBathrooms=2, area=1959.0, numberOfFloors=1.0}
// 1-story


