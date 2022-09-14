import java.io.ObjectOutputStream.PutField;
import java.text.DecimalFormat;

public class Exercicio03ALista01{

    public static void main(String[] args) {


        if (args.length < 7){
            System.out.println("argumentos insuficientes");     
        } else {

            // Notas dos Projetos
            double p1 = Double.parseDouble(args[0]);
            double p2 = Double.parseDouble(args[1]);
  
            // Notas das Tarefas
            double t1 = Double.parseDouble(args[2]);
            double t2 = Double.parseDouble(args[3]);
            double t3 = Double.parseDouble(args[4]);
            double t4 = Double.parseDouble(args[5]);
            double t5 = Double.parseDouble(args[6]);

            // CacluLo do Conmceito Final
            double media = ((((p1*2)+(p2*4))/6)*0.9)+(((double)Math.exp(Math.log(t1+t2+t3+t4+t5))/5)*0.1);
        
            // Conversão para Decimal
            DecimalFormat df = new DecimalFormat("0.00");

            // se a média for => 6 APROVADO senão REPROVADO
            if (media >= 6){
                System.out.println("CF: " +  df.format(media) + " APROVADO");     
            } else {
            System.out.println("CF: " + df.format(media) + " REPROVADO");     
            }      
        }
    }
}