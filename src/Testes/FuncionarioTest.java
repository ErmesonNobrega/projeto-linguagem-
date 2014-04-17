package Testes;


import static org.junit.Assert.*;
import logico.Funcionario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FuncionarioTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FuncionarioTest
{
    private static String CPF = null;
	private int Salario;
	private String Ferias;

	/**
     * Default constructor for test class FuncionarioTest
     */
    public FuncionarioTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestFuncionario() throws Exception
    {
        FuncionarioTest funcionario1 = new FuncionarioTest();
        Funcionario funciona1 = new Funcionario("Ricardo", "01/08/94", "M", "Ana Emilia de medeiros", "dmriick@live.com");
        Funcionario funciona3 = new Funcionario("Lucas", "09/09/90", "M", "Av. Santa Elisabet", "luquinhas@live.com");
        Funcionario funciona2 = new Funcionario("Ana", "29/10/90", "F", "Vila", "aninha@live.com");
        Funcionario funciona4 = new Funcionario("Carla", "09/08/89", "F", "Vila", "carlinha@live.com");
        funcionario1.setCPF("123 123 123");
        funcionario1.setFerias("24/12");
        funcionario1.setSalario(400);
        assertEquals("24/12", funcionario1.getFerias());
        assertEquals(400, funcionario1.getSalario());
        funciona1.setCPF("321 312 312");
        funciona1.setFerias("24/12");
        funciona1.setSalario(600);
        assertEquals("321 312 312", funciona1.getCPF());
        assertEquals("24/12", funciona1.getFerias());
        assertEquals(600, funciona1.getSalario());
        funciona3.setCPF("121212");
        assertEquals("24/12", funciona1.getFerias());
        funciona3.setFerias("24/12");
        funciona3.setSalario(800);
        assertEquals("121212", funciona3.getCPF());
        assertEquals("24/12", funciona3.getFerias());
        assertEquals(800, funciona3.getSalario());
        funciona2.setCPF("918 918 918");
        funciona2.setFerias("24/12");
        funciona2.setSalario(899);
        assertEquals("918 918 918", funciona2.getCPF());
        assertEquals("24/12", funciona2.getFerias());
        assertEquals(899, funciona2.getSalario());
        funciona4.setCPF("333 333 333");
        assertEquals("24/12", funciona1.getFerias());
        funciona4.setFerias("24/12");
        funciona4.setSalario(544);
        assertEquals("333 333 333", funciona4.getCPF());
        assertEquals("24/12", funciona4.getFerias());
        assertEquals(544, funciona4.getSalario());
    }

    public String getCPF() {
        return CPF;
   }
    
   public void setCPF(String CPF) {
        this.CPF = CPF;
   }
   
   public String getFerias() {
  		return Ferias;
   }
  	
   public void setFerias(String Ferias) {
  		this.Ferias = Ferias;
   }
   
   public int getSalario() {
  		return Salario;
   }
  	
   public void setSalario (int Salario) {
  		this.Salario = Salario;
  	}
}

