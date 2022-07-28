import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValididEmail {
public static void main(String[] args) {
	
	ArrayList <String>emails=new ArrayList<>();
	emails.add("niyibi@gmail.com");
	emails.add("bitamagmail.com");
	String regex ="^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	
	for(String email:emails) {
		Matcher matcher = pattern.matcher(email);
		System.out.println(email + ";" + matcher.matches());
	}
	
	
}
}
