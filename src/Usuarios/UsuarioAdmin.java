package Usuarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class UsuarioAdmin extends Usuarios {

	public UsuarioAdmin() {
		super();
	}
	public void Grabar() {
		FileWriter fw=null;
		try {
			fw=new FileWriter("Texto.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write(this.correo);
			bw.newLine();
			bw.write(this.nombre);
			bw.newLine();
			bw.write(this.ciudadResidencia);
			bw.newLine();
			bw.close();
		}catch(Exception e){
			System.out.println("Error al crear el archivo");
		}finally {
			try {
				if(fw!=null) {
					fw.close();
				}
			}catch(Exception e) {
				System.out.println("Error al cerrar el archivo");
			}
		}
		
	}
	public void Leer() {
		FileReader fr=null;
		try {
			String correo=" ";
			String nombre=" ";
			String ciudad=" ";
			fr=new FileReader("Texto.txt");
			BufferedReader br= new BufferedReader(fr);
			while(((correo=br.readLine())!=null)&&((nombre=br.readLine())!=null)&&((ciudad=br.readLine())!=null)) {
					System.out.println("Correo del usuario admin: "+correo);
					System.out.println("Nombre del usuario admin: "+nombre);
					System.out.println("Ciudad de residencia del usuario: "+ciudad);
			}
			br.close();
			}catch(Exception e) {
				System.out.println("Error al abrir el archivo");
			}finally {
				try {
					if(fr!=null) {
						fr.close();
					}
				}catch(Exception e) {
					System.out.println("Error al cerrar el archivo");
				}
			}
		}

}
