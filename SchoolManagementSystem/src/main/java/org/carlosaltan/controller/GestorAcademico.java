package org.carlosaltan.controller;

import javafx.scene.SubScene;
import org.carlosaltan.model.Curso;
import org.carlosaltan.model.Estudiante;
import org.carlosaltan.model.Inscripciones;
import org.carlosaltan.validator.CursoExistente;
import org.carlosaltan.validator.EstudianteNoInscritoEnCursoException;
import org.carlosaltan.validator.EstudianteYaExisteException;


import java.util.*;

public class GestorAcademico implements ServiciosAcademicosI {

    final List<Estudiante> estudianteList = new ArrayList<>();
    final List<Curso> cursoList = new ArrayList<>();
    final List<Inscripciones> inscripcionesList = new ArrayList<>();
    Map<Curso, List<Estudiante>> estudianteMap = new HashMap<>();

    @Override
    public void matricularEstudiante(Estudiante estudiante) throws EstudianteYaExisteException {
        for (Estudiante e : estudianteList) {
            if (e.getId() == estudiante.getId()) {
                    throw new EstudianteYaExisteException("El estudiante con ID " + estudiante.getId() + " ya existe.");
            }
        }
        estudianteList.add(estudiante);
        System.out.println("Estudiante " + estudiante.getId() + " registrado.");
    }

    @Override
    public void agregarCurso(Curso curso) throws CursoExistente {
        for(Curso c : cursoList){
            if(c.getNombre() == curso.getNombre()){
                throw new CursoExistente("Este Curso ya está registrado");
            }
        }
        cursoList.add(curso);
        System.out.println("Curso " + curso.getId() + " registrado.");
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, Integer idCurso) throws EstudianteNoInscritoEnCursoException {

        boolean yaInscrito = false;
        for (Inscripciones e : inscripcionesList) {
            if (e.getIdCurso().equals(idCurso) && e.getEstudiante().getId().equals(estudiante.getId())) {
                yaInscrito = true;
                break;
            }
        }
        if (yaInscrito) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante ya está inscrito en el curso con ID " + idCurso + ".");
        }
        inscripcionesList.add(new Inscripciones(estudiante, idCurso));
        System.out.println("Estudiante " + estudiante.getId() + " registrado.");
    }

    @Override
    public void desinscribirEstudianteCurso(Integer idEstudiante, Integer idCurso) throws EstudianteNoInscritoEnCursoException {
        Iterator<Inscripciones> iterator = inscripcionesList.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Inscripciones inscripcion = iterator.next();
            if (inscripcion.getIdCurso().equals(idCurso) && inscripcion.getEstudiante().getId().equals(idEstudiante)) {
                iterator.remove();
                encontrado = true;
                System.out.println("Removido");
                break;

            }
        }
        if (!encontrado) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante con ID " + idEstudiante + " no está inscrito en el curso con ID " + idCurso + ".");
        }

    }
}
