package shop.aruk;

import shop.aruk.Elelmiszer;

import java.util.Date;

/**
 * Created by trixi on 2017.02.14..
 */
public abstract class Tej extends Elelmiszer
{

    public static final int LITER = 10;
    public static final int FELLITER = 5;
    public static final int POHAR = 2;
    public static final double ZSIROS = 3.6;
    public static final double FELZSIROS = 2.8;

    protected int urtartalom;
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

    public boolean joMeg()
    {
        Date currentTime = new Date();


        if(currentTime.before(getSzavatossagiIdo()))
        {
            return true;
        }
        else if(currentTime.equals(getSzavatossagiIdo()))
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return ("Tej vonalkódja: " + getVonalKod() + "\n"
        + "Tej űrtartalma: " + getUrtartalom() + "\n"
                + "Gyártó: " + getGyarto() + "\n"
                + "Szavatossági idő: " + getSzavatossagiIdo() + "\n"
                + "Zsírtartalom: " + getZsirTartalom() + "\n");
                //+  "Ár: " + getAr() + "\n");
    }
}
