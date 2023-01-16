package odev11;

import java.util.ArrayList;
import java.util.List;

public class Odev11_aIsci extends Odev11_Muhasebe {
	
	public Odev11_aIsci(String isim,String soyIsim,String address,String statu,String telefon) {
    
		super.isim=isim;
		super.soyIsim=soyIsim;
		super.address=address;
		super.statu=statu;
		super.telefon=telefon;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Odev11_aIsci isci1=new Odev11_aIsci("Ahmet","Cengiz","UluCamii","Vasifsiz","05324757685");
		
		
		String id1String=String.valueOf(isci1.idAtama());
		
		String maas1String=String.valueOf(isci1.maasHesapla(50));
		
		List<String>list= new ArrayList<>();
		list.add(isci1.isim);
		list.add(isci1.soyIsim);
		list.add(isci1.address);
		list.add(isci1.statu);
		list.add(isci1.telefon);
		
		list.add(maas1String);
		list.add(id1String);
		System.out.println(list);
		
		
		Odev11_aIsci isci2=new Odev11_aIsci("xhmet","vengiz","kUluCamii","usta","04324757685");
		String id2String=String.valueOf(isci2.idAtama());
		
		String maas2String=String.valueOf(isci2.maasHesapla(65));
		
		List<String>list2= new ArrayList<>();
		list2.add(isci2.isim);
		list2.add(isci2.soyIsim);
		list2.add(isci2.address);
		list2.add(isci2.statu);
		list2.add(isci2.telefon);
		
		list2.add(maas2String);
		list2.add(id2String);
		System.out.println(list2);
	
		
		Odev11_aIsci isci3=new Odev11_aIsci("vehmet","aligiz","SultanCamii","basefendi","09324757685");
		String id3String=String.valueOf(isci3.idAtama());
		
		String maas3String=String.valueOf(isci3.maasHesapla(75));
		
		List<String>list3= new ArrayList<>();
		list3.add(isci3.isim);
		list3.add(isci3.soyIsim);
		list3.add(isci3.address);
		list3.add(isci3.statu);
		list3.add(isci3.telefon);
		
		list3.add(maas3String);
		list3.add(id3String);
		System.out.println(list3);
	
		
      //Odev11_aMemur memur1=new Odev11_aMemur();//static olmasaydi obje olusturulmali
       Odev11_aMemur.memur();
       
      
	}
	
	
	
	
	
	

}


