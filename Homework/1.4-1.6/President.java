// Creates President class
public class President {
    // Name of the President (attribute #1)
    private String name;
    // Age of the President (attribute #2)
    private int age;
    // Name of the political party (attribute #3)
    private String party;

    // Three-parameter constructor for the President class
    public President(String name, int age, String party) {
        this.name = name;
        this.age = age;
        this.party = party;
    }

    // Getter and setter methods for the President's name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for the President's age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for the President's political party
    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    // Additional method that returns a short bio of the President using their name,
    // age, and political party
    public String bio() {
        return "Name: " + name + "\nAge: " + age + "\nParty: " + party;
    }

    // Additional method that returns whether the President is young old based on
    // the average age for Presidents in the US (55 years old)
    public String ageStatus() {
        return (age < 55 ? "Young" : "Old");
    }
}