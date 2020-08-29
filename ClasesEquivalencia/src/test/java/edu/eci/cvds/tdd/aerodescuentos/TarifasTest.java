package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;
public class TarifasTest{
    @Test
    public void prueba1() {
		int tarifaBase = -100;
		int diasAntelacion = 10;
		int edad = 50;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(-100, result, 0);
    }
    @Test
    public void prueba2() {
		int tarifaBase = 100;
		int diasAntelacion = -15;
		int edad = 45;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(100, result, 0);
    }
    @Test
	public void prueba3() {
		int tarifaBase = 100;
		int diasAntelacion = 10;
		int edad = 5;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(95, result, 0);
    }
	@Test
    public void prueba4() {
		int tarifaBase = 100;
		int diasAntelacion = 10;
		int edad = -5;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(95, result, 0);
    }
    @Test
    public void prueba5() {
		int tarifaBase = 100;
		int diasAntelacion = 9;
		int edad = 60;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(100, result, 0);
    }
	@Test
    public void prueba6() {
		int tarifaBase = 100;
		int diasAntelacion = 25;
		int edad = 5;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(80, result, 0);
    }
    @Test
    public void prueba7() {
		int tarifaBase = 100;
		int diasAntelacion = 9;
		int edad = 100;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(92, result, 0);
    }
	@Test
    public void prueba8() {
		int tarifaBase = 100;
		int diasAntelacion = 28;
		int edad = 100;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(77, result, 0);
    }
    @Test
    public void prueba9() {
		int tarifaBase = 100;
		int diasAntelacion = 28;
		int edad = 35;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(85, result, 0);
    }
    @Test
    public void prueba11() {
		int tarifaBase = 100;
		int diasAntelacion = -6;
		int edad = 18;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(100, result, 0);
    }
	@Test
    public void prueba12() {
		int tarifaBase = 100;
		int diasAntelacion = 22;
		int edad = 65;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(85, result, 0);
    }

    @Test
    public void prueba13() {
		int tarifaBase = 0;
		int diasAntelacion = 20;
		int edad = 19;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion,edad);
        Assert.assertEquals(0, result, 0);
    }
}