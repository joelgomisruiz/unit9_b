package unit9_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlumnoTest {

	@Test
	public void testcalculaTasaMatriculaA() {
		int edad = 24;
		boolean numerosa = false;
		boolean repetidor = true;
		
		assertEquals(2000.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}

}
