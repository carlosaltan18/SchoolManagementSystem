package org.carlosaltan.controller;

import org.carlosaltan.model.Curso;
import org.carlosaltan.model.Estudiante;
import org.carlosaltan.validator.CursoExistente;
import org.carlosaltan.validator.EstudianteYaExisteException;
import org.carlosaltan.validator.EstudianteNoInscritoEnCursoException;

public interface ServiciosAcademicosI {

    public void matricularEstudiante(Estudiante estudiante) throws EstudianteYaExisteException;
    public void agregarCurso(Curso curso) throws CursoExistente;
    public void inscribirEstudianteCurso(Estudiante estudiante, Integer idCurso) throws EstudianteNoInscritoEnCursoException;
    public void desinscribirEstudianteCurso(Integer idEstudiante, Integer idCurso) throws EstudianteNoInscritoEnCursoException;


}
