/**
 * Clase para atributos generales del instrumento
 */
public abstract class Instrumento {

    /**
     * Variable tipo String para el codigo del instrumento
     */
    private String codigo;
    /**
     * Variable tipo int para el precio del instrumento
     */
    private int precio;
    /**
     * Variable tipo int para el stock del instrumento
     */
    private int stock;
    /**
     * Variable tipo String para el material del instrumento
     */
    private String material;
    /**
     * Variable tipo String para el tipo de instrumento
     */
    private String tipoInst;

    /**
     *
     * @param codigo del instrumento
     * @param precio del instrumento
     * @param stock del instrumento
     * @param material del instrumento
     * @param tipoInst tipo del instrumento
     * Constructor de la clase
     */
    public Instrumento(String codigo, int precio, int stock, String material, String tipoInst) {
        // codigo del instrumento
        this.codigo = codigo;
        // precio del instrumento
        this.precio = precio;
        // stock del instrumento
        this.stock = stock;
        // material del instrumento
        this.material = material;
        // tipo de instrumento
        this.tipoInst = tipoInst;
    }

    /**
     *
     * @return codigo del instrumento
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo del instrumento
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return precio del instrumento
     */
    public int getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio del instrumento
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     *
     * @return stock del instrumento
     */
    public int getStock() {
        return stock;
    }

    /**
     *
     * @param stock del instrumento
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     *
     * @return material del instrumento
     */
    public String getMaterial() {
        return material;
    }

    /**
     *
     * @param material del instrumento
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     *
     * @return tipo del instrumento
     */
    public String getTipoInst() {
        return tipoInst;
    }

    /**
     *
     * @param tipoInst tipo del instrumento
     */
    public void setTipoInst(String tipoInst) {
        this.tipoInst = tipoInst;
    }

}
