package shop;

import java.util.Date;

/**
 * Created by trixi on 2017.02.14..
 */
public abstract class Tej
{

    private final int LITER = 4;
    private final int FELLITER = 2;
    private final int POHAR = 1;
    private final double ZSIROS = 3.6;
    private final double FELZSIROS = 2.8;

    protected long vonalKod;
    protected int urtartalom;
    protected String gyarto;
    protected Date szavatossagIdo;
    protected double zsirtartalom;

    public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagIdo, double zsirtartalom)
    {
        this.vonalKod = vonalKod;
        this.urtartalom = urtartalom;
        this.gyarto = gyarto;
        this.szavatossagIdo = szavatossagIdo;
        this.zsirtartalom = zsirtartalom;
    }

    public long getVonalKod()
    {
        return vonalKod;
    }

    public boolean joMeg()
    {
        Date currentTime = new Date();


        if(currentTime.before(getSzavatossagIdo()))
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

    public Date getSzavatossagIdo()
    {
        return szavatossagIdo;
    }

    public double getZsirtartalom()
    {
        return zsirtartalom;
    }

    public String toString()
    {
        return ("Űrtartalom: " + getUrtartalom() + "\n"
                + "Gyártó: " + getGyarto() + "\n"
                + "Szavatossági idő: " + getSzavatossagIdo() + "\n"
                + "Zsírtartalom: " + getZsirtartalom() + "\n");
                //+  "Ár: " + getAr() + "\n");
    }
}
