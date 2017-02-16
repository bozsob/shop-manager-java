package shop;

import java.util.Date;

/**
 * Created by trixi on 2017.02.15..
 */
public class Sajt extends Elelmiszer
{
    protected double suly;
    protected double zsirTartalom;
    protected long vonalKod;
    protected String gyarto;
    protected Date szavatossagiIdo;


    public Sajt(long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirTartalom)
    {
        super(vonalKod, gyarto, szavatossagiIdo);
        this.zsirTartalom = zsirTartalom;
        this.suly = suly;
    }

    @Override
    public long getVonalKod() {
        return vonalKod;
    }

    public double getSuly() {
        return suly;
    }

    public String getGyarto() {
        return gyarto;
    }

    @Override
    public Date getSzavatossagiIdo() {
        return szavatossagiIdo;
    }

    public double getZsirTartalom() {
        return zsirTartalom;
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
    public String toString() {
        return ("Sajt súlya: " + getSuly()
                + "Gyártó: " + getGyarto() + "\n"
                + "Szavatossági idő: " + getSzavatossagiIdo() + "\n"
                + "Zsírtartalom: " + getZsirTartalom() + "\n");
    }
}
