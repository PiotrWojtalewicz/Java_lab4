public class Student implements StudentI {

    private int index;
    private String surname;

    public Integer getIndex() {return index;}
    public void setIndex(int index) {
        this.index = index;
    }


    @Override
    public String surname() {
        return "Białkowski" ;
    }

    @Override
    public int age() {
        return 23;
    }

    @Override
    public String department() {
        return "Economics";
    }

    @Override
    public String fieldOfStudy() {
        return "accountant";
    }

    @Override
    public double averageGrade() {
        return 3.76;
    }
}
