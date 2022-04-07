public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        
        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);

        //Ninja Bonus version

        // Description: Use method overloading to write another guestGreeting method that returns a greeting including the person's name as well as the day period. Note: It must have the same method name, but will have a different method signature.
        // Inputs: String name, String dayPeriod  ("morning", "afternoon" or "evening")
        // Return Type: String
        // Example Output: "Good evening, Beth Kane. Lovely to see you."

        String ninjaTestGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        System.out.println(ninjaTestGuestGreeting);

        // SENSEI VERSION: Instead of a string for the day period, write the overloaded method with no parameters, and use a Date object to determine the day period.
        // Hint: Use your google-kung-fu! You can use the  SimpleDateFormat class and the Format class to help. Both are part of the java.text library. To the bat-documentation!

        String senseiTestGuestGreeting = alfredBot.guestGreeting();
        System.out.println(senseiTestGuestGreeting);
    }
}
