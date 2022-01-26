public interface Building {

    double surface(double buildingSurface, double yardArea, double parkingSurface);

    String adress(String locality, String street, String houseNumber, String apartmentNumber, String postcode);

    void setWindowsCount(int windowsCount);

    int getWindowsCount();

    void setCitizenCount(int citizenCount);

    int getCitizenCount();

    void setHouseColor(EnumColor color);

    enum getHouseColor {}

    double priceCalculate(double surface, double price);

    int roomsCount(int bedrooms, int bathrooms);

}

