package gr.aueb.cf.cf9.ch11;

public class Main {
    public static void main(String[] args) {


    Student student = new Student();
    Student alice = new Student();
    Student bob = new Student(3, "student", "student");

    alice.setId(1);
    alice.setFirstname("Alice");
    alice.setLastname("Wonderland");


    bob.setId(2);
    bob.setFirstname("Bob");
    bob.setLastname("Dylan");

    System.out.println(bob.getFirstname() + bob.getLastname());
    System.out.printf("ID: %d, Fisrtname %s, Lastname: %s",
            alice.getId(), alice.getFirstname(), alice.getLastname());


    System.out.println(Student.getStudentsCount());




    }

}




