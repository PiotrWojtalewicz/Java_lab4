
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
        return surface;
    }

    @Override
    public String adress(String locality, String street, String houseNumber, String apartmentNumber, String postcode) {
        return null;
    }

    @Override
    public void setWindowsCount(int windowsCount) {
        this.windowsCount = windowsCount;
    }

    @Override
    public int getWindowsCount() {
        return windowsCount;
    }

    @Override
    public void setCitizenCount(int citizenCount) {
        this.citizenCount = citizenCount;
    }

    @Override
    public int getCitizenCount() {
        return citizenCount;
    }

    @Override
    public void setHouseColor(EnumColor color) {
    }

    @Override
    public double priceCalculate(double surface, double price) {
        return price;
    }

    @Override
    public int roomsCount(int bedrooms, int bathrooms) {
        return 0;
    }

    @Override
    public void summary(int priceApartment) {

    }
}





