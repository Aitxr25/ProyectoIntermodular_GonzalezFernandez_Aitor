/**
* Clase Ciclo.java
* @author AITOR GONZÁLEZ FERNÁNDEZ
* @version 1.0
*/

package clases;

public class Ciclo {
    private Long idCiclo;
    private String nombre;
    private String modalidad; // para saber si es diurno, vespertino o online(a distancia)

    public Ciclo(Long idCiclo, String nombre, String modalidad) {
        this.idCiclo = idCiclo;
        this.nombre = nombre;
        this.modalidad = modalidad;
    }

	public Long getIdCiclo() {
		return idCiclo;
	}

	public void setIdCiclo(Long idCiclo) {
		this.idCiclo = idCiclo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

   
}
