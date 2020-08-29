package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    // TODO Complete with more test cases
	
	@Test
	public void estaMuerto() {

        Person person = new Person("Pepito", 100, 46, Gender.MALE, false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
	
	@Test
	public void esMenorDeEdad() {

        Person person = new Person("Juanito", 101, 16, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
	
	@Test
	public void laEdadNoEsValida() {

        Person person = new Person("Dracula", 102, 250, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
	
	public void validateRegistryResult() {

        Person person1 = new Person("David", 103, 21, Gender.MALE, true);
		Person person1 = new Person("Stiven", 103, 20, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
	
}