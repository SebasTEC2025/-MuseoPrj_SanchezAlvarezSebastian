import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code VentaDelDia} representa el registro de boletos vendidos en un día específico.
 * Permite registrar boletos, calcular el total de ventas y mostrar un resumen detallado.
 * 
 * @author Sebastián Sánchez Álvarez
 * @version 1.0
 */
public class VentaDelDia {

    /** Fecha en la que se realiza la venta, en formato yyyy-MM-dd. */
    private String fechaDeLaVenta;

    /** Lista de boletos vendidos durante el día. */
    private List<BoletoMuseo> boletosVendidos;

    /**
     * Constructor que inicializa la venta del día con la fecha actual
     * y una lista vacía de boletos vendidos.
     */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }

    /**
     * Registra un boleto vendido agregándolo a la lista de ventas del día.
     *
     * @param boleto el boleto vendido que se desea registrar
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }

    /**
     * Calcula el total de dinero generado por la venta de boletos en el día.
     *
     * @return el monto total de la venta del día
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for (BoletoMuseo b : boletosVendidos) {
            total += b.getPrecio();
        }
        return total;
    }

    /**
     * Establece la fecha de la venta usando la fecha actual del sistema.
     *
     * @return una cadena con la fecha en formato yyyy-MM-dd
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }

    /**
     * Devuelve una representación en texto de la venta del día,
     * incluyendo fecha, cantidad de boletos, detalle por boleto y total.
     *
     * @return una cadena con el resumen de la venta del día
     */
    @Override
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += " Fecha: " + fechaDeLaVenta + "\n";
        msg += " Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg += " Detalle:\n";
        for (BoletoMuseo b : boletosVendidos) {
            msg += " - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
        }
        msg += " Total: " + calcularTotalVentaDelDia();
        return msg;
    }
}