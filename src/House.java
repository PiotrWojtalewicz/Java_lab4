
abstract class House implements Building{
    private double buildingSurface;
    private double yardArea;
    private double parkingSurface;
    private String locality;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String postcode;
    private int windowsCount;
    private int citizenCount;
    private double surface;
    private double price;
    private int bedrooms;
    private int bathrooms;

    @Override
    public double surface(double buildingSurface, double yardArea, double parkingSurface) {
        return surface(55,15,10);
    }

    @Override
    public String adress(String locality, String street, String houseNumber, String apartmentNumber, String postcode) {
        return null;
    }

    @Override
    public void setWindowsCount(int windowsCount) {
        this.windowsCount = windowsCount;
    }


    }




