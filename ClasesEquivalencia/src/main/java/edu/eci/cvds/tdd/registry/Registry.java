package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {

        // TODO Validate person and return real result.
		if(!p.isAlive()){
			return RegisterResult.DEAD;
		} else if(p.getAge() < 18){
			return RegisterResult.UNDERAGE;
		} else if(p.getAge()<0 || p.getAge() > 122){
			return RegisterResult.INVALID_AGE;
		}
        return RegisterResult.VALID;
    }
}