/**
 * Clase para instrumentos de viento que hereda atributos de la clase Instrumento
 */
public final class Viento extends Instrumento {

    /**
     * @param codigo   del instrumento
     * @param precio   del instrumento
     * @param stock    del instrumento
     * @param material del instrumento
     * @param tipoInst tipo del instrumento
     * Constructor de la clase
     */
    public Viento(String codigo, int precio, int stock, String material, String tipoInst) {
        //atributos heredados de la clase padre
        super(codigo, precio, stock, material, tipoInst);
    }
}
