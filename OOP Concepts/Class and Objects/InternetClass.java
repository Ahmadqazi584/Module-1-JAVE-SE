package com.company;
class Internet{
    String Brand;
    int speedinmbps;
    String service;
}
public class InternetClass {
    public static void main(String[] args){
        Internet upperweb = new Internet();
        upperweb.Brand = "Zong";
        upperweb.speedinmbps = 5;
        upperweb.service = "24/7";
        System.out.println("The net of " + upperweb.Brand + " having speed " + upperweb.speedinmbps +" with service of " + upperweb.service );

        Internet deepweb = new Internet();
        deepweb.Brand = "Fibre";
        deepweb.speedinmbps = 10;
        deepweb.service = "24/7";
        System.out.println("The net of " + deepweb.Brand + " having speed " + deepweb.speedinmbps +" with service of " + deepweb.service );

        Internet darkweb = new Internet();
        darkweb.Brand = "Konnect";
        darkweb.speedinmbps = 6;
        darkweb.service = "6 days a week";
        System.out.println("The net of " + darkweb.Brand + " having speed " + darkweb.speedinmbps +" with service of " + darkweb.service );

    }
}
