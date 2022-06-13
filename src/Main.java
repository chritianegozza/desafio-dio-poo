import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
          Curso curso1 = new Curso();
          curso1.setTitulo("curso java");
          curso1.setDescricao("descrição curso java");
          curso1.setCargaHoraria(8);

          Curso curso2 = new Curso();
          curso2.setTitulo("curso js");
          curso2.setDescricao("descrição curso js");
          curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
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

        Dev devChristiane = new Dev();
        devChristiane.setNome("Chritiane");
        devChristiane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devChristiane.getConteudosInscritos());
        devChristiane.progredir();
        devChristiane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devChristiane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devChristiane.getConteudosConcluidos());
        System.out.println("XP:" + devChristiane.calcularTotalXp());

        System.out.println("--------");


        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devArthur.getConteudosConcluidos());
        System.out.println("XP:" + devArthur.calcularTotalXp());

    }
}
