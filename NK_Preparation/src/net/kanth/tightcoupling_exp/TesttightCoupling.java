package net.kanth.tightcoupling_exp;

class CricketBat {
   public void useBat() {
        System.out.println("Playing cricket with the bat");
    }
}
class SportsShop {
    private CricketBat bat;  // Direct dependency on CricketBat

    SportsShop() {
        bat = new CricketBat();  // Creating object inside → TIGHT COUPLING
    }

    public void sellProduct() {
        bat.useBat();
    }
}
public class TesttightCoupling {
	  public static void main(String[] args) {
	        SportsShop shop = new SportsShop();
	        shop.sellProduct();
	    }
}
