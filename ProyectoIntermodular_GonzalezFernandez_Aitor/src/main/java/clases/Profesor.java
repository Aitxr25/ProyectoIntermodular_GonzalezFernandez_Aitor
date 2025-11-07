/**
* Clase Profesor.java
* @author AITOR GONZÁLEZ FERNÁNDEZ
* @version 1.0
*/

package clases;

public class Profesor extends Persona {
    private Long idProfesor;
    private boolean esCoordinador;
    private Ciclo cicloAsignado;

    public Profesor(Long id, String nombre, String email, String nacionalidad,
                    Long idProfesor, boolean esCoordinador, Ciclo cicloAsignado) {
        super(id, nombre, email, nacionalidad);
        this.idProfesor = idProfesor;
        this.esCoordinador = esCoordinador;
        this.cicloAsignado = cicloAsignado;
    }

	public Long getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(Long idProfesor) {
		this.idProfesor = idProfesor;
	}

	public boolean isEsCoordinador() {
		return esCoordinador;
	}

	public void setEsCoordinador(boolean esCoordinador) {
		this.esCoordinador = esCoordinador;
	}

	public Ciclo getCicloAsignado() {
		return cicloAsignado;
	}

	public void setCicloAsignado(Ciclo cicloAsignado) {
		this.cicloAsignado = cicloAsignado;
	}

    
}
