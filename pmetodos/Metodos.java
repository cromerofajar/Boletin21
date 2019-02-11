package pmetodos;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import utilidades.PedirDatos;
/**
 *
 * @author cromerofajar
 */
public class Metodos {
    public void añadirLibro(ArrayList<Libros>libro){
        String titulo,autor,ISBN;
        int precio,nlibros;
        titulo=PedirDatos.texto("Introduzca el Titulo:");
        autor=PedirDatos.texto("Introduzca el Autor");
        ISBN=PedirDatos.texto("Introduzca el ISBN");
        precio=PedirDatos.entero("Introduzca el precio");
        nlibros=PedirDatos.entero("Introduzca el numero de libros");
        Libros tomo=new Libros(titulo,autor,ISBN,precio,nlibros);
        if(libro.isEmpty()==true){
            libro.add(tomo);
        }
        else{
            for(Libros ele:libro){
                    if(ele.getISBN().equals(ISBN)){
                        if(ele.autor.equals(autor)){
                            if(ele.titulo.equals(titulo)){
                                ele.setNunidades(ele.getNunidades()+nlibros);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"El ISBN del libro no corresponde con el titulo");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"El ISBN del libro no se corresponde con el autor");
                        }
                    }
                    else{
                        libro.add(tomo);
                        break;
                    }
            }
        }
    }
    public void verFor(ArrayList<Libros>libro){
        if(libro.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "No contiene libros");
        }
        else{
            for(int i=0;i<libro.size();i++){
            System.out.println(libro.get(i));
        }
        }
    }
    public void verForEach(ArrayList<Libros>libro){
        if(libro.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "No contiene libros");
        }
        else{
        for(Libros ele:libro){
            System.out.println(ele);
        }
        }
    }
    public void verIterator(ArrayList<Libros>libro){
        if(libro.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "No contiene libros");
        }
        else{
        Iterator it=libro.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        }
    }
    public void vender(ArrayList<Libros>libro){
        String ISBN;
        int vender;
        if(libro.isEmpty()==true){
        JOptionPane.showMessageDialog(null, "No contiene libros");
        }
        else{
            ISBN=PedirDatos.texto("Introduzca el ISBN del libro a vender");
        for(Libros ele:libro){
            if(ele.getISBN().equalsIgnoreCase(ISBN)){
                if(ele.getNunidades()>0){
                    vender=PedirDatos.entero("Introduzca las unidades a vender");
                    if(vender>ele.getNunidades()){
                        JOptionPane.showMessageDialog(null,"No dispone de tal cantidad de unidades de libros");
                    }
                    else{
                        ele.setNunidades(ele.getNunidades()-vender);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"No dispone de unidades de ese libro");
                }
            }
        }
        }
    }
    public void darDeBaja(ArrayList<Libros>lista){
        Libros libro=new Libros();
        Iterator it=lista.iterator();
        if(lista.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "No contiene libros");
        }
        else{
            while(it.hasNext()){
            libro=(Libros)it.next();
            if(libro.getNunidades()==0){
                lista.remove(libro);
                break;
            }
            }
        }
    }
    public void buscarUno(ArrayList<Libros>libro){
    Iterator it=libro.iterator();
    Libros lib=new Libros();
    String ISBN;
    if(libro.isEmpty()==true){
        JOptionPane.showMessageDialog(null, "No contiene libros");
    }
    else{
        ISBN=PedirDatos.texto("Introduzca el ISBN del libro a vender");
        while(it.hasNext()){
            lib=(Libros)it.next();
            if(ISBN.equals(lib.ISBN))
                System.out.println(lib);
        }
    }
    }
}

