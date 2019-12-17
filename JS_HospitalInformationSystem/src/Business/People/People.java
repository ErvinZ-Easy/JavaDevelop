package Business.People;

/**
 *
 * @author EZ
 */
public class People {
    
    private String name;
    private int id;
    private static int count = 1;

    public People() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
