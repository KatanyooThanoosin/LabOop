public class Lab1_1 {
    public static void main(String[] args){
        int yearTime = 60*60*24*365;
        System.out.println("Year 1 = "+(312032486+yearTime/7-yearTime/13+yearTime/45));
        System.out.println("Year 2 = "+(312032486+yearTime*2/7-yearTime*2/13+yearTime*2/45));
        System.out.println("Year 3 = "+(312032486+yearTime*3/7-yearTime*3/13+yearTime*3/45));
        System.out.println("Year 4 = "+(312032486+yearTime*4/7-yearTime*4/13+yearTime*4/45));
        System.out.println("Year 5 = "+(312032486+yearTime*5/7-yearTime*5/13+yearTime*5/45));
    }
}