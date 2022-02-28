public class Lab8_4 {
    public static void main(String[] args) {
        Octagon oct1 = new Octagon(5);

        System.out.println("Area of oct1 : " + oct1.getArea());
        System.out.println("Perimeter of oct1 : " + oct1.getPerimeter());

        Octagon oct2 = oct1.clone();
        if (oct1.compareTo(oct2) == 1) {
            System.out.println("oct1 is equal to oct2");
        } else {
            System.out.println("oct1 is not equal to oct2");
        }
    }
}
