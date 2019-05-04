package kalkulator;

public class Kalkulator
{
    String liczbaNapis="";
    String liczbaWyswietl;
    
    public String getLiczbaNapis()
    {
        return liczbaNapis;
    }
    
    public void setLiczbaNapis(String s)
    {
        liczbaNapis = s;
    }
    
    public void dodajDoLiczbyNapis(String s)
    {
        if(liczbaNapis.length() <= 9)
        {
            liczbaNapis+=s;
            /*
            if(liczbaNapis % 4 == 0)
            {
                liczbaNapis = liczbaNapis.substring(liczbaNapis.length()-4) + " " + liczbaNapis.substring(liczbaNapis.length()-1);
            }
            
            if(liczbaNapis % 5 == 0)
            {
                liczbaNapis = liczbaNapis.replace
            }
            
            if(liczbaNapis % 6 == 0)
            {
                
            }
            */
        }
    }
    
    private double zamienNaLiczbe(String s)
    {
        return Double.parseDouble(s);
    }
    
    private String zamienNaNapis(double i)
    {
        return String.valueOf(i);
    }
    
    public void dodaj(double a)
    {
        double liczba = zamienNaLiczbe(getLiczbaNapis());
        liczba+=a;
        setLiczbaNapis(zamienNaNapis(liczba));
    }
    
    public void odejmij(double a)
    {
        double liczba = zamienNaLiczbe(getLiczbaNapis());
        liczba = a-liczba;
        setLiczbaNapis(zamienNaNapis(liczba));
    }
    
    public void pomnoz(double a)
    {
        double liczba = zamienNaLiczbe(getLiczbaNapis());
        liczba*=a;
        setLiczbaNapis(zamienNaNapis(liczba));
    }
    
    public void podziel(double a)
    {
        double liczba = zamienNaLiczbe(getLiczbaNapis());
        if(a!=0) liczba = a/liczba;
        setLiczbaNapis(zamienNaNapis(liczba));
    }
}
