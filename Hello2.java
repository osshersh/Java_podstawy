public class Hello2 {
    public static void main(String [] args){
       String vinNumber = "1HGBH41JXMN109186";

       String numberRegistration = "AB 12345";

       String carBrand = "Nissan";

       String model = "Skyline GT-R";

       short year = 1998;

       String nameLastOwner = "John Smith";

       double engineCap = 2.6;

       char separator = ',';

       String info = "VIN: " + vinNumber + separator + " Numer rejestracyjny: " + numberRegistration + separator
       + " Marka: " + carBrand + separator + " Model: " + model + separator + " Rok produkcji: " + year + separator
               + " Imie i nazwisko ostatniego wlasciciela: " + nameLastOwner + separator + " Pojemnosc silnika: " + engineCap;


        System.out.println(info);
    }
}
