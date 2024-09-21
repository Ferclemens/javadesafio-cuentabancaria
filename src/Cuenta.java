import java.util.Scanner;

public class Cuenta {
    public static void main(String[] args) {
        String nombre = "Don Ramon";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("Nombre del cliente: "+ nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: u$s "+ saldo);
        System.out.println("*******************************");

        String menu = """
                *** Escriba el número de la opción deseada ***
                1- Consultar saldo
                2- Retirar
                3- Depositar
                9- Salir
                """;

        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("********************************");
                    System.out.println("Saldo actualizado: u$s " + saldo);
                    System.out.println("********************************");
                    break;
                case 2:
                    System.out.println("********************************");
                    System.out.println("Cuanto desea retirar: ");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Retiro aceptado");
                        System.out.println("retiró: u$s "+ valorARetirar);
                        saldo = saldo - valorARetirar;
                        System.out.println("Nuevo Saldo: u$s " + saldo);
                    }
                    System.out.println("********************************");
                    break;
                case 3:
                    System.out.println("********************************");
                    System.out.println("Cuanto desea depositar?");
                    double deposito = teclado.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Deposito aceptado");
                    System.out.println("Su nuevo saldo es de u$s " + saldo);
                    System.out.println("********************************");
                    break;
                case 9:
                    System.out.println("********************************");
                    System.out.println("Gracias por utilizar nuestros servicios!");
                    System.out.println("********************************");
                    break;
                default:
                    System.out.println("********************************");
                    System.out.println("Opcion no válida, seleccione de nuevo");
                    System.out.println("********************************");
            }
        }
    }
}
