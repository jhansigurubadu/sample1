package SetGet;

import SetterGetterMethods.GetterSetterApplications;
import sun.security.rsa.RSAUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductionApplications {
    public static void main(String[] args) {
        GetterSetterApplications p=new GetterSetterApplications();
        p.setName("book");
        p.setPageno(67);
        p.setBookcost(67);
        p.setBookname("choudharymate");
        GetterSetterApplications p1=new GetterSetterApplications();
        p1.setName("pen");
        p1.setPageno(607);
        p1.setBookcost(670);
        p1.setBookname("blueink");

//        p1.setName("pen");
//        p1.setPencost("10.78");
//        p1.colour ="blue";
//        p1.penname ="SANTOOR PEN";
        GetterSetterApplications p2=new GetterSetterApplications();
        p2.setName("pencil");
        p2.setPageno(89);
        p2.setBookcost(85);
        p2.setBookname("chomate");
//        p2.setSoapname("detol");
//        p2.soapcost= "28";
//        p2.soapcolour=("orange");
//        p2.soapexpiredate="2023";
        List<GetterSetterApplications> l1 = new ArrayList<>();
        l1.add(p);
        l1.add(p1);
        l1.add(p2);



        for (GetterSetterApplications obj: l1) {
            System.out.println(obj.getName());
            System.out.println(obj.getPageno());
            System.out.println(obj.getBookcost());
            System.out.println(obj.getBookname());
            System.out.println("===============");

        }


        }









    }

