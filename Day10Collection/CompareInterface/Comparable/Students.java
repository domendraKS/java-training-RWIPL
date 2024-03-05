public class Students implements Comparable<Students> {
    int rollNo;
    String name;
    float percent;

    @Override
    // public int compareTo(Students st) {
    // return this.rollNo - st.rollNo;
    // }
    public int compareTo(Students st) {
        System.out.println(this.name + "--" + st.name);
        // return this.name.compareTo(st.name);
        return this.rollNo - st.rollNo;
    }

    Students(int rollNo, String name, float percent) {
        this.rollNo = rollNo;
        this.name = name;
        this.percent = percent;
    }

    // @Override
    // public String toString() {
    // return "Student{" + "name='" + name + '\'' + ", percent = " + percent + '}';
    // }
}
