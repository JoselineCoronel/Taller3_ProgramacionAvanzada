/**
 * Clase para instrumentos de percusion que hereda atributos de la clase Instrumento
 */
public final class Percusion extends Instrumento {

    /**
     * Variable tipo String para el tipo de percusion
     */
    private String tipoPercusion;
    /**
     * Variable tipo boolean para la altura del instrumento
     */
    private boolean altura;

    /**
     * @param codigo   del instrumento
     * @param precio   del instrumento
     * @param stock    del instrumento
     * @param material del instrumento
     * @param tipoInst tipo del instrumento
     * @param tipoPercusion del instrumento
     * @param altura del instrumento
     *Constructor de la clase
     *
     */
    public Percusion(String codigo, int precio, int stock, String material, String tipoInst, String tipoPercusion, boolean altura) {
        // atributos heredados de la clase padre
        super(codigo, precio, stock, material, tipoInst);
        // tipo de percusion
        this.tipoPercusion = tipoPercusion;
        // altura del instrumento
        this.altura = altura;
    }

    /**
     *
     * @return tipo de percusion
     */
    public String getTipoPercusion() {
        return tipoPercusion;
    }

    /**
     *
     * @param tipoPercusion del instrumento
     */
    public void setTipoPercusion(String tipoPercusion) {
        this.tipoPercusion = tipoPercusion;
    }

    /**
     *
     * @return si la altura esta definida o indefinida
     */
    public boolean isAltura() {
        return altura;
    }

    /**
     *
     * @param altura del instrumento
     */
    public void setAltura(boolean altura) {
        this.altura = altura;
    }
}
