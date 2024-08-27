package org.carlosaltan.main;

import org.carlosaltan.controller.GestorAcademico;
import org.carlosaltan.model.Curso;
import org.carlosaltan.model.Estudiante;
import org.carlosaltan.model.Inscripciones;
import org.carlosaltan.validator.CursoExistente;
import org.carlosaltan.validator.EstudianteNoInscritoEnCursoException;
import org.carlosaltan.validator.EstudianteYaExisteException;

public class Main {
    public static void main(String[] args) throws EstudianteYaExisteException, CursoExistente, EstudianteNoInscritoEnCursoException {
        Estudiante carlos = new Estudiante("Altán", 18, "2006-02-21", "Carlos", 1);
        Curso mate = new Curso("MATE 1", 1, "Mate básica", 4, "Ciclo 1");
        GestorAcademico gestor = new GestorAcademico();


        gestor.matricularEstudiante(carlos);
        gestor.agregarCurso(mate);
        gestor.inscribirEstudianteCurso(carlos, 1);
        gestor.desinscribirEstudianteCurso(1, 1);



    }
}