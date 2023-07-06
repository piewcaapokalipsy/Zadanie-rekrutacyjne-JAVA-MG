package javaZadanieRekrutacyjne;
//klasa coins reprezentuje typ monet trzymanych w kasie służy jako "Data class"
public class Coin {
	 private String name;
	    private int value;//upewnić się że nie jest równa 0
	    private int quantity;
	    
		public Coin(String name, int value, int quantity) {
	        this.name = name;
	        this.value = value;
	        this.quantity = quantity;
	    }


		public String getName() {
	        return name;
	    }

	    public int getValue() {
	        return value;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void decreaseQuantity(int amount) {
	        quantity -= amount;
	    }

}
