package shop;

import java.util.Date;

import shop.aruk.Tej;
import shop.aruk.tej.FeltartosTej;
import shop.aruk.tej.TartosTej;

/**
 * Created by trixi on 2017.02.15..
 */
public class Main
{
    public static void main(String[] args) {
        Date now = new Date(2017, 3,10);

        Tej mizo = new TartosTej(1234, Tej.LITER, "Mizo", now, Tej.FELZSIROS);

        System.out.println(mizo.toString());

        System.out.println(mizo.joMeg());

        BoltFactory factory = new BoltFactory();
        System.out.println(factory.ujFeltartosTej(5678, Tej.FELLITER, "Minna", now, Tej.ZSIROS).toString());



    }
}
