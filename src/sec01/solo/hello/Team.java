package sec01.solo.hello;

public class Team {
    String name;
    String country;
    String hometown;

    public Team(String name, String country, String hometown) {
        this.name = name;
        this.country = country;
        this.hometown = hometown;
    }

    public Team() {

    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }



}





