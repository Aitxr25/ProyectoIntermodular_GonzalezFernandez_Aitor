/**
* Clase FormacionEnEmpresa.java
* @author AITOR GONZÁLEZ FERNÁNDEZ
* @version 1.0
*/

package clases;

import java.time.LocalDate;

public class FormacionEnEmpresa {
    private Long idFCT;
    private String periodo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String documentoAsociado;

    private Estudiante estudiante;
    private Profesor profesor;
    private TutorEmpresa tutorEmpresa;
    private Empresa empresa;

    public FormacionEnEmpresa(Long idFCT, String periodo, LocalDate fechaInicio, LocalDate fechaFin,
                              String documentoAsociado, Estudiante estudiante, Profesor profesor,
                              TutorEmpresa tutorEmpresa, Empresa empresa) {
        this.idFCT = idFCT;
        this.periodo = periodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.documentoAsociado = documentoAsociado;
        this.estudiante = estudiante;
        this.profesor = profesor;
        this.tutorEmpresa = tutorEmpresa;
        this.empresa = empresa;
    }

	public Long getIdFCT() {
		return idFCT;
	}

	public void setIdFCT(Long idFCT) {
		this.idFCT = idFCT;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getDocumentoAsociado() {
		return documentoAsociado;
	}

	public void setDocumentoAsociado(String documentoAsociado) {
		this.documentoAsociado = documentoAsociado;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public TutorEmpresa getTutorEmpresa() {
		return tutorEmpresa;
	}

	public void setTutorEmpresa(TutorEmpresa tutorEmpresa) {
		this.tutorEmpresa = tutorEmpresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

   
}