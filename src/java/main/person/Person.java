package person;



import java.util.Random; 
import java.util.Calendar; 



public class Person {

    private String fullName; 
    
    private Random rand = new Random();
    private Calendar calendar = Calendar.getInstance();

    // Government ID is always initialized  
    private  String GOVID; 

    public Person(String fullName) {
        /** 
         * We process the GOVID in here
         */
        this.fullName = fullName;
        this.GOVID = processGOVID();
    }

    private String processGOVID() {
        /**
         * This is the format 
         * FullName + " " + number assigned + " " + present date
         */
        
        int numberToAssign = rand.nextInt(1000);
        String localDateNow = calendar.getTime().toString(); 
        String convNumberToAssign = String.valueOf(numberToAssign);
        
        String processedID = getFullName() + " " + convNumberToAssign + " " + localDateNow; 

        return processedID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName; 
    }

    public String getFullName() {
        return this.fullName; 
    }

    public String getGOVID() {
        return this.GOVID; 
    }
    
}
