package gr.aueb.cf.cf9.ch15.schoolapp;

/**
 * Teacher Java Bean.
 */
public class Teacher {
    private long id;
    private String firstname;
    private String lastname;

    public Teacher(){

    }

    public Teacher(String firstname, long id, String lastname) {
        this.firstname = firstname;
        this.id = id;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstname='" + firstname + '\'' +
                ", id=" + id +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
