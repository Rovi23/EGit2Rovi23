package spai.egit2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.Persona;

public class PersonaTest {
    private Persona persona;

    @Before
    public void initObjects() {
        this.persona = new Persona("Ana ", "Vega", "Lopez");
    }

    @Test
    public void testGetNombre() {
        assertEquals("Ana", this.persona.getNombre());
    }

    @Test
    public void testSetNombre() {
        this.persona.setNombre(" ana ");
        assertEquals("Ana", this.persona.getNombre());
    }

    @Test
    public void testGetApellido() {
        assertEquals("Vega", this.persona.getApellido());
    }

    @Test
    public void testSetApellido() {
        this.persona.setApellido("  vega  ");
        assertEquals("Vega", this.persona.getApellido());
    }

    @Test
    public void testInicial() {
        assertEquals("A.", this.persona.inicial());
    }

    @Test
    public void testNombreCompleto() {
        assertEquals("Ana Vega Lopez", this.persona.nombreCompleto());
    }
    
    @Test
    public void testGetApellido2(){
    	assertEquals("Lopez", this.persona.getApellido2());
    }
    
    @Test
    public void testSetApellido2() {
        this.persona.setApellido2("  lopez  ");
        assertEquals("Lopez", this.persona.getApellido2());
    }
    

    

}
