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
	
	@Test
	public void testcalculaTasaMatriculaB() {
		int edad = 24;
		boolean numerosa = false;
		boolean repetidor = false;
		
		assertEquals(500.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}
	
	@Test
	public void testcalculaTasaMatriculaC() {
		int edad = 24;
		boolean numerosa = true;
		boolean repetidor = false;
		
		assertEquals(250.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}
	@Test
	public void testcalculaTasaMatriculaD() {
		int edad = 24;
		boolean numerosa = true;
		boolean repetidor = true;
		
		assertEquals(250.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}
	
	@Test
	public void testcalculaTasaMatriculaE() {
		int edad = 26;
		boolean numerosa = true;
		boolean repetidor = true;
		
		assertEquals(250.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}
	@Test
	public void testcalculaTasaMatriculaF() {
		int edad = 26;
		boolean numerosa = false;
		boolean repetidor = true;
		
		assertEquals(500.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}
	@Test
	public void testcalculaTasaMatriculaG() {
		int edad = 26;
		boolean numerosa = false;
		boolean repetidor = false;
		
		assertEquals(500.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}
	@Test
	public void testcalculaTasaMatriculaH() {
		int edad = 26;
		boolean numerosa = true;
		boolean repetidor = false;
		
		assertEquals(250.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}
	@Test
	public void testcalculaTasaMatriculaI() {
		int edad = 65;
		boolean numerosa = false;
		boolean repetidor = false;
		
		assertEquals(250.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}
	@Test
	public void testcalculaTasaMatriculaJ() {
		int edad = 55;
		boolean numerosa = false;
		boolean repetidor = false;
		
		assertEquals(400.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}
	@Test
	public void testcalculaTasaMatriculaK() {
		int edad = 55;
		boolean numerosa = true;
		boolean repetidor = false;
		
		assertEquals(150.00f, new Alumno().calculaTasaMatricula(edad, numerosa, repetidor), 1e-8);
	}


}
