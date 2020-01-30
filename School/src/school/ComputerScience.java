package school;

/*Computer science is one of the 4 subject of our project. It extends the Subject superclass.
 * This class written by the singleton method, so it can be instantiated only once.  
 * 
 */

public class ComputerScience extends Subject {

    static ComputerScience computerScience = null;

    private ComputerScience() {
        this.name = "ComputerScience";
    }

    public static ComputerScience builder() {
        if (computerScience == null) {
            return computerScience = new ComputerScience();
        }

        return computerScience;
    }
}
