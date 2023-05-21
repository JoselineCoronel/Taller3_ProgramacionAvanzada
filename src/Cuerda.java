/**
 * Clase para instrumentos de cuerda que hereda atributos de la clase Instrumento
 */
public final class Cuerda extends Instrumento {

    /**
     * Variable tipo String para el tipo de cuerda
     */
    private String tipoCuerda;
    /**
     * Variable tipo int para el numero de cuerdas
     */
    private int numeroDeCuerdas;
    /**
     * Variable tipo String para el tipo (acustico, electrico)
     */
    private String tipo;

    /**
     * @param codigo   del instrumento
     * @param precio   del instrumento
     * @param stock    del instrumento
     * @param material del instrumento
     * @param tipoInst tipo del instrumento
     * @param tipoCuerda del instrumento
     * @param numeroDeCuerdas del instrumento
     * @param tipo de instrumento (acustico o electrico)
     * Constructor de la clase
     *
     */
    public Cuerda(String codigo, int precio, int stock, String material, String tipoInst, String tipoCuerda, int numeroDeCuerdas, String tipo) {
        // atributos heredados de la clase padre
        super(codigo, precio, stock, material, tipoInst);
        // tipo de cuerda del instrumento
        this.tipoCuerda = tipoCuerda;
        // numero de cuerdas del instrumento
        this.numeroDeCuerdas = numeroDeCuerdas;
        // tipo de instrumento (acustico o electrico)
        this.tipo = tipo;
    }

    /**
     *
     * @return tipo de cuerda
     */
    public String getTipoCuerda() {
        return tipoCuerda;
    }

    /**
     *
     * @param tipoCuerda del instrumento
     */
    public void setTipoCuerda(String tipoCuerda) {
        this.tipoCuerda = tipoCuerda;
    }

    /**
     *
     * @return numero de cuerdas
     */
    public int getNumeroDeCuerdas() {
        return numeroDeCuerdas;
    }

    /**
     *
     * @param numeroDeCuerdas del instrumento
     */
    public void setNumeroDeCuerdas(int numeroDeCuerdas) {
        this.numeroDeCuerdas = numeroDeCuerdas;
    }

    /**
     *
     * @return tipo acustico o electrico
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo acustico o electrico
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public String toString(){

        return tipo + tipoCuerda + numeroDeCuerdas;
    }
}
