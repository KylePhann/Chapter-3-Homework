package farm;
import java.util.ArrayList;


public class MyFarm {
    public static void main(String[] args) {
        Chicken amelia = new Chicken("Amelia", "female", 1.8, 4);
        Chicken albert = new Chicken("Albert", "male", 1.6, 2);
        Chicken dixie = new Chicken("Dixie", "female", 1.7, 4);

        Cow molly = new Cow("Molly", "female", 1600.0, 3);

        Duck donald = new Duck("Donald", "male", 3.2, 5);
        Duck cheese = new Duck("Cheese", "female", 3.6, 5);

       ArrayList <FarmAnimal> fa = new ArrayList<FarmAnimal>();
       fa.add(amelia);
       fa.add(albert);
       fa.add(dixie);
       fa.add(molly);
       fa.add(donald);
       fa.add(cheese);


       for (FarmAnimal farmAnimal : fa){


       }
       System.out.println("Duck " + donald.getSound() + donald);
       System.out.println("Duck " + cheese.getSound() + cheese);

       System.out.println("Cow " + molly.getSound() + molly);

       System.out.println("Chicken " + amelia.getSound() + amelia);
       System.out.println("Chicken " + albert.getSound2() + albert);
       System.out.println("Chicken " + dixie.getSound() + dixie);



       System.out.println(donald.feedLoadingSchedule());
       System.out.println(cheese.feedLoadingSchedule());
       System.out.println(molly.feedLoadingSchedule());
       System.out.println(albert.feedLoadingSchedule());
       System.out.println(amelia.feedLoadingSchedule());
       System.out.println(dixie.feedLoadingSchedule());





    }
}
