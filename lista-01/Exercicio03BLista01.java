import java.util.Objects;
import java.util.Random;

public class Exercicio03BLista01{

    public static void main(String[] args) {

        // Vatiável que determina o tamanho da matriz
        int n = 9;
        // Variável que determina a quantidade de bombas
        int bomba = 10;

        // Matriz de string
        String [][] campo = new String [n][n];

        // Laço que cria a matriz de string de tamanho  n x n preenchida com  "."
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                campo[i][j] = ".";
            }    
        }
        // Obtendo numeros pseudo aleatórios 
        Random r = new Random();

        // Laço que sorteia uma linha e uma coluna, até completar a quantidade de bombas 
        for (int i = 0; i < bomba; i++){
            int linha = r.nextInt(9);
            int coluna = r.nextInt(9);
            // Se já tiver uma bomba no espaço sorteado i--
            if(Objects.equals(campo[linha][coluna], "*")){
                i--;
            } else 
                campo[linha][coluna] = "*";

        }
        
        // Laço para printar a matriz na tela
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                    System.out.print(campo[i][j]+ "");  
            }      
            System.out.println("");
            
        }
    }       
}

 





