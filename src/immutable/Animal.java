package immutable;

public final class Animal {
    private final int i;

    public int getI() {
        return i;
    }

    public String getColour() {
        return colour;
    }

    private final String colour;
    Animal(int i,String colour){
        this.i=i;
        this.colour=colour;


    }

}


