package atividadedogleison;
import java.util.Scanner;
public class Questao7{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        System.out.print("Digite um valor para ver sua tabuada: ");
        int a=t.nextInt();
        System.out.println("Tabuada de "+a+ " :");
        for(int e=3; e<=17;e++){
            System.out.println(a+"*"+e+"="+a*e);
        }
    }
}
