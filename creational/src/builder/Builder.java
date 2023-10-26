package builder;

interface Builder {

    void reset();
    void setSeats( int nrOfSeats);
    void setEngine(Engine e);
    void setTripComputer();
    void setGPS();
}
