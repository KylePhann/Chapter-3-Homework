package exercise2;

public class Airplane implements Flight{
    private String model;
    private int year;

    //private String fly = "I'm an airplane that relies on an engine to fly.";

   // public String getFly() {
       // return fly;
    //}

    //public void setFly(String fly) {
     //   this.fly = fly;
   // }

    public Airplane(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "[" +
                "model='" + model + '\'' +
                ", year=" + year +
                ']';
    }

    @Override
    public void fly() {
        System.out.println("I'm an airplane that relies on an engine to fly.");

    }
}
