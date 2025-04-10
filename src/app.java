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
        Scanner leer = new Scanner(System.in);
        String nombreEmpleado = "";
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
        double valorSalarioMinimo = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario:");
        usuarioEmpleado=leer.nextLine();
        System.out.println("Por favor ingresar su contraseña:");
        contrasenaUsuario=leer.nextLine();
        if (usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin")) {
            System.out.println("Ha ingresado de manera correcta");
            System.out.print("Por favor ingrese el nombre del empleado ");
            nombreEmpleado=leer.nextLine();
            System.out.print("Ingrese su documento de identidad ");
            Documento=leer.nextLine();
            System.out.print("Ingrese el día de descanso (debe ser de lunes a viernes) ");
            diaDescanso=leer.nextLine();
            System.out.print("Ingrese el valor de la hora ");
            valorHora=leer.nextDouble();
            System.out.print("Ingrese la cantidad de horas laboradas ");
            cantidadHoras=leer.nextDouble();
            System.out.print("Ingrese el valor del salario minimo actual ");
            valorSalarioMinimo = leer.nextDouble();
            salarioBruto = valorHora * cantidadHoras;
            if (salarioBruto > (valorSalarioMinimo * 2)) {
                bonificacionEmpleado = 0;
            } else {
                bonificacionEmpleado = salarioBruto * 0.1;
                auxilioTransporte = 200000;
            }
            retencionSalud = salarioBruto * 0.04;
            retencionPension = salarioBruto * 0.04;
            salarioNeto = (bonificacionEmpleado + auxilioTransporte + salarioBruto)-(retencionPension+retencionSalud);
            System.out.print("Detalle de Nómina empleado");
            System.out.println("El empleado " + nombreEmpleado + " con documento " + Documento + " Tiene el siguiente detalle de nomina:\nSalario Bruto: " + salarioBruto + "\nSalario Neto: "+ salarioNeto +"\nDeduccion por salud: "+retencionSalud+"\nDeduccion por pension: "+retencionPension+"\nAuxilio de transporte: "+auxilioTransporte+"\nBonificacion empleado: "+bonificacionEmpleado);

        }else{
            System.out.println("Error en credenciales");
        }
    }
}


