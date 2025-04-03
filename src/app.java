import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        /*
         * Una empresa desea registrar la informacion de cada empleado, para ello cada empleado debe ingresar con su usuario y contraseña, una vez ingrese debe registrar la siguiente info:
         * Nombre completo
         * Cedula
         * Valor hora
         * Cantidad de horas
         * Seleccionar un dia de descanso en la semana de lunes a viernes
         * El sistema debe mostrar al empleado su salario neto, bruto, deduccion por salud, aux de transporte (si aplica), bonificacion del 10% si no supera 2 smlv (sin incluir transporte)
         * Toda la informacion del mensaje se debe mostrar en un mensaje descriptivo
         */

        /* Expresiones Boleanas:
         * Mayor que:
         * Menor que:
         * Mayor o igual que:
         * */
        Scanner leer =new Scanner(System.in);
        String nombreEmpleado = "" ;
        String Documento = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String contrasenaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double bonificacionEmpleado = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario:");
        usuarioEmpleado = leer.nextLine();
        System.out.println("Por favor ingresar su contraseña:");
        contrasenaUsuario = leer.nextLine();
        if (usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin")) {
            System.out.println("Ha ingresado de manera correcta");
        }else{System.out.println("Error en credenciales");
        }


    }
}
