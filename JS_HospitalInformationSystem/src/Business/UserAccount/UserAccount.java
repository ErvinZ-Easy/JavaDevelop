package Business.UserAccount;

import Business.People.People;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author EZ
 */
public class UserAccount {
    
    private String username;
    private String password;
    private People people;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public People getPeople() {
        return people;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}