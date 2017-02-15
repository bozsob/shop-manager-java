package shop;

import java.util.Date;

/**
 * Created by trixi on 2017.02.15..
 */
public class TejFactory
{
    public Tej getTej(String tejTipus, long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom)
    {
        if (tejTipus.equalsIgnoreCase("Tartós")) {
            return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
        }
        else if (tejTipus.equalsIgnoreCase("Féltartós")) {
            return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirtartalom);
        }
        return  null;
    }
}
