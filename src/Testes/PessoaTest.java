package Testes;


import static org.junit.Assert.*;
import logico.Pessoa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import execoes.EmailInvalidoException;

/**
 * The test class PessoaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PessoaTest
{
    /**
     * Default constructor for test class PessoaTest
     */
    public PessoaTest()
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
    public void TestPessoa() throws Exception
    {
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();
        Pessoa pessoa5 = new Pessoa();
        pessoa1.setDataCadastro("01/03/14");
        pessoa1.setDataNascimento("12/12/92");
        pessoa1.setEmail("daniel@live.com");
        pessoa1.setEndereco("Av Santa Elizabeth");
        pessoa1.setNome("Daniel");
        pessoa1.setSexo("M");
        pessoa1.setTelefone(91949905);
        assertEquals(91949905, pessoa1.getTelefone());
        assertEquals("M", pessoa1.getSexo());
        assertEquals("Daniel", pessoa1.getNome());
        assertEquals("Av Santa Elizabeth", pessoa1.getEndereco());
        assertEquals("daniel@live.com", pessoa1.getEmail());
        assertEquals("daniel@live.com", pessoa1.getEmail());
        assertEquals("12/12/92", pessoa1.getDataNascimento());
        assertEquals("01/03/14", pessoa1.getDataCadastro());
        pessoa2.setTelefone(91919191);
        pessoa2.setSexo("M");
        pessoa2.setNome("Antonio");
        pessoa2.setEndereco("Av Santa Elizabeth");
        pessoa2.setEmail("antonio@live.com");
        pessoa2.setDataNascimento("12/02/92");
        pessoa2.setDataCadastro("01/03/14");
        assertEquals(91919191, pessoa2.getTelefone());
        assertEquals("M", pessoa2.getSexo());
        assertEquals("Antonio", pessoa2.getNome());
        assertEquals("Av Santa Elizabeth", pessoa2.getEndereco());
        assertEquals("antonio@live.com", pessoa2.getEmail());
        assertEquals("12/02/92" , pessoa2.getDataNascimento());
        assertEquals("01/03/14" , pessoa2.getDataCadastro());
        pessoa3.setTelefone(91001090);
        pessoa4.setTelefone(91020304);
        pessoa5.setTelefone(91911213);
        pessoa3.setSexo("M");
        pessoa4.setSexo("M");
        pessoa5.setSexo("M");
        pessoa3.setNome("João");
        pessoa4.setNome("Carlos");
        pessoa3.setEmail("joao@live.com");
        pessoa4.setEmail("carlos@live.com");
        pessoa3.setEndereco("Av Santa Elizabeth");
        pessoa4.setEndereco("Av Santa Elizabeth");
        pessoa5.setEndereco("Av Santa Elizabeth");
        pessoa5.setNome("Edson");
        pessoa5.setEmail("edson@live.com");
        pessoa3.setDataNascimento("01/03/84");
        pessoa3.setDataCadastro("01/03/14");
        pessoa4.setDataCadastro("01/03/14");
        pessoa5.setDataCadastro("01/03/14");
        pessoa4.setDataNascimento("04/04/95");
        pessoa5.setDataNascimento("12/08/97");
        assertEquals(91001090, pessoa3.getTelefone());
        assertEquals("M", pessoa3.getSexo());
        assertEquals("João", pessoa3.getNome());
        assertEquals("Av Santa Elizabeth", pessoa3.getEndereco());
        assertEquals("joao@live.com", pessoa3.getEmail());
        assertEquals("01/03/84", pessoa3.getDataNascimento());
        assertEquals("01/03/14", pessoa3.getDataCadastro());
        assertEquals(91020304, pessoa4.getTelefone());
        assertEquals("M", pessoa3.getSexo());
        assertEquals("João", pessoa3.getNome());
        assertEquals("Av Santa Elizabeth", pessoa3.getEndereco());
        assertEquals("joao@live.com", pessoa3.getEmail());
        assertEquals("01/03/84", pessoa3.getDataNascimento());
        assertEquals("01/03/14", pessoa3.getDataCadastro());
        assertEquals(91911213, pessoa5.getTelefone());
        assertEquals("M", pessoa5.getSexo());
        assertEquals("Edson", pessoa5.getNome());
        assertEquals("Av Santa Elizabeth", pessoa5.getEndereco());
        assertEquals("edson@live.com", pessoa5.getEmail());
        assertEquals("12/08/97", pessoa5.getDataNascimento());
        assertEquals("01/03/14", pessoa5.getDataCadastro());
        assertEquals("01/03/14", pessoa4.getDataCadastro());
        assertEquals("04/04/95", pessoa4.getDataNascimento());
        assertEquals("carlos@live.com", pessoa4.getEmail());
        assertEquals("Av Santa Elizabeth", pessoa4.getEndereco());
        assertEquals("Carlos", pessoa4.getNome());
        assertEquals("M", pessoa4.getSexo());
        assertEquals(91020304, pessoa4.getTelefone());
        assertEquals(91020304, pessoa4.getTelefone());
    }
}

