package shop;

import shop.aruk.Elelmiszer;
import shop.aruk.Sajt;
import shop.aruk.Tej;

import java.util.Hashtable;

/**
 * Created by trixi on 2017.02.14..
 */
public class Bolt
{
    private String nev;
    private String cim;
    private String tulajdonos;
    private Hashtable<Long, BoltBejegyzes> elelmiszerPult;

    public Bolt(String nev, String cim, String tulajdonos, Hashtable<Long, BoltBejegyzes> elelmiszerPult)
    {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.elelmiszerPult = elelmiszerPult;
    }

    public Bolt(String nev, String cim, String tulajdonos)
    {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    private boolean vanMegAdottAru(Class c)
    {
        for (BoltBejegyzes b : elelmiszerPult.values()) {
            if (b.getElelmiszer().getClass().equals(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean vanMegTej()
    {
        if(vanMegAdottAru(Tej.class))
        {
        return true;
        }
        else
            {
            return false;
            }
    }

    public boolean vanMegSajt()
    {
        if(vanMegAdottAru(Sajt.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void feltoltElelmiszerrel(long vonalKod, long mennyiseg)
    {
        for (long v : elelmiszerPult.keySet()) {
            if(vonalKod == v)
            {
                elelmiszerPult.get(v).adMennyiseg(mennyiseg);
            }
        }
    }

    public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar)
    {
        BoltBejegyzes ujElelmiszer = new BoltBejegyzes(e, mennyiseg, ar);
        elelmiszerPult.put(e.getVonalKod(), ujElelmiszer);
    }

    public void torolElelmiszert(long vonalKod)
    {
        elelmiszerPult.remove(vonalKod);
    }

    public void vasarolElelmiszert(long vonalKod, long mennyiseg)
    {
        for ( long v : elelmiszerPult.keySet())
        {
            if(v == vonalKod)
            {
                elelmiszerPult.get(v).levonMennyiseg(mennyiseg);
            }
        }
    }


    public class BoltBejegyzes
    {

        private Elelmiszer e;
        private long mennyiseg;
        private long ar;

        public BoltBejegyzes(Elelmiszer e, long mennyiseg, long ar)
        {
            this.e = e;
            this.mennyiseg = mennyiseg;
            this.ar = ar;
        }

        public Elelmiszer getElelmiszer() {
            return e;
        }

        public void setElelmiszer(Elelmiszer e) {
            this.e = e;
        }

        public long getMennyiseg() {
            return mennyiseg;
        }

        public void setMennyiseg(long mennyiseg) {
            this.mennyiseg = mennyiseg;
        }

        public long getAr() {
            return ar;
        }

        public void setAr(long ar) {
            this.ar = ar;
        }

        public void adMennyiseg(long mennyiseg)
        {
            this.mennyiseg += mennyiseg;
        }

        public void levonMennyiseg(long mennyiseg)
        {
            this.mennyiseg -= mennyiseg;
        }

    }
}
