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

/*
 * Comprobar que la fórmula para el área de un cuadrado sea correcta.
 */
@Test
public void testFormulaSquare() {
	assertEquals(App.areaSquare(2.00), 4.00, 0.0001);
}

/*
 *  Comprobar que al introducir cero como lado de un cuadrado mande null.
 *  Se envía mensaje de error al usuario.
 */
@Test
public void testNullSquare() {
	assertNull(App.areaSquare(0));
}

/*
 * Comprobar que no se introduzcan números negativos.
 * Se envia mensaje de error al usuario.
 */
@Test
public void testNegativeSquare() {
	assertNull(App.areaSquare(-1));
}

/*
 * Comprobar que la fórmula para el área de un rectángulo sea correcta.
 */
@Test
public void testFormulaRectangle() {
	assertEquals(App.areaRectangle(4.00, 2.00), 8.00, 0.0001);
}

/*
 * Comprobar que el manejo de decimales para la formula del rectángulo sea correcta.
 */
@Test
public void testFormulaRectangleDoubles() {
	assertEquals(App.areaRectangle(4.35, 2.74), 11.919, 0.0001);
}

/*
 *  Comprobar que al introducir cero en la base de un rectángulo mande null.
 *  Se envía mensaje de error al usuario.
 */
@Test
public void testNullRectangleWidth() {
	assertNull(App.areaRectangle(0, 2));
}

/*
 *  Comprobar que al introducir cero en la altura de un rectángulo mande null.
 *  Se envía mensaje de error al usuario.
 */
@Test
public void testNullRectangleHeight() {
	assertNull(App.areaRectangle(2, 0));
}

}