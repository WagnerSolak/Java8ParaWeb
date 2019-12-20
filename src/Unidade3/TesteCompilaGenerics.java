package Unidade3;


import java.util.Set;
import java.util.TreeSet;

public class TesteCompilaGenerics {
	//a) Errado porque esta add String Builder onde deve ser do tp String
	//Set<String> strSet = new HashSet<String>();
	//strSet.add(new StringBuilder("hello"));
	
	//b) Correto
	Set<? extends Float> s = new TreeSet<Float>();
	
	//c) Errado porque não trata objeto, esta tratando tipo primitivo int
	//LinkedList<int> list = new LinkedList<int>();
	// lista encadeada
}
