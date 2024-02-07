package creational.prototype;

public class Client {

    public static void main(String[] args){
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student ranjith = studentRegistry.getPrototype("Feb 2022").clone();
        //Modify other attributes of ranjith

        Student ranjithInt = studentRegistry.getPrototype("Feb 2022 Int").clone();
        //Modify other attributes of ranjith Int

        System.out.println("DEBUG");
    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student st = new Student();
        st.setBatchName("Feb 2022");
        st.setAverageBatchPsp(98.9);

        studentRegistry.addToRegistry(st.getBatchName(), st);

        IntelligentStudent IntSt = new IntelligentStudent();
        IntSt.setIq(180);
        IntSt.setBatchName("Feb 2022 Int");
        IntSt.setAverageBatchPsp(98.9);

        studentRegistry.addToRegistry(IntSt.getBatchName(), IntSt);
    }
}
