package prueba;

import com.google.auto.value.*;

@AutoValue
public abstract class Persona {
	static Persona create( String name, int age ) {
	    return new AutoValue_Persona( name, age );
	  } 
	 
	    abstract String name();
	    abstract int age();
	    
}
