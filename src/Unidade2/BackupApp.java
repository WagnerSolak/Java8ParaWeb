package Unidade2;


import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackupApp {
	
	public static void main(String[] args) throws Exception {
		//definir caminho do arquivo
		
		Path home = Paths.get("C:/Users/wagne/eclipse-workspace/CursoJava2Disciplina/src/Unidade2");
				
		//filtro p fazer backup de todos arquivos .java
		
		String filtro = "*.java";
		
		DirectoryStream<Path> stream = Files.newDirectoryStream(home, filtro);
		
			for(Path p: stream){
				
				Path txt = home.resolve(p);
				Path backup = home.resolve(p+"bak");
				
				Files.copy(txt, backup, StandardCopyOption.REPLACE_EXISTING); //faz a cópia (StandardCopyOption.REPLACE_EXISTING = se existir backup sobrescreva)
		}
	}
}
