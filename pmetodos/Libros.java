package pmetodos;

/**
 *
 * @author cromerofajar
 */
public class Libros implements Comparable{
    String titulo, autor, ISBN;
    int precio,nunidades;

    public Libros() {
    }

    public Libros(String titulo, String autor, String ISBN, int precio, int nunidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.nunidades = nunidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNunidades(int nunidades) {
        this.nunidades = nunidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNunidades() {
        return nunidades;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + "\nAutor=" + autor + "\nISBN=" + ISBN + "\nPrecio=" + precio + "\nNumero de unidades=" + nunidades+"\n";
    }
    
    @Override
    public int compareTo(Object o) {
        Libros a=(Libros)o;
        if(this.titulo.compareToIgnoreCase(a.titulo)>0){
            return 1;
        }
        else if(this.titulo.compareToIgnoreCase(a.titulo)<0){
            return -1;
        }
        else {
            return 0;
        }
    }
    
}
