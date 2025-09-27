/**
 * La clase {@code Persona} representa a una persona que puede tener asignado un boleto de museo.
 * Contiene información básica como nombre, identificación y el boleto asignado.
 * 
 * @author Sebastián Sánchez Álvarez
 * @version 1.0
 */
public class Persona {

    /** Nombre de la persona. */
    private String nombre;

    /** Identificación de la persona. */
    private String identificacion;

    /** Boleto de museo asignado a la persona. */
    private BoletoMuseo miBoleto;

    /**
     * Crea una nueva persona con nombre e identificación.
     *
     * @param nombre el nombre de la persona
     * @param ident la identificación de la persona
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }

    /**
     * Crea una nueva persona con solo el nombre.
     *
     * @param nombre el nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la identificación de la persona.
     *
     * @param pIdentificacion la nueva identificación
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }

    /**
     * Asigna un boleto de museo a la persona.
     *
     * @param pMiBoleto el boleto a asignar
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }

    /**
     * Consulta el número del boleto asignado a la persona.
     *
     * @return el número del boleto asignado
     */
    public int consultarMiNumeroDeBoleto() {
        return miBoleto.getNumeroBoleto();
    }

    /**
     * Devuelve una representación en texto de la persona, incluyendo su nombre,
     * identificación y el número de boleto si está asignado.
     *
     * @return una cadena con los detalles de la persona
     */
    @Override
    public String toString() {
        String msg = "Persona\n";
        msg += " Nombre: " + nombre + "\n";
        msg += " Identificacion: " + identificacion + "\n";
        if (miBoleto != null) {
            msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        } else {
            msg += " Boleto asignado: (ninguno)\n";
        }
        return msg;
    }
}