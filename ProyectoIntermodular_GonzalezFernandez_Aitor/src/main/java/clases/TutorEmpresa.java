/**
* Clase TutorEmpresa.java
* @author AITOR GONZÁLEZ FERNÁNDEZ
* @version 1.0
*/

package clases;

public class TutorEmpresa extends Persona {
    private Long idTutor;
    private Empresa empresa;

    public TutorEmpresa(Long id, String nombre, String email, String nacionalidad,
                        Long idTutor, Empresa empresa) {
        super(id, nombre, email, nacionalidad);
        this.idTutor = idTutor;
        this.empresa = empresa;
    }

	public Long getIdTutor() {
		return idTutor;
	}

	public void setIdTutor(Long idTutor) {
		this.idTutor = idTutor;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


}