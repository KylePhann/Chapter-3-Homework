package farm;

public class Chicken extends FarmAnimal {

    private String sound = "Cluck Cluck";
    private String sound2 = "Cock-a-Doodle-doo";

    public String getSound2() {
        return sound2;
    }

    public void setSound2(String sound2) {
        this.sound2 = sound2;
    }



    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String  feedLoadingSchedule() {
        return getName() + ": 8am-4pm";

    }

    public Chicken(String name, String gender, double weight, int age){
            super(name, gender, weight, age);

    }
}
