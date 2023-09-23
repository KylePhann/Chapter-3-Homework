package exercise3;


import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing 747", 2016);

        Bird eagle = new Bird("Eagle");
        Bird hummingbird = new Bird("Hummingbird");
        ArrayList<Flight> f = new ArrayList<Flight>();
        f.add(boeing);
        f.add(eagle);
        f.add(hummingbird);

        for(Flight flight : f) {
            System.out.println(flight.toString() + ": ");
            flight.fly();
            flight.walk();
            flight.jump();
           /* System.out.println("Airplane " + boeing + ": " + boeing.getFly());

            System.out.println("Bird " + eagle + ": " + eagle.getFly());
            System.out.println("Bird " + hummingbird + ": " + hummingbird.getType());*/

        }
    }
}