import java.lang.Math;
import java.util.Scanner;

public class primeira_calculadora {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        System.out.println(" CALCULADORA EDU ");
        System.out.println(" DIGITE EM VALORES DECIMAIS POR FAVOR! ");
        System.out.print(" VALOR: ");
        double num1 = sc.nextDouble();
        
        System.out.print(" escolha o sinal: ");
        char simbols = sc.next().charAt(0);
        
        System.out.print(" VALOR 2°: ");
        double num2 = sc.nextDouble();
        
        
        if(simbols == '+') {
        	System.out.println(num1 + num2);
        }
        if(simbols == '-') {
        	System.out.println(num1 - num2);
        }
        if(simbols == '*') {
        	System.out.println(num1 * num2);
        }
        if(simbols == '/') {
        	System.out.println(num1 / num2);
        }
    }
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        System.out.println(" CALCULADORA EDU ");
        System.out.println(" DIGITE EM VALORES DECIMAIS POR FAVOR! ");
        System.out.print(" VALOR: ");
        double num1 = sc.nextDouble();
        
        System.out.print(" escolha o sinal: ");
        char simbols = sc.next().charAt(0);
        
        System.out.print(" VALOR 2°: ");
        double num2 = sc.nextDouble();
        
        
        if(simbols == '+') {
        	System.out.println(num1 + num2);
        }
        if(simbols == '-') {
        	System.out.println(num1 - num2);
        }
        if(simbols == '*') {
        	System.out.println(num1 * num2);
        }
        if(simbols == '/') {
        	System.out.println(num1 / num2);
        }
    }
}