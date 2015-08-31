import java.util.*;
	public Sets(int tipo){
		if(tipo == 0){
		}
			web = new HashSet<Programador>();
			java = new HashSet<Programador>();
			moviles = new HashSet<Programador>();
		if(tipo == 1){
			web = new TreeSet<Programador>();
			java = new TreeSet<Programador>();
			moviles = new TreeSet<Programador>();
		}
		
		if(tipo == 2){
			web = new LinkedHashSet<Programador>();
			java = new LinkedHashSet<Programador>();
			moviles = new LinkedHashSet<Programador>();
		}
	}
	
	public void agregar(String Name,int tipo){
		primero = new Programador(Name,tipo);
		web.add(primero);
	}
	
	public void primera(){
		
	}
	
}
	