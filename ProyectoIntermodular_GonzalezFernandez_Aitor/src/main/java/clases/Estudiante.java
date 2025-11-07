/**
* Clase Estudiante.java
* @author AITOR GONZÁLEZ FERNÁNDEZ
* @version 1.0
*/

package clases;

public class Estudiante extends Persona {
    private Long idEstudiante;
    private int curso;
    private Ciclo ciclo;

    public Estudiante(Long id, String nombre, String email, String nacionalidad,
                      Long idEstudiante, int curso, Ciclo ciclo) {
        super(id, nombre, email, nacionalidad);
        this.idEstudiante = idEstudiante;
        this.curso = curso;
        this.ciclo = ciclo;
    }

	public Long getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

    
}

