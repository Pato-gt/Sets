import java.util.*;
public class Sets {
	private Set<Programador> st;
	private Programador primero;
	private Iterator ir;
	
	public class Sets(int tipo){
		Iterator ir  = new Iterable();
		if(tipo == 0){
		}
			st = new HashSet<Programador>();
		if(tipo == 1){
			st = new TreeSet<Programador>();
		
		}
		
		if(tipo == 2){
			st = new LinkedHashSet<Programador>();
		}
	}
	
	
	
	
}
