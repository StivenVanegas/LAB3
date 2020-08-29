package edu.eci.cvds.tdd.registry;
import java.util.*;

public class Registry {
	
	private ArrayList<Integer> registered = new ArrayList<Integer>();
	
    public RegisterResult registerVoter(Person p) {

        // TODO Validate person and return real result.
		if(!p.isAlive()){
			return RegisterResult.DEAD;
		} else if(p.getAge() < 18){
			return RegisterResult.UNDERAGE;
		} else if(p.getAge()<0 || p.getAge() > 122){
			return RegisterResult.INVALID_AGE;
		} else if(registered.contains(p.getId())){
			return RegisterResult.DUPLICATED;
		} else{
			registered.add(p.getId());
			return RegisterResult.VALID;
		}
        
    }
}