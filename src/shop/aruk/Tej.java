package shop.aruk;

import shop.aruk.Elelmiszer;

import java.util.Date;

/**
 * Created by trixi on 2017.02.14..
 */
public abstract class Tej extends Elelmiszer
{

    private final int LITER = 4;
    private final int FELLITER = 2;
    private final int POHAR = 1;
    private final double ZSIROS = 3.6;
    private final double FELZSIROS = 2.8;

    protected long vonalKod;
    protected int urtartalom;
    protected String gyarto;
    protected Date szavatossagiIdo;
    protected double zsirTartalom;

    public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirTartalom)
    {
        super(vonalKod, gyarto, szavatossagiIdo);
        this.urtartalom = urtartalom;
        this.zsirTartalom = zsirTartalom;
    }

    public long getVonalKod()
    {
        return vonalKod;
    }

    public boolean joMeg()
    {
        Date currentTime = new Date();


        if(currentTime.before(getSzavatossagiIdo()))
        {
            return true;
        }
        return false;
    }

    public int getUrtartalom()
    {
        return urtartalom;
    }

    public String getGyarto()
    {
        return gyarto;
    }

    public Date getSzavatossagiIdo()
    {
        return szavatossagiIdo;
    }

    public double getZsirTartalom()
    {
        return zsirTartalom;
    }

    public String toString()
    {
        return ("Űrtartalom: " + getUrtartalom() + "\n"
                + "Gyártó: " + getGyarto() + "\n"
                + "Szavatossági idő: " + getSzavatossagiIdo() + "\n"
                + "Zsírtartalom: " + getZsirTartalom() + "\n");
                //+  "Ár: " + getAr() + "\n");
    }
}
