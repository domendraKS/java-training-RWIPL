package PraceticeQuestions;

public class Circle {
    private float radius;
    private final float pi = 3.141f;

    void setRadius(float r) {
        this.radius = r;
    }

    float getArea() {
        return (pi * (this.radius * this.radius));
    }

    float getCircumference() {
        return (2 * pi * this.radius);
    }

    public static void main(String[] args) {
        Circle r = new Circle();
        r.setRadius(5f);

        System.out.println(r.getArea());
        System.out.println(r.getCircumference());
    }
}
