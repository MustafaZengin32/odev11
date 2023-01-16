package odev11;

public class Odev11_Muhasebe extends Odev11_Personel {

	double saatlikUcret;
	String statu;
	double maas;
	
	public double maasHesapla(double saatlikUcret ) {
		double maas=saatlikUcret*8*30;
		return maas;
	}
}
