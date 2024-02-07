package creational.prototype;

public class Student {
    private String name;
    private int age;
    private String universityName;
    private String phoneNumber;
    private double psp;
    private double averageBatchPsp;
    private String batchName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }


    //We can use copy constructor and call in clone method
    public Student clone(){
        Student st = new Student();
        st.setAge(this.getAge());
        st.setName(this.getName());
        st.setAverageBatchPsp(this.getAverageBatchPsp());
        st.setPsp(this.getPsp());
        st.setBatchName(this.getBatchName());
        st.setUniversityName(this.getUniversityName());
        st.setPhoneNumber(this.getPhoneNumber());

        return st;
    }
}
