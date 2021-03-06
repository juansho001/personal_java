package co.com.builderpattern.main;

public class Asignatura extends Generico{
	
	private String	codigo;
	private String	nombre;
	private Integer	creditos;
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getCreditos() {
		return creditos;
	}
	
	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	@Override
	public String getNombreTabla() {
		return "Asignatura";
	}
}
