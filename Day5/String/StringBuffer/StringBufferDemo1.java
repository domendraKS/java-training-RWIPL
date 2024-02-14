// package Day5.String.StringBuffer;

public class StringBufferDemo1 {
    public static void main(String[] args) {
        /* Capacity */
        // StringBuffer sb1 = new StringBuffer("Shubham");
        // StringBuffer sb1 = new StringBuffer(1000); //default size 1000
        // System.out.println(sb1.capacity()); // default value + sb1.length => 16 +
        // sb1.length

        // StringBuffer sb2 = new StringBuffer();
        // sb2.append("Shubham Sahu Saloni");
        // // if the sb2 capacity is more than 16(default value)
        // // then new capacity is (oldCapacity*2)+2 or (oldCapacity+1)*2
        // System.out.println(sb2.capacity());

        /* Append */
        // StringBuffer sb3 = new StringBuffer("Shubham Sahu");
        // sb3.append(" Hello");
        // System.out.println(sb3);

        /* charAt */
        // StringBuffer sb4 = new StringBuffer("Shubham Sahu");
        // System.out.println(sb4.charAt(5));

        /* delete and deleteCharAt */
        // StringBuffer sb5 = new StringBuffer("Shubham Saloni");
        // System.out.println(sb5.delete(5, 7));
        // System.out.println(sb5.deleteCharAt(6));

        /* indexOf() and lastIndecOf() */
        // StringBuffer sb6 = new StringBuffer("Tony Stark");
        // System.out.println(sb6.indexOf("T"));
        // System.out.println(sb6.lastIndexOf("t"));

        /* Insert(index, "String") and replace */
        // StringBuffer sb7 = new StringBuffer("Shubham Saloni");
        // System.out.println(sb7.insert(8, "from "));
        // System.out.println(sb7.replace(8, sb7.length(), "Sahu"));

        /* Reverse */
        // StringBuffer sb8 = new StringBuffer("Piyush Sahu");
        // System.out.println(sb8.reverse());

        /* Sub-Sequence or Sub-String */
        // StringBuffer sb9 = new StringBuffer("javaRAMjava");
        // System.out.println(sb9.subSequence(4, 7));

        /* remove extra space */
        StringBuffer sb10 = new StringBuffer();
        sb10.ensureCapacity(100); // setCapacity
        sb10.append("Hello");
        sb10.trimToSize(); // remove extra space
        System.out.println(sb10.capacity());
    }
}