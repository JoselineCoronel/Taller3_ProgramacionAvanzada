import ucn.StdIn;
import ucn.StdOut;

/**
 * Clase que implementa a la clase Menu
 */
public class MenuImpl implements Menu{

    private ListaInstrumentos listadoInstrumentos;

    /**
     * Metodo que imprime el menu por pantalla
     */
    public MenuImpl() {
        this.listadoInstrumentos = new ListaInstrumentos(100);

        //imprime en pantalla
        StdOut.println("**** Menu ****");
        StdOut.println("1-. Agregar instrumento");
        StdOut.println("2-. Vender instrumento");
        StdOut.println("3-. Consultar inventario");
        StdOut.println("4-. Cerrar aplicación");
        StdOut.println("Ingrese el número de opción: ");

        //variable tipo String "opcion" que guarda el valor ingresado por pantalla
        String opcion = StdIn.readString();

        //switch que ptskts
        switch (opcion){
            case "1" : agregarIns();
            break;
            case "2" : venderIns();
            break;
            case "3" : consultarInv();
            break;
            case "4" : cierre();
            break;
        }

    }

    /**
     * Metodo para agregar instrumento
     */
    @Override
    public void agregarIns() {

    }

    /**
     * Metodo para vender instrumento
     */
    @Override
    public void venderIns() {

        //imprime en pantalla
        StdOut.println("Ingrese el código del instrumento: ");
        //lee por pantalla el codigo del instrumento
        StdIn.readString();

    }

    /**
     * Metodo para consultar inventario
     */
    @Override
    public void consultarInv() {

        ListaInstrumentos x = new ListaInstrumentos(100);

        //lee el archivo a partir de la ruta de acceso
        x.leerArchivo("C:\\Users\\Joseline\\Downloads\\instumentos.csv");

    }

    /**
     * Metodo para cerrar el programa
     */
    @Override
    public void cierre() {

        //imprime en pantalla
        StdOut.println("**** Hasta pronto! ****");

    }
}
