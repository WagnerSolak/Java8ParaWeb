package Unidade3.persistencia;

public class PersistenceApp {
	
	public static void main(String[] args) {
	
	GenericDAO<Administrativo> admin = new GenericDAO<>();
	admin.create(new Administrativo());

	
	GenericDAO<Diretor> diretor = new GenericDAO<>();
	diretor.create(new Diretor());
	
	}
	
}
