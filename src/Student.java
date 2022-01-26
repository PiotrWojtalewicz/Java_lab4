public class Student implements StudentI {

    private int index;

    public void setIndex(int index) {
        this.index = index;
    }
    int getIndex;

    @Override
    public String surname() {
        return "Białkowski" + index;
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
