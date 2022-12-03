import java.util.Scanner;

public class Converter {


    public static void main(String[] args) {
        while (true) {


        System.out.println("Kilograms:");

        Scanner in = new Scanner(System.in);

        float kilo = in.nextFloat();
        float gr = KgToGr(kilo);

        System.out.println(kilo + " kilogram" + " = " + gr + " grams");


    } }

    private static float KgToGr(float inGram) {
        return inGram * 1000;
    }
}