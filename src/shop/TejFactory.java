package shop;

import shop.aruk.Tej;
import shop.aruk.tej.FeltartosTej;
import shop.aruk.tej.TartosTej;

import java.util.Date;

/**
 * Created by trixi on 2017.02.15..
 */
public class TejFactory
{
    /* public Tej getTej(String tejTipus, long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirTartalom)
    {
        if (tejTipus.equalsIgnoreCase("Tartós")) {
            return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirTartalom);
        }
        else if (tejTipus.equalsIgnoreCase("Féltartós")) {
            return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirTartalom);
        }
        return  null;
    } */

    public Tej ujTartosTej(long vonalKod,
                                    int urtartalom,
                                    String gyarto,
                                    Date szavatossagiIdo,
                                    double zsirTartalom,
                                    long ar)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirTartalom);
    }

    public Tej ujFeltartosTej(long vonalKod,
                                       int urtartalom,
                                       String gyarto,
                                       Date szavatossagiIdo,
                                       double zsirTartalom,
                                       long ar)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirTartalom);
    }
}
