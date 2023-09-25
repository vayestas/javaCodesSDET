package class25;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        /*
        print all countries in alphabetical order in 2 different ways
         */
        TreeSet<String> countries = new TreeSet<>();
        countries.add("England");
        countries.add("Brazil");
        countries.add("Argentina");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Peru");
        countries.add("Pakistan");
        countries.add("Germany");
        countries.add("Poland");
        countries.add("Turkey");
        System.out.println(countries);
        System.out.println();
        for(String c:countries) {
            System.out.println(c);
        }
        countries.forEach(x-> System.out.println(x));
    }

    }

