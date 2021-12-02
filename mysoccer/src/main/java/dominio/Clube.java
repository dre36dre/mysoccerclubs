package dominio;
import java.io.Serializable;

public class Clube  implements Serializable{
	
private static final long serialversioUID=1L;	
 private Integer id;
 private String nome;
private String estadio;	 

public Clube() {
}

public Clube(Integer id, String nome, String estadio) {
	super();
	this.id = id;
	this.nome = nome;
	this.estadio = estadio;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEstadio() {
	return estadio;
}

public void setEstadio(String estadio) {
	this.estadio = estadio;
}

@Override
public String toString() {
	return "Clube [id=" + id + ", nome=" + nome + ", estadio=" + estadio + "]";
}




}
