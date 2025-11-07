/**
* Clase Credenciales.java
* @author AITOR GONZÁLEZ FERNÁNDEZ
* @version 1.0
*/

package clases;

public class Credenciales {
	 private Long id;
	    private String usuario;
	    private String password;
	    private Perfil perfil;

	    public Credenciales(Long id, String usuario, String password, Perfil perfil) {
	        this.id = id;
	        this.usuario = usuario;
	        this.password = password;
	        this.perfil = perfil;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Perfil getPerfil() {
			return perfil;
		}

		public void setPerfil(Perfil perfil) {
			this.perfil = perfil;
		}

	  
	}
