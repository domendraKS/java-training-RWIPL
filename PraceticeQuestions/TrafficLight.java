package PraceticeQuestions;

public class TrafficLight {
    String colour;
    int duration;

    TrafficLight(String colour, int duration) {
        this.colour = colour;
        this.duration = duration;
    }

    void changeColour(String colour) {
        this.colour = colour;
    }

    String getColor() {
        return this.colour;
    }

    // boolean checkColor(String colour) {
    // if (this.colour.equalsIgnoreCase(colour)) {
    // return true;
    // }
    // return false;
    // }

    boolean isRed() {
        return this.colour.equalsIgnoreCase("red");
    }

    boolean isGreen() {
        return this.colour.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        TrafficLight obj = new TrafficLight("Green", 5);
        obj.changeColour("Green");

        System.out.println("Colour : " + obj.getColor());

        // System.out.println(obj.checkColor("red"));

        System.out.println("\nIs the light red : " + obj.isRed());
        System.out.println("Is the light green : " + obj.isGreen());
    }
}
