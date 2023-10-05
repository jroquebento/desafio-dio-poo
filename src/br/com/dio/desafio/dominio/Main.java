package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJulio = new Dev();
        devJulio.setNome("Júlio");
        devJulio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Júlio" + devJulio.getConteudosInscritos());
        devJulio.progredir();
        devJulio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Júlio" + devJulio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Júlio" + devJulio.getConteudosConcluidos());
        System.out.println("XP:" + devJulio.calcularTotalXp());

        System.out.println("---------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());
    }
}
