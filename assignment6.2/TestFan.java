    public class TestFan {
        public static void main(String[] args) {
        //creation of an instance using default constructor
        Fan defaultFan;
            defaultFan = new Fan();

//creation of an instance using
        // make it medium, on, with a radius of 7 and a color "green"
        Fan customFan = new Fan(Fan.MEDIUM, true, 7.0, "Green");

        System.out.println("_____-------Initial Fan State_________---------");
        System.out.println("Default Fan:  "+ defaultFan.toString());
        System.out.println("Custom Fan:  " + customFan.toString());

        System.out.println("\n____Modification of Default Fan State____");
        defaultFan.setOn(true);
        defaultFan.getSpeed(Fan.SLOW);
        defaultFan.setRadius(6.5);
        defaultFan.setColor("yellow");

        System.out.println("Updated to default Fan State:  "  + defaultFan.toString());


        System.out.println("\n--- Testing Getters on Updated Default Fan ---");
        System.out.println("Speed: " + defaultFan.getSpeed());
        System.out.println("Is on? " + defaultFan.isOn());
        System.out.println("Radius: " + defaultFan.getRadius());
        System.out.println("Color: " + defaultFan.getColor());




    }
}


