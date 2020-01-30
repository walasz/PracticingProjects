package school;


/*History is one of the 4 subject of our project. It extends the Subject superclass.
 * This class written by the singleton method, so it can be instantiated only once.  
 * 
 */
public class History extends Subject {

    static History history = null;

    private History() {
        this.name = "History";
    }

    public static History builder() {
        if (history == null) {
            return history = new History();
        }

        return history;
    }

}
