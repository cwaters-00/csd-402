//Chanceller Waters



//Fan speeds
public  class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;


    // Private
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public Fan(){
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed(){
        return speed;
    }

    public boolean isOn(){
        return on;
    }

    public void setOn(boolean on){this.on = on;}
    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius = radius;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

// generate and return a description of Fan's States

    //@ fans settings returned in a string format
    @Override
    public String toString(){
        if (on) {
             String speedName = "";
             switch (speed) {
                 case SLOW: speedName = "SLOW"; break;
                 case MEDIUM: speedName = "MEDIUM"; break;
                 case FAST: speedName = "FAST"; break;
                 default: speedName = "STOPPED";
             }
             return "Fan is ON|   |Speed; " + speedName + "|   |  Radius:  " + radius + " |   |  Color" + color;

        } else {
            return "Fan is OFF  ||  Radius; " + radius +  "|| Color:" + color;
        }

    }
}