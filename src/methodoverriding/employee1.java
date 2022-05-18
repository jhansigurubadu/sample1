package methodoverriding;

public class employee1 extends employee{
    @Override
    public void name() {
        String name = "bbbb";
        int id = 300;
        System.out.println(name + " " + id);
    }
}
