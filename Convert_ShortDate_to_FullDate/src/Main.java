import java.text.DateFormatSymbols;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String ShortDate ="";
        String [] Year ;
        System.out.print("Enter Date your want to convert(YYYY-MM-DD) or 0 for Exit :");
        ShortDate = input.next();
        Year=ShortDate.split("-");
        int month =Integer.parseInt(Year[1]);
         for(int i=1; i<=12;i++){
             if(month==i){
                 Year[1]= new DateFormatSymbols().getMonths()[i-1];
                 System.out.println("FullDate: " +Year[1]+" "+Year[2]+","+Year[0]);
             }
         }

    }
}