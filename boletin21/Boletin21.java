package boletin21;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;

/**
 *
 * @author cromerofajar
 */
public class Boletin21 {

    public static void main(String[] args) {
        pmetodos.Metodos obx=new pmetodos.Metodos();
        ArrayList<pmetodos.Libros>libro=new ArrayList<>();
        String opcion,opcion2;
        do{
        opcion=PedirDatos.texto("****MENU****\n 1->Añadir\n 2->Visualizar\n 3->Venta\n 4->Dar de baja\n 5->Buscar uno\n 6->Salir\n\nIntroduzca la funcion que desea realizar:");
        switch(opcion.toLowerCase()){
            case "añadir": obx.añadirLibro(libro);
                           break;
            case "visualizar": Collections.sort(libro);
                               opcion2=JOptionPane.showInputDialog(null,"Seleccione modo\n 1->For\n 2->For each\n 3->Iterator\nIntroduzca su opcion:");
                               switch(opcion2.toLowerCase()){
                                    case "for": obx.verFor(libro);
                                                break;
                                    case "for each": obx.verForEach(libro);
                                                break;
                                    case "iterator": obx.verIterator(libro);
                                                break;
                                    default: JOptionPane.showMessageDialog(null,"Opcion no valida.");
                                }
                               break;
            case "venta": obx.vender( libro);
                          break;
            case "dar de baja": obx.darDeBaja(libro);
                                break;
            case "buscar uno": obx.buscarUno(libro);
                               break;
            case "salir":System.exit(0);
            default: opcion=JOptionPane.showInputDialog(null, "Opcion no valida\nDesea volver al menu?");
        
        }
        }while(!"No".equalsIgnoreCase(opcion));
        
    }
    
}
