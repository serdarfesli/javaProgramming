package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1= new Offer();
        offer1.setInfo("Remote","Apple","SDET",110000,true,false,false,true);
        Offer offer2 = new Offer();
        offer2.setInfo("Remote","Samsung","Dev",95000,true,true,true,true);
        Offer offer3 = new Offer();
        offer3.setInfo("Local","Amazon","PO",90000,false,false,true,true);
        Offer offer4= new Offer();
        offer4.setInfo("Local","Turkcell","Scrum Master",105000,true,true,true,false);
        Offer offer5 = new Offer();
        offer5.setInfo("Local","Notion","Manager",80000,false,false,true,true);
        Offer offer6 = new Offer();
        offer6.setInfo("remote","Miro","Dev",120000,true,true,false,true);
        Offer offer7 = new Offer();
        offer7.setInfo("Local","Asana","SDET",85000,true,true,true,false);

        Offer[] myOffers ={offer1,offer2,offer3, offer4, offer5, offer6, offer7, }; //array of my offers
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p->p.isFullTime==false);
        System.out.println("fullTimeOffers.size() = " + fullTimeOffers.size());
        System.out.println("fullTimeOffers = " + fullTimeOffers);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!p.location.equals("Local"));
        System.out.println("localOffers.size() = " + localOffers.size());
        System.out.println("localOffers = " + localOffers);

        ArrayList<Offer> offerWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offerWithBenefits.removeIf(p->(p.hasBenefit==false && p.hasPTO==false));
        System.out.println("offerWithBenefits.size() = " + offerWithBenefits.size());
        System.out.println("offerWithBenefits = " + offerWithBenefits);

        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p->!p.jobTitle.equals("SDET"));
        System.out.println("sdetOffers.size() = " + sdetOffers.size());
        System.out.println("sdetOffers = " + sdetOffers);


        ArrayList<Offer> offerWith100K = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p->p.salary<100000);
        System.out.println("offerWith100K.size() = " + offerWith100K.size());
        System.out.println("offerWith100K = " + offerWith100K);






    }
            
}
