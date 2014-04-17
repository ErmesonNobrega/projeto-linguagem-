package Testes;


import static org.junit.Assert.*;
import logico.Academia;
import logico.Aluno;
import logico.Funcionario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import execoes.EmailInvalidoException;
import execoes.NomeInvalidoException;

/**
 * The test class AcademiaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AcademiaTest
{
    /**
     * Default constructor for test class AcademiaTest
     */
    public AcademiaTest()
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
    public void TestAcademia() throws Exception
    {
        Academia academia1 = new Academia("VIDA ATIVA");
        Aluno aluno1 = new Aluno("Bebezao", 12, "24/12/90", "M", "Av Santa Elizabeth", "bebezao@live.com");
        Aluno aluno2 = new Aluno("Ze", 1234, "24/12/97", "M", "Av Santa Elizabeth", "ze@live.com");
        Aluno aluno3 = new Aluno("Fabricio", 123456, "24/08/97", "M", "Av Santa Elizabeth", "fabricio@live.com");
        Funcionario funciona1 = new Funcionario("leo", "24/08/92", "M", "Av Santa Elizabeth", "leo@live.com");
        Funcionario funciona2 = new Funcionario("Josefa", "02/02/90", "F", "Av Santa Elizabeth", "josefa@live.com");
        Funcionario funciona3 = new Funcionario("Pitel", "12/12/80", "M", "Av Santa Elizabeth", "pitel@live.com");
        academia1.cadastrarAluno(aluno1);
        academia1.cadastrarAluno(aluno2);
        academia1.cadastrarAluno(aluno3);
        academia1.cadastrarFuncionario(funciona1);
        academia1.cadastrarFuncionario(funciona2);
        academia1.cadastrarFuncionario(funciona3);
        funciona1.setCPF("091.246.124-13");
        funciona1.setFerias("24/12");
        funciona1.setSalario(800);
        funciona2.setCPF("123.312.124-13");
        funciona2.setFerias("31/12");
        funciona2.setSalario(800);
        funciona3.setCPF("123.456.789.00");
        funciona3.setFerias("31/12");
        funciona3.setSalario(800);
        academia1.removerAluno("Bebezao");
        academia1.removerFuncionario("leo");
    }
}

