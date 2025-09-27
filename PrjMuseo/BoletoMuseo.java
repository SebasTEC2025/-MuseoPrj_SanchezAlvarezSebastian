import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * La clase {@code BoletoMuseo} representa un boleto emitido para ingresar a un museo.
 * Cada boleto tiene un precio, un número único asignado automáticamente y una fecha de emisión.
 * 
 * @author Sebastian Sanchez Alvarez
 * @version 1.0
 */
public class BoletoMuseo {

    /** Precio del boleto. */
    private double precio;

    /** Número único del boleto, asignado automáticamente. */
    private int numeroBoleto;

    /** Fecha de emisión del boleto en formato yyyy-MM-dd. */
    private String fechaEmision;

    /** Contador estático que lleva el total de boletos emitidos. */
    private static int contador = 0;

    /**
     * Crea un nuevo boleto con el precio especificado.
     * Asigna automáticamente el número de boleto y establece la fecha de emisión.
     *
     * @param precio el precio del boleto
     */
    public BoletoMuseo(double precio) {
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }

    /**
     * Establece la fecha de emisión del boleto usando la fecha actual del sistema.
     *
     * @return una cadena con la fecha de emisión en formato yyyy-MM-dd
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }

    /**
     * Devuelve el número total de boletos emitidos hasta el momento.
     *
     * @return el contador de boletos emitidos
     */
    public static int getContador() {
        return contador;
    }

    /**
     * Devuelve el número único asignado a este boleto.
     *
     * @return el número del boleto
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * Devuelve el precio de este boleto.
     *
     * @return el precio del boleto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve una representación en texto del boleto, incluyendo número, precio y fecha de emisión.
     *
     * @return una cadena con los detalles del boleto
     */
    @Override
    public String toString() {
        String msg = "BoletoMuseo\n";
        msg += " Numero: " + numeroBoleto + "\n";
        msg += " Precio: " + precio + "\n";
        msg += " Fecha Emision: " + fechaEmision;
        return msg;
    }
}