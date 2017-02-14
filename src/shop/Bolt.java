package shop;

import java.util.Vector;

/**
 * Created by trixi on 2017.02.14..
 */
public class Bolt
{
    private String nev;
    private String cim;
    private String tulajdonos;
    private Vector<Tej> tejpult;
    private int flag;


    public Bolt(String nev, String cim, String tulajdonos, Vector<Tej> tejpult)
    {
        this.nev = nev;
        this.cim = cim;
        this.tulajdonos = tulajdonos;
        this.tejpult = tejpult;
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

    public boolean vanMegTej()
    {
        if(tejpult.size() > 0)
        {
            return true;
        }
        return  false;
    }

    public Tej vasarolTej(Tej m)
    {
        return tejpult.;
    }

    public void feltoltTej(Tej m)
    {
        tejpult.add(m);
    }


}
