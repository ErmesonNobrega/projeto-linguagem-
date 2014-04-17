package Testes;



import static org.junit.Assert.*;
import logico.Aluno;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import execoes.EmailInvalidoException;
import execoes.NomeInvalidoException;

/**
 * The test class AlunoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AlunoTest
{
    /**
     * Default constructor for test class AlunoTest
     */
    public AlunoTest()
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
    public void TestAluno(){
    	
		try {
			Aluno aluno1 = new Aluno("Daniel", 1, "20/04/92", "M", "Av. Santa Elizabeth", "daniel@live.com");
			Aluno aluno2 = new Aluno("Ricardo", 2, "01/01/94", "M", "Av. Santa Elizabeth", "ricardo@live.com");
		    Aluno aluno3 = new Aluno("Ruan", 3, "12/12/96", "M", "Av. Santa Elizabeth", "ruan@live.com");
		    Aluno aluno4 = new Aluno("Cleide", 4, "28/05/80", "F", "Av. Santa Elizabeth", "cleide@live.com");
		    Aluno aluno5 = new Aluno("Wollney", 5, "20/06/90", "M", "Av. Santa Elizabeth", "wollney@live.com");
		    //Aluno 1
		    
	        assertEquals(false, aluno1.getAtivo());
	        assertEquals(1, aluno1.getMatricula());
	        assertEquals("Daniel", aluno1.getNome());
	        aluno1.setAtivo(true);
	        try {
				aluno1.setMatricula(12);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        aluno1.setNome("Deyson");
	        assertEquals("Deyson", aluno1.getNome());
	        try {
				aluno1.setMatricula(0);
				fail("Não era pra passar");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				assertEquals("Matrícula inválida", e.getMessage());
			}
	        try {
				aluno1.setMatricula(-2);
				fail("Não era pra passar");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				assertEquals("Matrícula inválida", e.getMessage());
			}
	        
	        assertEquals(false, aluno2.getAtivo());
	        assertEquals(2, aluno2.getMatricula());
	        assertEquals("Ricardo", aluno2.getNome());
	        aluno2.setAtivo(true);
	        try {
				aluno2.setMatricula(123);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        aluno2.setNome("Montengro");
	        assertEquals(false, aluno3.getAtivo());
	        assertEquals(3, aluno3.getMatricula());
	        assertEquals("Ruan", aluno3.getNome());
	        aluno3.setAtivo(true);
	        try {
				aluno3.setMatricula(1234);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        aluno3.setNome("Rodrigues");
	        assertEquals(false, aluno4.getAtivo());
	        assertEquals(4, aluno4.getMatricula());
	        aluno4.setAtivo(true);
	        try {
				aluno4.setMatricula(12345);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        aluno4.setNome("Silva");
	        assertEquals(false, aluno5.getAtivo());
	        assertEquals(5, aluno5.getMatricula());
	        assertEquals("Wollney", aluno5.getNome());
	        aluno5.setAtivo(true);
	        try {
				aluno5.setMatricula(12345);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        aluno5.setNome("Avila");
	        
	        //Aluno 6
	        Aluno aluno6 = new Aluno("Wollney3333", 6, "20/06/90", "M", "Av. Santa Elizabeth", "wollney@live.com");
		    fail("Não é pra passar");
		} catch (NomeInvalidoException nome) {
			assertEquals("O nome possui números", nome.getMessage());
		}catch (EmailInvalidoException email) {
			assertEquals("Email inválido", email.getMessage());		
		}
       
		try {
			Aluno aluno7 = new Aluno("Wollney", 7, "20/06/90", "M", "Av. Santa Elizabeth", "wollney");
			fail("Não é pra passar o email está errado tem que entrar no catch");
		} catch (NomeInvalidoException nome) {
			// TODO Auto-generated catch block
			assertEquals("O nome possui números", nome.getMessage());
		} catch (EmailInvalidoException email) {
			// TODO Auto-generated catch block
			assertEquals("Email inválido", email.getMessage());	
		}   
		
    }  
    
}

