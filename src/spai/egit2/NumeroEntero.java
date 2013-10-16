package spai.egit2;

public class NumeroEntero {
    private int valor;

    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    public NumeroEntero() {
        this(0);
    }

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar() {
        this.setValor(this.valor + 1);
    }
    
    //borrar que es una prueba para que funcionen los test
    public void incrementar(int paso) {
        this.setValor(this.valor + paso);
    }
    

    public void doblar() {
        this.setValor(this.valor * 2);
    }

    public void decrementar() {
        this.valor--;
    }
    //borrar que es una prueba para que funcionen los test
    public void decrementar(int paso) {
        this.setValor(this.valor - paso);
    }
 
    //borrar que es una prueba para que funcionen los test
    public int sumar(int sumando) {
        return -1;
    }
 
    //borrar que es una prueba para que funcionen los test
    public int restar(int restando) {
        return -1;
    }
}
