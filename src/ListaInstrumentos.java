import ucn.StdOut;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Clase contenedora de instrumentos
 */
public class ListaInstrumentos {

    /**
     * variables necesarias para la lectura del archivo csv
     */
    private BufferedReader lector;
    private String linea;
    private String partes[];
    /**
     * cantidad maxima de la lista
     */
    private int cantMax;
    /**
     * cantidad actual de la lista
     */
    private int cantAct;
    /**
     * Lista de instrumentos
     */
    private Instrumento[] listaInstrumento;

    /**
     *
     * @param cantMax
     * Constructor de la clase
     */
    public ListaInstrumentos(int cantMax) {
        this.cantMax = cantMax;
        this.cantAct = 0;
        this.listaInstrumento = new Instrumento[cantMax];
    }

    /**
     *
     * @return cantidad maxima de la lista
     */
    public int getCantMax() {
        return cantMax;
    }

    /**
     *
     * @param cantMax de la lista
     */
    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    /**
     *
     * @return cantidad actual de la lista
     */
    public int getCantAct() {
        return cantAct;
    }

    /**
     *
     * @param cantAct de la lista
     */
    public void setCantAct(int cantAct) {
        this.cantAct = cantAct;
    }

    /**
     *
     * @param i
     * Metodo para agregar un instrumento
     */
    public void agregarIns(Instrumento i){

        if (this.cantAct >= cantMax){
            StdOut.println("No se pueden agregar mas instrumentos");
            return;
        }
        this.listaInstrumento[cantAct] = i;
        this.cantAct++;
    }

    /**
     * Metodo para consultar inventario
     */
    public void consultarInv(){

        //for que recorre la lista
        for (int d=0; d<this.partes.length; d++){

            StdOut.print(partes[d]+"  |  ");
        }

    }

    /**
     *
     * @param nombreArchivo
     * Metodo para leer el archivo
     */
    public void leerArchivo(String nombreArchivo){
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null){
                partes = linea.split(",");
                consultarInv();
                StdOut.println();

            }
            lector.close();
            linea = null;
            partes = null;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }



}
