package javaZadanieRekrutacyjne;

public class CashRegister {
	   private Coin[] coins;
	public CashRegister() {
	        coins = new Coin[]{
	                new Coin("5 zł", 500, 1),
	                new Coin("2 zł", 200, 3),
	                new Coin("1 zł", 100, 5),
	                new Coin("50 gr", 50, 10),
	                new Coin("20 gr", 20, 20),
	                new Coin("10 gr", 10, 200),
	                new Coin("5 gr", 5, 100),
	                new Coin("2 gr", 2, 100),
	                new Coin("1 gr", 1, 10000)
	        };
	    }
	   public void giveChange(int reszta) {
		   int neededAmmount = 0;
	        System.out.println("Dla reszty "+ reszta/100 + "."+reszta%100+" zł");
	        for (Coin coin : coins) {
	        	neededAmmount = reszta / (coin.getValue());
	        	
	        	if(neededAmmount > 0) { 
 		        	if(coin.getQuantity()>= neededAmmount) {
		        		reszta = reszta - coin.getValue()*neededAmmount;
		        		coin.decreaseQuantity(neededAmmount);
		        		System.out.println("Wydaj "+ neededAmmount+ " monet "+ coin.getName());
		        	}
		        	else if (coin.getQuantity()!= 0){
		        		reszta = reszta - coin.getValue()*coin.getQuantity();
		        		System.out.println("Wydaj "+ coin.getQuantity()+ " monet "+ coin.getName());
		        		coin.decreaseQuantity(coin.getQuantity());
		        	}
	        	}
	        }
	        if(reszta != 0) {
       		 System.out.println("nie udało się wydać całej reszty z powodu braku monet \n pozostała ilość "+ reszta/100 + "."+reszta%100+" zł");
	        }
	   }
}
