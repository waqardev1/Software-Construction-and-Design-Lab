// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Bill
{
    double bill = 44.50;
}
class TaxPercent{
    double taxPercent = 0.0675; //divided 6.75/100 to get a multiplier 
}
class Tip{
    double tip = 0.15;
}
class TaxAmount{
    Bill b1 = new Bill();
    TaxPercent taxper = new TaxPercent();
    double taxAmount =  b1.bill *taxper.taxPercent;
}
class BillAfterTax{
    Bill b1 = new Bill();
    TaxAmount tam = new TaxAmount();
    double billAfterTax = b1.bill+tam.taxAmount;
}
class LabExercise1 {
    public static void main(String[] args) {
        Bill bill1 = new Bill();
        TaxPercent taxper = new TaxPercent();
        Tip tip = new Tip();
        TaxAmount t2 = new TaxAmount();
       BillAfterTax bat = new BillAfterTax();
        
        
        double tipAmount = bat.billAfterTax*tip.tip;
        double totalBill = bat.billAfterTax+tipAmount;
        System.out.println("Meal Cost : " + bill1.bill + "\n" + "Tax Amount : " + t2.taxAmount + "\n" + "Tip Amount : " + tipAmount + "\n" + "Total Bill : " + totalBill + "\n");
      
    }
}