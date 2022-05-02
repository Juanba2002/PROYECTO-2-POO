package Usuarios;

public class Usuarios {

	public Usuarios() {
		// TODO Auto-generated constructor stub
	}
	public String correo;
	public String nombre;
	public String ciudadResidencia;
	
	public Usuarios(String correo,String nombre,String ciudadResidencia) {
		this.correo=correo;
		this.nombre=nombre;
		this.ciudadResidencia=ciudadResidencia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}
	
	public void Grabar() {
		System.out.println("No se grabada ningun dato");
	}
	public void Leer() {
		System.out.println("No se grabado nigun dato");
	}

}
