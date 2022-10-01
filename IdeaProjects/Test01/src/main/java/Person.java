

public class Person {

    public String fullName(String firstName, String lastName) {

        String name = firstName + " " + lastName;
        return name;
    }


    //A more simple way to create method test
    public String ConvertToUpper(String fname, String lname) {

        String name = fullName(fname, lname);
        return name.toUpperCase();
    }
}
