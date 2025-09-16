

public class printdate{

    public static void main(String[] args){

        printAmerican(16,2025,"September","Tuesday");
        printEuropean(16,2025,"September","Tuesday");
    }

    public static void printAmerican(int date, int year, String month, String day){

        System.out.println (day+","+month+" "+date+","+year);//american
    }


    public static void printEuropean(int date, int year, String month, String day){
        System.out.println(day+" "+date+" "+month+" "+year);//european
    }
}
