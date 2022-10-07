
package szintfelmero;


public class Ember {
    private Integer aktualisPenz;
    private Telefon Samsung;

    public Ember(Integer aktualisPenz, Telefon Samsung) {
        this.aktualisPenz = aktualisPenz;
        this.Samsung = Samsung;
    }

    public Integer getAktualisPenz() {
        return aktualisPenz;
    }

    public void setAktualisPenz(Integer aktualisPenz) {
        this.aktualisPenz = aktualisPenz;
    }
 
}
