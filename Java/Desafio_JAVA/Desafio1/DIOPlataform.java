package Desafio_JAVA.Desafio1;

import java.time.LocalDate;

class DIOPlatform{
    public static void main(String[]args) {
        Course course1 = new Course();
        course1.setTittle("Java Course");
        course1.setDescribe("Describe Java Course.");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTittle("JavaScript Course");
        course2.setDescribe("Describe JavaScript Course.");
        course2.setWorkload(4);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTittle("Java Mentoring");
        mentoring1.setDescribe("Describe Java Mentoring");
        mentoring1.setDate(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("Bootcamp Java Developer");
        bootcamp1.setDescribe("Describe Bootcamp Java Developer.");
        bootcamp1.getContents().add(course1);
        bootcamp1.getContents().add(course2);
        bootcamp1.getContents().add(mentoring1);

        Dev matheusDev = new Dev();
        matheusDev.setName("Matheus");
        matheusDev.subscribeBootcamp(bootcamp1);
        System.out.println("Subscribed contents: " + matheusDev.getSubscribedContent());
        matheusDev.progress();
        matheusDev.progress();
        System.out.println("Completed contents: " + matheusDev.getCompletedContent());
        System.out.println("XP: " + matheusDev.calculateAllXP());
        System.out.println("Subscribed contents: " + matheusDev.getSubscribedContent());

        Dev luizDev = new Dev();
        luizDev.setName("Luiz");
        luizDev.subscribeBootcamp(bootcamp1);
        System.out.println("Subscribed contents: " + luizDev.getSubscribedContent());
        luizDev.progress();
        luizDev.progress();
        luizDev.progress();
        System.out.println("Completed contents: " + luizDev.getCompletedContent());
        System.out.println("XP: " + luizDev.calculateAllXP());
        System.out.println("Subscribed contents: " + luizDev.getSubscribedContent());



    }
}