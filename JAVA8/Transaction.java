
public class Transaction {
	private  Trader trader;
	private  int year;
	private  int value;
	
	public Transaction() {}

	public Transaction(Trader trader, int year, int value) {
		
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append("[ Trader");
		builder.append(trader);
		builder.append(" , year");
		builder.append(year);
		builder.append(" ,value");
		builder.append(value);
		return builder.toString();
	}
	
}
