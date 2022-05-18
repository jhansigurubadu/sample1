package javaoopsconcepts;

abstract class Flowers {
    abstract void colour();
}
class rose extends Flowers {

    @Override
    void colour() {
        System.out.println("rose are beautiful");

    }
}
class main{
    public static void main(String[] args) {
        rose r=new rose();
        r.colour();
    }
}





