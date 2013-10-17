package spai.egit2;

public class NumeroEntero {
    private int valor;

    public NumeroEntero(int valor) {
    	if(valor>1000)
    		this.valor=1000;
    	else
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
    	if(this.valor<1000)
    		this.setValor(this.valor + 1);
    }
    
    //borrar que es una prueba para que funcionen los test
    public void incrementar(int paso) {
    	if((this.valor+paso)<1000)
    		this.setValor(this.valor + paso);
    }
    

    public void doblar() {
        this.setValor(this.valor * 2);
    }

    public void decrementar() {
        this.valor--;
    }

    public void decrementar(int paso) {
        this.setValor(this.valor - paso);
    }
 
    public int sumar(int sumando) {
        return this.valor+sumando;
    }

    public int restar(int restando) {
        return this.valor-restando;
    }
}

