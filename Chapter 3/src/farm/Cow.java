package farm;

public class Cow extends FarmAnimal{
    private String sound = "Moo Moo";

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Cow(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 6am-4pm";

    }
}
