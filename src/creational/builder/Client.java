package creational.builder;

public class Client {

    public static void main(String[] args){
        Student st = Student.getBuilder()
                .setName("Ranjith")
                .setAge(25)
                .setPhoneNumber("234567")
                .setUniversityName("IITI")
                .setPsp(98.8)
                .build();

        System.out.println("DEBUG");
    }
}
