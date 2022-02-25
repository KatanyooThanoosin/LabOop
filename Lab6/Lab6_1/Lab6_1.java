import java.util.Scanner;

public class Lab6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name and age: ");
        String[] split = in.nextLine().split(" ");
        String name = split[0];
        int age = Integer.parseInt(split[1]);

        System.out.print("Weight (input format: 1=kg 2=pound value): ");
        split = in.nextLine().split(" ");
        int choice = Integer.parseInt(split[0]);
        double weight = Double.parseDouble(split[1]);
        if(choice==1){
            weight /= 0.45359237;
        }

        System.out.print("Height (input format: 1=meter 2=feet-inch): ");
        split = in.nextLine().split(" ");
        choice = Integer.parseInt(split[0]);
        double h;
        double feet = 0;
        double inches = 0;
        if(choice==1){
            h = Double.parseDouble(split[1]);
            h /= 0.0254;
            feet = (int)(h/12);
            inches = h-(double)feet*12;
        }
        else if(choice==2){
            feet = Double.parseDouble(split[1]);
            inches = Double.parseDouble(split[2]);
        }

        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.printf("Your BMI: %.2f\n",bmi.getBMI());
        System.out.println("Interpretation: " + bmi.getInterpretation());
        in.close();
    }
}
