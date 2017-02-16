package shop.aruk;

import shop.Aru;

import java.util.Date;

/**
 * Created by trixi on 2017.02.15..
 */
public abstract class Elelmiszer extends Aru
{
    protected long vonalKod;
    protected String gyarto;
    protected Date szavatossagiIdo;

    public Elelmiszer(long vonalKod, String gyarto, Date szavatossagiIdo)
    {
        this.vonalKod = vonalKod;
        this.gyarto = gyarto;
        this.szavatossagiIdo = szavatossagiIdo;
    }

    public abstract long getVonalKod();
    public abstract String getGyarto();
    public abstract Date getSzavatossagiIdo();
    public abstract boolean joMeg();
    public abstract String toString();
}
