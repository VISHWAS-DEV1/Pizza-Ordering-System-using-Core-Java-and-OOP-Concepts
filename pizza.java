
public class pizza {

	private int price;
	private Boolean veg;
	
	private int extracheezeprice = 100;
	private int extratoppingsadded = 150;
	private int backpack = 20;
	

	private int basepizzaprice = 300;
	private boolean isextracheezeadded = false;
	private boolean isextratoppingsadded = false;
	private boolean isoptedtakeaway = false;


	
	
	public pizza(Boolean veg){
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}else {
			this.price = 400;
		}
	}
	
//	public void getprice() {
//		System.out.print(this.price);
//	}
	public void addextracheeze() {
		isextracheezeadded = true;
		this.price += extracheezeprice;
		
	}
    public void addextratoppings() {
    	isextratoppingsadded = true;
		this.price += extratoppingsadded;
	}
    public void takeaway() {
    	isoptedtakeaway = true;
		this.price += backpack;
	}
    public void getbill() {
        String bill = "";
        System.out.println("Pizza: " + basepizzaprice);
        
        if(isextracheezeadded) {
            bill += "Extra cheese added: " + extracheezeprice + "\n";
        }

        if(isextratoppingsadded) {
            bill += "Extra Toppings added: " + extratoppingsadded + "\n";
        }

        if(isoptedtakeaway) {
            bill += "Take away: " + backpack + "\n";
        }

        // 🔴 Missing line - Add this to print the full bill
        System.out.print(bill);

        System.out.print("Total bill: ");
        System.out.print(this.price);
    }

}
