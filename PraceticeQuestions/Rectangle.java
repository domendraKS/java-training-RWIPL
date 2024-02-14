package PraceticeQuestions;

public class Rectangle {
    private float width;
    private float height;

    void setWidth(float w) {
        this.width = w;
    }

    void setHeight(float h) {
        this.height = h;
    }

    float getArea() {
        return this.height * this.width;
    }

    float getPerimeter() {
        return ((this.height + this.width) * 2);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(5f);
        r.setHeight(5f);

        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
