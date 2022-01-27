public class Student implements StudentI {

    private int index;
    private String surname;
    private double averageGrade;

    public Integer getIndex() {return index;}
    public void setIndex(int index) {
        this.index = index;
    }

    public double getAverageGrade() {return averageGrade;}
    public void setAverageGrade(double averageGrade) { this.averageGrade= averageGrade;}

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
    public String library() {
        return " Miejska bilioteka - Gdańsk ";
    }
}
