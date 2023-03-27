import java.util.ArrayList;
import java.util.Scanner;
/**
 * CaC Inicial
 * Desafío 1
 * Programar una galleta de la suerte o bola 8 de la suerte donde al ingresar un número de la
 * suerte por teclado, el usuario reciba una frase de buena suerte. Las frases estarán almacenadas en un
 * arraylist. Se utilizará el método random para llamar un índice cualquiera del arraylist.
 * {@code @author:} Juliana Novo
 */

public class Desafio20LibreriasJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        miTeclado = new Scanner(System.in);
        ArrayList <String> frasesDeLaSuerte = new ArrayList<String>();
        frasesDeLaSuerte.add("Cada desgracia que encuentres en el camino llevará en ella la semilla de la buena suerte del mañana. Og Mandino.");
        frasesDeLaSuerte.add("Es difícil detectar la buena suerte, se parece mucho a algo que te has ganado. Frank A. Clark");
        frasesDeLaSuerte.add("Los hombres poco profundos creen en la suerte… los hombres fuertes creen en causa y efecto. Ralph Waldo Emerson");
        frasesDeLaSuerte.add("La paciencia y la perseverancia tienen un efecto mágico ante los cuales desaparecen las dificultades y los obstáculos. John Quincy Adams");
        frasesDeLaSuerte.add("La buena suerte es la hermana gemela del trabajo duro.");
        frasesDeLaSuerte.add("La suerte es la salvación de unos pocos, pero un demonio para la mayoría. Michael Titorenko");
        frasesDeLaSuerte.add("Para tener éxito, tienes que ser afortunado, o un poco loco, o muy talentoso, o encontrarte en el lugar y momento adecuado.");
        frasesDeLaSuerte.add("El cambio favorece a los que están en movimiento. James H. Austin");
        frasesDeLaSuerte.add("La gente siempre lo llama suerte cuando lo que has hecho es actuar con más sensatez que ellos. Anne Tyler");
        frasesDeLaSuerte.add("La buena suerte no necesita explicación. Shirley Temple Black");
        System.out.println("Ingresá tu número de la suerte: ");


    }
}
