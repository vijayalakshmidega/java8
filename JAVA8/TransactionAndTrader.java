import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class TransactionAndTrader {

	public static void main(String[] args) {
		List<Transaction> trans=allTransactions();
		System.out.println("1.All Transactions From 2011");
		List<Transaction> allTransactionsByYear2011=trans.stream().filter(d->d.getYear()==2011)
				.sorted((o1,o2)->Integer.compare(o1.getValue(),o2.getValue())).
				collect(Collectors.toList());
		
		allTransactionsByYear2011.stream().forEach(n->System.out.println(n));	
		System.out.println("2.Unique cities");
		List<Trader> TraderWork=trans.stream()
			   .map(d->d.getTrader()).distinct()
			   .collect(Collectors.toList());
		List<String> CityNames=TraderWork.stream()
				.map(d->d.getCity()).distinct()
				.collect(Collectors.toList());
		System.out.println(CityNames);
		System.out.println("3.All Trdaers from Delhi and sort by name");
		List<Trader> allTradersFromDelhi=TraderWork.stream()
				   .filter(d->d.getCity().equals("Delhi"))
				   .sorted((o1,o2)-> o1.getName().compareTo(o2.getName()))
				   .collect(Collectors.toList());
		
      allTradersFromDelhi.stream().forEach(n->System.out.println(n));
      
      System.out.println("string of all traders names sorted alphabetically.");
      List<Trader> allTraderNames=TraderWork.stream()
    		  .sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
    		 .collect(Collectors.toList());
      allTraderNames.stream().forEach(n->System.out.println(n));
      
      System.out.println("Are any traders based in Jaipur?");
      boolean TraderNamesInJaipur=TraderWork.stream()
    		  .anyMatch(d->d.getCity().equals("Jaipur"));
    	if(TraderNamesInJaipur)	  
            System.out.println("Found");
    	else
             System.out.println("Not Found");
      
      System.out.println("all transactions values from the traders living in delhi");
      List<Integer> allTransactionValuesFromDelhi=trans.stream()
    		  .filter(d->d.getTrader().getCity().equals("Delhi"))
    		  .map(v->v.getValue())
              .collect(Collectors.toList());
      allTransactionValuesFromDelhi.stream().forEach(n->System.out.println(n));
      
      System.out.println("highest value of all the transactions?");
      
      OptionalInt highestValue=trans.stream()
    		  .mapToInt(d->d.getValue())
    		   .max();
    	System.out.println(highestValue);
    	
    	System.out.println("transaction with the smallest value");
    	OptionalInt smallestValue=trans.stream()
      		  .mapToInt(d->d.getValue())
      		   .min();
      	System.out.println(smallestValue);
      	
	}

	private static List<Transaction> allTransactions() {
		Trader ram= new Trader("ram", "delhi");
		Trader kapil= new Trader("kapil","noida");
		Trader raj= new Trader("raj","banglore");
		Trader ekta= new Trader("ekta","banglore");
		List<Transaction> transactions = Arrays.asList(
				new Transaction(ram, 2011, 300),
				new Transaction(ram, 2012, 1000),
				new Transaction(kapil, 2011, 400),
				new Transaction(raj, 2012, 710),
				new Transaction(ekta, 2012, 700),
				new Transaction(ekta, 2012, 950));
		return transactions;
	}

}
