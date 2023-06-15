package hn.uthestudiantetarea1.aplicacion_calculo_areas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	
/*
 * Comprobar que la fórmula para el área de un circulo sea correcta.
 */
 @Test
public void testFormulaCircle() {
	 assertEquals(App.areaCircle(2.0), 12.5664, 0.0001);
 }

/*
 *  Comprobar que al introducir cero como radio del un circulo mande null.
 *  Se envía mensaje de error al usuario.
 */
@Test
public void testNullCircle() {
	assertNull(App.areaCircle(0));
}

/*
 * Comprobar que no se introduzcan números negativos.
 * Se envia mensaje de error al usuario.
 */
@Test
public void testNegativeCircle() {
	assertNull(App.areaCircle(-1));
}

}