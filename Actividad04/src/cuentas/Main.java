package cuentas;

public class Main {

    public static void main(String[] args) {
       /**
        * llamada del metodo estatico operativa_cuenta
        */
    	operativa_cuenta();
    }
    /**
     * metodo estatico en donde se estancia un objeto de la clase CCuenta y se llama a varios metodos de la clase.
     */
	public static void operativa_cuenta() {
		
		float cantidad;
		CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
