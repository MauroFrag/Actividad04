package cuentas;

public class CCuenta {

	/**
	 * Clase que contiene cuatro variables, un constructor y diferentes metodos
	 * @author Mauro
	 */
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

   
    /**
     * Constructor vacio.
     */
	public CCuenta()
    {
    }
	
	/**
	 * Constructor que pide 4 parametros para crear una instancia de este objeto.
	 * @param nom
	 * @param cue
	 * @param sal
	 * @param tipo
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Metodo que que devuelve el saldo de la cuenta.
     * @return saldo
     */

    public double estado()
    {
        return saldo;
    }

    /**
     * Metodo para ingresar una cantidad por parametro y que lanza una excepcion si la cantidad es negativa
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * metodo para retirar una cantidad pasada por parametro y lanza una excepcion si el estado 
     * es menor que la cantidad o si el saldo es menor que la cantidad a retirar
     * @param cantidad
     * @throws Exception
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Metodos getters y setters
     * @return 
     */
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
