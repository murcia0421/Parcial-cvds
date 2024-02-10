package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
 
    @Test
    public void deadRegistryResult() {
        Person person = new Person("Murcia Sanchez", 1, 20 , Gender.FEMALE,false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
        Person person1 = new Person("Murcia Sanchez", 4, 20 , Gender.FEMALE,true);
        RegisterResult result1 = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.VALID, result1);
    }
    @Test
    public void underageRegistryResult() {
        Person person = new Person("Murcia Sanchez", 2, 0 , Gender.FEMALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
        Person person1 = new Person("Murcia Sanchez", 2, 17 , Gender.FEMALE,true);
        RegisterResult result1 = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.UNDERAGE, result1);
    }
    @Test
    public void invalid_AgeRegistryResult() {
        Person person = new Person("Murcia Sanchez", 3, -1 , Gender.FEMALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
        Person person1 = new Person("Murcia Sanchez", 3, -1000000 , Gender.FEMALE,true);
        RegisterResult result1 = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result1);
        Person person2 = new Person("Murcia Sanchez", 3, 136 , Gender.FEMALE,true);
        RegisterResult result2 = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result2);
        Person person3 = new Person("Murcia Sanchez", 3, 13500 , Gender.FEMALE,true);
        RegisterResult result3 = registry.registerVoter(person3);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result3);
    }
    
    @Test
    public void validateRegistryResult() {
        Person person = new Person("Murcia Sanchez", 4, 20 , Gender.FEMALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void duplicatedRegistryResult() {
        Person person = new Person("Murcia Sanchez", 5, 20 , Gender.FEMALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
        RegisterResult result1 = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result1);
    }
}