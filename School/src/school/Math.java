package school;

/*Math is one of the 4 subject of our project. It extends the Subject superclass.
 * This class written by the singleton method, so it can be instantiated only once.  
 * 
 */

public class Math extends Subject {

    static Math mathematics = null;

    private Math() {
        this.name = "Mathematics";
    }

    public static Math builder() {
        if (mathematics == null) {
            return mathematics = new Math();
        }

        return mathematics;
    }
}
