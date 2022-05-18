package bulbapplication;
import set1get1.GeekForGeekApplications;

import java.util.ArrayList;
import java.util.List;

public class SetGetApplication {
    public static void main(String[] args) {
        GeekForGeekApplications ps=new GeekForGeekApplications();
        ps.setBulbname("tubelihgt");
        ps.setBulbcost(120);
        ps.setBulbcolour("white");
        ps.setBulblength(7);
        GeekForGeekApplications p1=new GeekForGeekApplications();
        p1.setBulbname("light");
        p1.setBulbcost(12);
        p1.setBulbcolour("red");
        p1.setBulblength(6);
        GeekForGeekApplications p2=new GeekForGeekApplications();
        p2.setBulbname("osram");
        p2.setBulbcost(90);
        p2.setBulbcolour("green");
        p2.setBulblength(9);
        List<GeekForGeekApplications> geekApplications=new ArrayList<>();
        geekApplications.add(ps);
        geekApplications.add(p1);
        geekApplications.add(p2);
        for ( GeekForGeekApplications obj:geekApplications) {
            System.out.println(obj.getBulbname());
            System.out.println(obj.getBulbcost());
            System.out.println(obj.getBulbcolour());
            System.out.println(obj.getBulblength());
            System.out.println("=================");

        }


    }

}
