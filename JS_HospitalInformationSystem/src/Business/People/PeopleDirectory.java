package Business.People;

import java.util.ArrayList;

/**
 *
 * @author EZ
 */
public class PeopleDirectory {
    
    private ArrayList<People> peopleList;

    public PeopleDirectory() {
        peopleList = new ArrayList();
    }

    public ArrayList<People> getPeopleList() {
        return peopleList;
    }
    
    public People createPeople(String name){
        People people = new People();
        people.setName(name);
        peopleList.add(people);
        return people;
    }
    public void deletePeople(People p){
        peopleList.remove(p);
    }
}