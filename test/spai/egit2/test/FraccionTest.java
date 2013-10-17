package spai.egit2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.Fraccion;

public class FraccionTest {
    private Fraccion fraccion;

    @Before
    public void initObjects() {
        this.fraccion = new Fraccion(2, 3);
    }

    @Test
    public void testcontructorIntInt() {
        assertEquals(2, this.fraccion.getNumerador());
        assertEquals(3, this.fraccion.getDenominador());
    }

    @Test
    public void testConstructorSinParametros() {
        Fraccion fraccion = new Fraccion();
        assertEquals(1, fraccion.getNumerador());
        assertEquals(1, fraccion.getDenominador());
    }

    @Test
    public void testSetNumerador() {
        this.fraccion.setNumerador(4);
        assertEquals(4, fraccion.getNumerador());
    }

    @Test
    public void testSetDenominador() {
        this.fraccion.setDenominador(4);
        assertEquals(4, fraccion.getDenominador());
    }

    @Test
    public void testDecimal() {
        assertEquals(2.0/3.0, fraccion.decimal(), 1e-10);
    }
    
    @Test
    public void testEsPropia() {
    	assertTrue(fraccion.esPropia());
    }
    
    @Test
    public void testEsImpropia() {
    	assertFalse(fraccion.esImpropia());
    }
    
    @Test
    public void testEsEquivalente(){
    	Fraccion fraccion1 = new Fraccion(3, 4);
    	Fraccion fraccion2 = new Fraccion(6, 8);
    	assertEquals(true, fraccion1.esEquivalente(fraccion2));
    	Fraccion fraccion4 = new Fraccion(7, 9);  	
    	assertEquals(false, fraccion1.esEquivalente(fraccion4));
    }
    
    @Test
    public void testMultiplicar(){
    	Fraccion fraccion2 = new Fraccion(3, 4);
    	Fraccion result = new Fraccion();
    	result = fraccion.multiplicar(fraccion2);
    	assertEquals(6, result.getNumerador());
    	assertEquals(12, result.getDenominador());
    }
    
    @Test
    public void testDividir(){
    	Fraccion fraccion2 = new Fraccion(3, 4);
    	Fraccion result = new Fraccion();
    	result = fraccion.dividir(fraccion2);
    	assertEquals(8, result.getNumerador());
    	assertEquals(9, result.getDenominador());
    }
    
    @Test
    public void testSumar(){
    	Fraccion fraccion2 = new Fraccion(1, 4);
    	Fraccion result = new Fraccion();
    	result = fraccion.sumar(fraccion2);
    	assertEquals(17, result.getNumerador());
    	assertEquals(12, result.getDenominador());
    }
    
    @Test
    public void testRestar(){
    	Fraccion fraccion2 = new Fraccion(1, 4);
    	Fraccion result = new Fraccion();
    	result = fraccion.restar(fraccion2);
    	assertEquals(5, result.getNumerador());
    	assertEquals(12, result.getDenominador());
    }
}
