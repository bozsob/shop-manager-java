package shop;

import java.util.Date;

/**
 * Created by trixi on 2017.02.14..
 */
public class Tej
{
    private int urtartalom;
    private String gyarto;
    private Date szavatossagIdo;
    private double zsirtartalom;
    private long ar;

    public Tej(int urtartalom, String gyarto, Date szavatossagIdo, double zsirtartalom, long ar)
    {
        this.urtartalom = urtartalom;
        this.gyarto = gyarto;
        this.szavatossagIdo = szavatossagIdo;
        this.zsirtartalom = zsirtartalom;
        this.ar = ar;
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

    public long getAr()
    {
        return ar;
    }

    public String toString()
    {
        return ("Űrtartalom: " + getUrtartalom() + "\n"
                + "Gyártó: " + getGyarto() + "\n"
                + "Szavatossági idő: " + getSzavatossagIdo() + "\n"
                + "Zsírtartalom: " + getZsirtartalom() + "\n"
                +  "Ár: " + getAr() + "\n");
    }
}
