import br.com.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Aprenda java - POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso c#");
        curso2.setDescricao("Aprenda c# - POO");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso();


        //Polimorfismo: instanciou um Array list a partir da classe List.
        /*Tudo o que tem dentro de List tem dentro
        de ArrayList, mas nem tudo que tem dentro
        ArrayList tem dentro de List.*/
        //List<String> palavras = new ArrayList<>();



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Gabriel" + devGabriel.getConteudosInscritos());

        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Gabriel" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Oswaldo" + devGabriel.getConteudoConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

        System.out.println("------------");
        Dev devOswaldo = new Dev();
        devOswaldo.setNome("Oswaldo");
        devOswaldo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Oswaldo" + devOswaldo.getConteudosInscritos());
        devOswaldo.progredir();
        devOswaldo.progredir();
        devOswaldo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Oswaldo" + devOswaldo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Oswaldo" + devOswaldo.getConteudoConcluidos());
        System.out.println("XP: " + devOswaldo.calcularTotalXp());

    }
}