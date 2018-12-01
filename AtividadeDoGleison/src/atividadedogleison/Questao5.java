package atividadedogleison;
import java.util.Scanner;
public class Questao5{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        System.out.print("Você deseja uma tabuada até qual valor? ");
        int a=t.nextInt();
        System.out.print("Você quer a tabuada de qual número? ");
        int b=t.nextInt();
        for(int e=0;e<= a;e++){
            System.out.println(b+"*"+e+"="+b*e);
        }
    }
}
