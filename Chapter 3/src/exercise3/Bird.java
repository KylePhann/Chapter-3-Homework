package exercise3;



public class Bird implements Flight, Movement {
    private String type;

    //private String fly = "I'm a bird who flaps wings to fly.";

    /*public String getFly() {
        return fly;
    }*/

    /*public void setFly(String fly) {
        this.fly = fly;
    }*/

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "[" +
                "type='" + type + "]";
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps my wings to fly.");


    }

    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");

    }
}