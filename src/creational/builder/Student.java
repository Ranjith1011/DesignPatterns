package creational.builder;

public class Student {
    private String name;
    private int age;
    private String universityName;
    private String phoneNumber;
    private double psp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    Not a good approach
//    public Student(String name, int age ....){
//
//    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public Student(){

    }


    private Student(Builder builder){
        //Perform validations on builder attributes, if all met create Student objets
        this.age = builder.getAge();
        this.name = builder.getName();
        this.psp = builder.getPsp();
        this.phoneNumber = builder.getPhoneNumber();
        this.universityName = builder.getUniversityName();


    }

    public static class Builder {

        private String name;
        private int age;
        private String universityName;
        private String phoneNumber;
        private double psp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build(){
            //Perform validations on builder attributes, if all met create Student objets
            return new Student(this);
        }
    }

}
