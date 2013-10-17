package spai.egit2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.NumeroEntero;

public class NumeroEnteroTest {
    private NumeroEntero numero;

    @Before
    public void initObjects() {
        this.numero = new NumeroEntero(100);
    }

    @Test
    public void testConstructorSinParametros() {
        NumeroEntero numero = new NumeroEntero();
        assertEquals(0, numero.getValor());
    }
    
    @Test
    public void testConstructorConParametros() {
        NumeroEntero numero = new NumeroEntero(-10);
        assertEquals(-10, numero.getValor());
    }

    @Test
    public void testIncrementar() {
        this.numero.incrementar();
        assertEquals(101, this.numero.getValor());
    }
    
    @Test
    public void testIncrementarConPaso() {
        this.numero.incrementar(15);
        assertEquals(115, this.numero.getValor());
        numero = new NumeroEntero(1000);
        this.numero.incrementar();
        assertEquals(1000, this.numero.getValor());
    }
    

    @Test
    public void testDoblar() {
        this.numero.doblar();
        assertEquals(200, this.numero.getValor());
    }

    @Test
    public void testDecrementar() {
        this.numero.decrementar();
        assertEquals(99, numero.getValor());
        numero = new NumeroEntero();
        this.numero.decrementar();
        assertEquals(-1, numero.getValor());
    }

    @Test
    public void testDecrementarConPaso() {
        this.numero.decrementar(15);
        assertEquals(85, this.numero.getValor());
        numero = new NumeroEntero(1000);
        this.numero.decrementar();
        assertEquals(999, this.numero.getValor());
    }
    
    @Test
    public void testRestar() {

        assertEquals(85, this.numero.restar(15));

        assertEquals(999, this.numero.restar(1));
    }
    
    @Test
    public void testSumar() {

        assertEquals(115, this.numero.sumar(15));

        assertEquals(1111, this.numero.sumar(111));
    }
    
 }

