package staticMethodRef;

import java.util.function.Function;
import model.Details;

public class SMExample {

 public static void main(String[] args) {
 
 //Function<String,String> ref= Details::getDisplayOrder;
	 
 Function<String,String> ref= displayOrder ->Details.getDisplayOrder(displayOrder);
 System.out.println(ref.apply("Hello"));

	}
}
