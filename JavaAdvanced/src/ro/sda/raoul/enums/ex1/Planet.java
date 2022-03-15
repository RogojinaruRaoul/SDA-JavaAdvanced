package ro.sda.raoul.enums.ex1;

public enum Planet {

    JUPITER("Jupiter", "Huge",414124),
    PLUTO("Pluto", "Small",43125123),
    TERRA("Terra", "Medium",0),
    SATURN("Saturn", "ExtraHuge",1645454);

    private final String prettyName;
    private final String size;
    private final long distanceFromTerra;

    // By default the constructor is private.
    private Planet(String prettyName, String size, long distanceFromTerra) {
        this.prettyName = prettyName;
        this.size = size;
        this.distanceFromTerra=distanceFromTerra;
    }

    public long distanceFromEarth(){
        return distanceFromTerra;
    }

    @Override
    public String toString() {
        return size + " " + prettyName;
    }
}
