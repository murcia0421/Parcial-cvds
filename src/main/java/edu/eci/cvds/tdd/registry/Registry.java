package edu.eci.cvds.tdd.registry;

import java.util.*;

public class Registry {

    private HashSet<Integer> voters;

    public Registry(){
        voters = new HashSet<Integer>();
    }

    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;
        if (!p.isAlive())
            result =  RegisterResult.DEAD;
        else if (p.getAge() >= 0 && p.getAge() < 18)
            result = RegisterResult.UNDERAGE;
        else if (p.getAge() < 0 || p.getAge() > 135)
            result = RegisterResult.INVALID_AGE;
        else {
            if (!voters.contains(p.getId())){
                result = RegisterResult.VALID;
                voters.add(p.getId());
            }
            else
                result = RegisterResult.DUPLICATED;
        }
        return result;
    }
}