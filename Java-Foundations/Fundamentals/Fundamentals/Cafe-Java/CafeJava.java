public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.0;
        double lattePrice = 4.5;
        double cappuccinoPrice = 5.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // Cindhuri
        if(isReadyOrder1){
            System.out.println(readyMessage);
        } else {
            System.out.println(pendingMessage);
        }
    	// ** Your customer interaction print statements will go here ** //
        
        // Noah
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + mochaPrice);
        } else {
            System.out.println(pendingMessage);
        }

        // Sam
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage + displayTotalMessage + (lattePrice + lattePrice));
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy
        System.out.println(displayTotalMessage + (dripCoffeePrice - lattePrice));
    }
}
