public class Hello {
    public static void main(String[] args) {
       String sellerName = "Sprzedawca";

       String buyerName = "Kupujacy";

       String productName = "Krzeslo";

// Chcialem najpierw urzyc int, ale product moze byc sprzedawany w innych wymiarach niz sztuki
       double quantity = 6;

       double percentageVat = 23;

       double priceItem = 40;

//   VAT za jedna sztuke
       double vatValue = priceItem * percentageVat/100;

//   Cena za sztuke z VAT
       double itemPriceWithVat = priceItem + vatValue;

//   Cena za sztuke bez VAT
       double sumWithOutVat = quantity * priceItem;

//   Cawkowita suma z VAT
       double paySumWithVat = quantity * itemPriceWithVat;

//   Cawkowity VAT
       double vatSum = vatValue * quantity;



    }

}