package modelo;

public class Aeropuerto {
	private String codigo;
	private String nombre;
	private Ciudad ciudad;
	
	public Aeropuerto(String codigo, String nombre, Ciudad ciudad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

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

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}
