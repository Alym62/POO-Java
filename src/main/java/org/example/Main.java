package org.example;

import org.example.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Controle de Devs e Bootcamps!");
        System.out.println("<!--- ❌ --->");

        // CURSOS
        Curso curso = new Curso();
        curso.setTitulo("Formação Java");
        curso.setDescricao("Curso voltado para quem quer aprender Java");
        curso.setCargaHoraria(40);

        Curso curso_go = new Curso();
        curso_go.setTitulo("Formação Go");
        curso_go.setDescricao("Curso voltado para quem quer aprender Go lang.");
        curso_go.setCargaHoraria(68);

        // MENTORIAS
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Js");
        mentoria.setDescricao("Mentoria para quem quer melhorar suas habilidades em Js");
        mentoria.setData(LocalDate.now());

        // BOOTCAMP
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Go Developer");
        bootcamp.setDescricao("Bootcamp voltado para a tecnologia Go lang.");
        bootcamp.getConteudos().add(curso_go);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp_java = new Bootcamp();
        bootcamp_java.setNome("Bootcamp Java Developer");
        bootcamp_java.setDescricao("Bootcamp voltado para a tecnologia Java.");
        bootcamp_java.getConteudos().add(curso);
        bootcamp_java.getConteudos().add(mentoria);

        // DEVS
        Dev devAly = new Dev();
        devAly.setNome("Alyasaf");
        devAly.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Dev Aly: " + devAly.getConteudosInscritos());
        devAly.progresso();
        System.out.println("Conteúdos inscritos Dev Aly: " + devAly.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Dev Aly: " + devAly.getConteudosConcluidos());
        System.out.println("XP: " + devAly.calcularTotalXp());

        System.out.println("<!--- ❌ --->");

        Dev devThai = new Dev();
        devThai.setNome("Thaina");
        devThai.inscreverBootcamp(bootcamp_java);
        System.out.println("Conteúdos inscritos Dev Thaina: " + devThai.getConteudosInscritos());
        devThai.progresso();
        System.out.println("Conteúdos inscritos Dev Thaina: " + devThai.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Dev Thaina: " + devThai.getConteudosConcluidos());
        System.out.println("XP: " + devThai.calcularTotalXp());
    }
}