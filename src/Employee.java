public class Employee implements EmployeeI{
    private String boss ;

    public String getBoss(){return boss;}
    public void setBoss(String boss) {
        this.boss = boss;
    }

    @Override
    public String position() {
        return "trainee";
    }

    @Override
    public double income() {
        return 500;
    }

    @Override
    public int hoursCount() {
        return 20;
    }

    @Override
    public String surname() {
        return "Wojtalewicz";
    }

    @Override
    public int age() {
        return 22;
    }
}
