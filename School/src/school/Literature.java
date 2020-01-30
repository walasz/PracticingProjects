package school;

/*Literature is one of the 4 subject of our project. It extends the Subject superclass.
 * This class written by the singleton method, so it can be instantiated only once.  
 * 
 */

public class Literature extends Subject {

    static Literature literature = null;

    private Literature() {
        this.name = "Literature";
    }

    public static Literature builder() {
        if (literature == null) {
            return literature = new Literature();
        }

        return literature;
    }

}
