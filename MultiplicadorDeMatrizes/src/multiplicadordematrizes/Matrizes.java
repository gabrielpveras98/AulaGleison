package multiplicadordematrizes;

import java.util.Scanner;

public class Matrizes {
    public double[][] receberMatrizDe(int linhas, int colunas){
        double matriz[][] = new double[linhas][colunas];
        Scanner teclado = new Scanner(System.in);
        for(int a = 0;a<linhas;a++){
            for(int b = 0;b<colunas;b++){
                int c = a+1;
                int d = b+1;
                System.out.print("Informe o elemento que ficará na linha " + c + " e na coluna " + d + ": ");
                matriz[a][b] = teclado.nextDouble();
            }
        }
        return matriz;
    }
    
    public void mostrarMatriz(double[][] a, int b, int c){
        for(int d = 0;d < b; d++){
            for(int e = 0; e<c;e++){
                System.out.print(a[d][e] + " ");
            }
            System.out.println("");
        }
    }
    
    public double[][] multiplicaAsMatrizes(double[][] a, double[][] b, int linhasDeA, int linhasDeB, int colunasDeA, int colunasDeB){
        double[][] matriz = new double[linhasDeA][colunasDeB];
        for(int c = 0; c<linhasDeA; c++){
            for(int d = 0; d<colunasDeB;d++){
                for(int e = 0;e<colunasDeA;e++){
                    matriz[d][c] += a[d][e] * b[e][c];
                }
            }
        }        
        return matriz;
    }
    
    public double[][] somarAsMatrizes(double[][] matrizA, double[][] matrizB, int a, int b) {
        double[][] matriz = new double[a][b];
        for(int c = 0;c<a;c++){
            for(int d = 0;d<b;d++){
                matriz[c][d] = matrizA[c][d] + matrizB[c][d];
            }
        }
        return matriz;
    }
    
    public double[][] subtrairAsMatrizes(double[][] a, double[][] b, int c, int d){
        double[][] matriz = new double[c][d];
        for(int e = 0; e<c;e++){
            for(int f = 0;f<d;f++){
                matriz[e][f] = a[e][f] - b[e][f];
            }
        }
        return matriz;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Matrizes matrizes = new Matrizes();
        
        System.out.println("##### Tudo sobre matrizes #####");
        System.out.println("Qual das seguintes operações você deseja fazer? ");
        System.out.println("Se for soma, aperte [1]");
        System.out.println("Se for subtração, aperte [2]");
        System.out.println("Se for multiplicação, aperte [3]");
        System.out.println("Se deseja sair aperte qualquer outra tecla");
        System.out.println("\nObservação: após digitar a opção desejada aperte [enter]");
        System.out.print("Qual sua opção? ");
        
        String z = teclado.nextLine();
        int a, b, c, d;
        
        while(z.equals("1")||z.equals("2")||z.equals("3")){
            switch (z) {
                case "1":
                    System.out.print("Numero de linhas da primeira matriz: ");
                    a = teclado.nextInt();
                    System.out.print("Numero de colunas da primeira matriz: ");
                    b = teclado.nextInt();
                    System.out.print("Numero de linhas da segunda matriz: ");
                    c = teclado.nextInt();
                    System.out.print("Numero de colunas da segunda matriz: ");
                    d = teclado.nextInt();
                    if((a == c) && (b == d)){
                        double matrizA[][] = matrizes.receberMatrizDe(a, b);
                        double matrizB[][] = matrizes.receberMatrizDe(c, d);
                        
                        double matrizC[][] = matrizes.somarAsMatrizes(matrizA, matrizB, a, b);
                        
                        matrizes.mostrarMatriz(matrizC, a, b);
                    }
                    break;
                case "2":
                    System.out.print("Numero de linhas da primeira matriz: ");
                    a = teclado.nextInt();
                    System.out.print("Numero de colunas da primeira matriz: ");
                    b = teclado.nextInt();
                    System.out.print("Numero de linhas da segunda matriz: ");
                    c = teclado.nextInt();
                    System.out.print("Numero de colunas da segunda matriz: ");
                    d = teclado.nextInt();
                    if((a==c) && (b==d)){
                        double[][] matrizA = matrizes.receberMatrizDe(a, b);
                        double[][] matrizB = matrizes.receberMatrizDe(c, d);
                        
                        double[][] matrizC = matrizes.subtrairAsMatrizes(matrizA, matrizB, a, b);
                        
                        matrizes.mostrarMatriz(matrizC, a, b);
                    }
                    break;
                case "3":
                    System.out.print("Numero de linhas da primeira matriz: ");
                    a = teclado.nextInt();
                    System.out.print("Numero de colunas da primeira matriz: ");
                    b = teclado.nextInt();
                    System.out.print("Numero de linhas da segunda matriz: ");
                    c = teclado.nextInt();
                    System.out.print("Numero de colunas da segunda matriz: ");
                    d = teclado.nextInt();
                    String x;
                    if(b != c){
                        System.out.println("##### ERRO! #####");
                        System.out.println("As duas matrizes não podem ser multiplicadas!");
                        
                        System.out.println("Aperte enter para voltar ao menu principal");
                        x = teclado.nextLine();
                    }else{
                        double matrizA[][] = matrizes.receberMatrizDe(a, b);
                        double matrizB[][] = matrizes.receberMatrizDe(c, d);
                        
                        double matrizC[][] = matrizes.multiplicaAsMatrizes(matrizA, matrizB, a, c, b, d);
                        
                        matrizes.mostrarMatriz(matrizC, a, d);
                        
                        System.out.println("Aperte enter para voltar ao menu principal");
                        x = teclado.nextLine();
                    }
                    break;
                default:
                    System.out.println("Provavelmente essa opção não vai acontecer, mas pro caso de eu ter errado alguma coisa...");
                    break;
            }
            System.out.println("##### Tudo sobre matrizes #####");
            System.out.println("Qual das seguintes operações você deseja fazer? ");
            System.out.println("Se for soma, aperte [1]");
            System.out.println("Se for subtração, aperte [2]");
            System.out.println("Se for multiplicação, aperte [3]");
            System.out.println("Se deseja sair aperte qualquer outra tecla");
            System.out.println("\nObservação: após digitar a opção desejada aperte [enter]");
            System.out.print("Qual sua opção? ");
            z = teclado.nextLine();
        }
        System.out.println("##### Fim do programa!!! #####");
    }
}
