package shop;

import shop.aruk.Sajt;
import shop.aruk.Szappan;
import shop.aruk.Tej;
import shop.aruk.tej.FeltartosTej;
import shop.aruk.tej.TartosTej;

import java.util.Date;

/**
 * Created by trixi on 2017.02.15..
 */
public class BoltFactory
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

    public Tej ujTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirTartalom)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirTartalom);
    }

    public Tej ujFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirTartalom)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, zsirTartalom);
    }

    public Tej ujFelzsirosTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.FELZSIROS);
    }

    public Tej ujZsirosTartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.ZSIROS);
    }

    public Tej ujFelzsirosFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.FELZSIROS);
    }

    public Tej ujZsirosFeltartosTej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, urtartalom, gyarto, szavatossagiIdo, Tej.ZSIROS);
    }

    public Tej ujFelzsirosLiteresTartosTej(long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, Tej.LITER, gyarto, szavatossagiIdo, Tej.FELZSIROS);
    }

    public Tej ujZsirosLiteresTartosTej(long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new TartosTej(vonalKod, Tej.LITER, gyarto, szavatossagiIdo, Tej.ZSIROS);
    }

    public Tej ujFelzsirosLiteresFeltartosTej(long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, Tej.LITER, gyarto, szavatossagiIdo, Tej.FELZSIROS);
    }

    public Tej ujZsirosLiteresFeltartosTej(long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        return new FeltartosTej(vonalKod, Tej.LITER, gyarto, szavatossagiIdo, Tej.ZSIROS);
    }

    public Sajt ujSajt(long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirTartalom)
    {
        return new Sajt(vonalKod, suly, gyarto, szavatossagiIdo, zsirTartalom);
    }

    public Szappan ujSzappan(long vonalKod, String gyarto, char mosohatas)
    {
        return new Szappan(vonalKod, gyarto, mosohatas);
    }

    public Szappan ujAMosohatasuSzappan(long vonalKod, String gyarto)
    {
        return new Szappan(vonalKod, gyarto, 'a');
    }
}
