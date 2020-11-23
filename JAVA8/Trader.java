
public class Trader {

	private  String name ;
	private  String city;
	
	public Trader() {
	}
	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append("[ Name");
		builder.append(name);
		builder.append(" , City");
		builder.append(city);
		return builder.toString();

}
}
