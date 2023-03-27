import java.util.Scanner;
/**
 * CaC Inicial
 * Desafío 2
 * Crear un sistema de validación de un usuario, que recibe como parámetro un usuario y una contraseña y
 * según sean válidos o no, muestra un mensaje al usuario.
 * {@code @author:} Juliana Novo
 */
public class Desafio19FuncionesJava {
    public static void main(String[] args) {
        Scanner miTeclado;
        miTeclado = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        String user = miTeclado.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String pass = miTeclado.nextLine();
        if (user.equals("Codo.a.Codo")) {
            if (pass.equals("CaC-Inicial")) {
                System.out.println("Bienvenidx");
            }
        }
        else {
            System.out.println("Las credenciales ingresadas no son válidas");
        }
    }
}

