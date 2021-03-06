import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.Format;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        // return "place holder for guest greeting return string";
        // "Hello, Beth Kane. Lovely to see you."

        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("H"); // this will format the date as a string value of 0-23
        String theHourString = formatter.format(date); //store the formatted date in a String variable
        int theHour = Integer.parseInt(theHourString); // convert the String to an int so that the value can be compared in an if conditional below
        if (theHour < 12) {
            return "Good Morning!";
        }
        if (theHour < 17) {
            return "Good Afternoon!";
        }
        return "Good Evening!";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        // "It is currently Wed Aug 11 16:34:59 PDT 2022."
        // return "place holder for date announcement return string";
        Date date = new Date();
        return String.format("It is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        // return "for snarky response return string";
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        }
        else return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

