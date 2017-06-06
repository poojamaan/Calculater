
package calculater;
import calculater.Calculater;
import java.util.Scanner;

public class Main {
    public static void main(String ar[])
    {
        Scanner cin=new Scanner(System.in);
        int first =cin.nextInt();
        int second= cin.nextInt();
        Calculater<Integer> cal=new Calculater(first,second);
        cal.select_Operation();
    }
    
}
