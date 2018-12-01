package atividadedogleison;
import java.util.Scanner;
public class Questao4{
    public static void main(String[] args){
        System.out.print("Digite um valor para ver sua tabuada: ");
        Scanner t=new Scanner(System.in);
        int a=t.nextInt();
        System.out.println("Tabuada de "+a+" :");
        for(int e=0;e<=10;e++){
            System.out.println(a+"*"+e+"="+a*e);
        }
    }
}
