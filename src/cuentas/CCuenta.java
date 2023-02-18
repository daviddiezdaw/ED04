/**
 * @author David Díez Sánchez
 */

package cuentas;
/**
 * La classe CCuenta té els getters i setters per poder fer feina
 */
public class CCuenta {

    /**
     * Mètode getter per nombre
     * @return torna el nom
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Mètode setter per nombre
     * @param nombre rep el nom per paràmetres i l'estableix
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Mètode getter per cuenta
     * @return torna el compte
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Mètode setter per cuenta
     * @param cuenta rep el compte per paràmetres i l'estableix
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Mètode getter per saldo
     * @return torna el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Mètode setter per saldo
     * @param saldo rep el saldo per paràmetres i l'estableix
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Mètode getter per tipoInteres
     * @return torna el tipus d'interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Mètode setter per tipoInteres
     * @param tipoInterés rep el tipus d'interés per paràmetres i l'estableix
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

/**
 * Els atributs privats que s'utilitzaran pels mètodes
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Mètode públic per poder fer feina
     */
    public CCuenta()
    {
    }

    /**
     * El mètode CCuenta rep elements per parametre
     * @param nom rep un String amb el nom
     * @param cue rep un String amb el número de compte
     * @param sal rep un double amb el saldo 
     * @param tipo rep un double amb el tipus d'interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * El mètode estado torna getSaldo
     * @return torna el saldo actual del compte
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * El mètode ingresar rep una quantitat per paràmetre i estableix el saldo més la quantitat sense tornar res
     * @param cantidad rep la quantitat a ingressar
     * @throws Exception Crea una excepció, si el saldo és negatiu, mostra el missatge que no es pot fer l'ingrés
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * El mètode retirar rep una quantitat per paràmetre i estableix el saldo menys la quantitat sense tornar res
     * @param cantidad rep la quantitat a retirar
     * @throws Exception Crea dues excepcions: 1.Si el saldo és negatiu, mostra el missatge que no es pot retirar res. 2. Si la quantitat a retirar és major al saldo també mostra excepció.  
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
