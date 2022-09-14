import java.util.Scanner;

public class Exercicio03CLista01{

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        while(teclado.hasNextLine()){
            System.out.println(teclado.nextLine().split("\\*")[0]);
        }    
         
    }
}