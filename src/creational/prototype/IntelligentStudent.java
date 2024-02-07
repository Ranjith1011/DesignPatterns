package creational.prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    //We can use copy constructor and call in clone method
    @Override
    public Student clone(){
        IntelligentStudent st = new IntelligentStudent();
        st.setAge(this.getAge());
        st.setName(this.getName());
        st.setAverageBatchPsp(this.getAverageBatchPsp());
        st.setPsp(this.getPsp());
        st.setBatchName(this.getBatchName());
        st.setUniversityName(this.getUniversityName());
        st.setPhoneNumber(this.getPhoneNumber());
        st.setIq(this.getIq());

        return st;
    }
}
