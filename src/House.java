
public class House implements Building{
 private double surface;
 private String adress;
 private int windows;
 private int citizen;
 private int rooms;
 private int bathrooms;


    @Override
    public double buildingSurface(double surface) {
        return surface;
    }

    @Override
    public String adress(String adress1) {
        return adress1;
    }


    @Override
    public int windowsCount(int windows) {
        return windows ;
    }

    @Override
    public int citizenCount(int citizen) {
        return citizen;
    }



    @Override
    public void houseColor(EnumColor color) {
    }



    @Override
    public int roomsCount(int rooms, int bathrooms) {
        return 0;

    }
}






