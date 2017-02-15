package shop;

import java.util.Date;

/**
 * Created by trixi on 2017.02.15..
 */
public class Sajt extends Elelmiszer
{
    private double zsirTartalom;

    public Sajt(long vonalKod, String gyarto, Date szavatossagiIdo, double zsirTartalom)
    {
        super(vonalKod, gyarto, szavatossagiIdo);
        this.zsirTartalom = zsirTartalom
    }

    @Override
    public long getVonalKod() {
        return vonalKod;
    }

    public String getGyarto() {
        return gyarto;
    }

    @Override
    public boolean joMeg()
    {
        Date currentTime = new Date();

        if(currentTime.before(getSzavatossagiIdo()))
        {
            return true;
        }
        return false;
    }

    @Override
    public Date getSzavatossagiIdo() {
        return szavatossagiIdo;
    }

    public double getZsirTartalom() {
        return zsirTartalom;
    }

    @Override
    public String toString() {
        return ("Gyártó: " + getGyarto() + "\n"
                + "Szavatossági idő: " + getSzavatossagiIdo() + "\n"
                + "Zsírtartalom: " + getZsirTartalom() + "\n");
    }
}
