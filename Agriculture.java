public class Agriculture {
    String majorAvailable;
    boolean Coop;
    boolean hons;
    boolean general;
    String other;

    public Agriculture (String majorAvailable, boolean Coop, boolean hons, boolean general, String other){
        this.majorAvailable=majorAvailable;
        this.Coop=Coop;
        this.hons=hons;
        this.general=general;
        this.other=other;
    }
    public static void main (String[] args){
        Agriculture major1= new Agriculture("AgriBusiness", true, false, true, null);
        Agriculture major2= new Agriculture("Agroecology", true, false, true, null);
        Agriculture major3= new Agriculture("Agronomy", true, false, true, null);
        Agriculture major4= new Agriculture("Agronomy", true, false, true, null);
        Agriculture major5= new Agriculture("Animal Systems", true, false, true, null);
        Agriculture major6= new Agriculture("Food Science", true, false, true, null);
        Agriculture major7= new Agriculture("Plant Biotechnology", true, false, true, null);
        Agriculture major8= new Agriculture("Food Industry Option", true, true, false, null);
        Agriculture major9= new Agriculture("Foods Option", true, true, false, null);
        Agriculture major10= new Agriculture("Nutrition Option", true, true, false, null);
        Agriculture major11= new Agriculture("2nd Degree", true, true, false, null);
        Agriculture major12= new Agriculture("Pre-Veterinary", false, false, false, null);
        Agriculture major13= new Agriculture("Crop Management", false, false, false, "Diploma");
        Agriculture major14= new Agriculture("Gen Agriculture", false, false, false, "Diploma");
        Agriculture major15= new Agriculture("Livestock Management", false, false, false, "Diploma");
        Agriculture major16= new Agriculture("Business Management", false, false, false, "Diploma");


       
    }
}
