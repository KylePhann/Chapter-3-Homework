package farm;

public class Duck extends FarmAnimal {
    private String sound = "Quack Quack";

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Duck(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 8am-12pm-6pm";
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
