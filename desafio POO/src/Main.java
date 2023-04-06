import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Bootcamp Full Stack");
        curso1.setDescricao("Front End + Back End");
        curso1.setCargaHoraria(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("Bootcamp Orange Tech +");
        curso2.setDescricao("Front End");
        curso2.setCargaHoraria(80);

        Curso curso3 = new Curso();
        curso3.setTitulo("Bootcamp Orange Tech + Back End");
        curso3.setDescricao("Backe End");
        curso3.setCargaHoraria(80);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" DIO ");
        mentoria.setDescricao(" Contrato de compromisso ");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp Full Stack ");
        bootcamp.setDescricao(" Front End + Back End ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);


        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda Ribeiro");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamp inscritos Amanda: " + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        System.out.println("--");
        System.out.println("Desafios Concluídos Amanda:" + devAmanda.getConteudosConcluidos());
        System.out.println("Bootcamp que ainda falta finaliza Amanda: " + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        devAmanda.progredir();
        System.out.println("Bootcamp finalizados: " + devAmanda.getConteudosConcluidos());
        devAmanda.progredir();
        System.out.println("Bootcamp concluídos: " + devAmanda.getConteudosConcluidos());

        System.out.println("__________________________________________________________________");
        System.out.println("__________________________________________________________________");


        Dev devCamila= new Dev();
        devCamila.setNome("Camila Oliveira");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamp inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Desafios Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("Bootcamp que ainda falta finaliza Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Bootcamp finalizados: " + devCamila.getConteudosConcluidos());
        devCamila.progredir();
        System.out.println("Bootcamp concluídos: " + devCamila.getConteudosConcluidos());
    }
}
