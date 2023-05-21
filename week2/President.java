public class President {
    private String name;
    private int age;
    private String party;

    public President(String name, int age, String party) {
        this.name = name;
        this.age = age;
        this.party = party;
    }

    public President() {
        this.name = "";
        this.age = 0;
        this.party = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String bio() {
        return "Name: " + name + "\nAge: " + age + "\nParty: " + party;
    }

    public String ageStatus() {
        return (age < 55 ? "Young" : "Old");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof President)) {
            return false;
        }
        President other = (President) obj;
        return name.equals(other.getName()) && age == other.getAge() && party.equals(other.getParty());
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Party: " + party;
    }
}