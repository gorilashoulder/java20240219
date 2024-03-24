package sec01.solo.hello;


public class Player {
    String name;
    int back_number;
    int weight;
    int height;
    int annual_income;
    Team team;

    public Player(String name, int back_number, int weight, int height, int annual_income, Team team) {
        this.name = name;
        this.back_number = back_number;
        this.weight = weight;
        this.height = height;
        this.annual_income = annual_income;
        this.team = team;
    }

    public Player(Team team) {
        this.team = team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBack_number(int back_number) {
        this.back_number = back_number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAnnual_income(int annual_income) {
        this.annual_income = annual_income;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getTeamName() {
        return this.team.getName();
    }



    public boolean isBarsh() {
        if (this.getTeamName().equals("바르셀로나")) return true;

        return false;
    }

    public boolean isManU() {
        if (this.getTeamName().equals("맨유")) return true;

        return false;
    }

    public boolean isRealMadrid() {
        if (this.getTeamName().equals("레알마드리드")) return true;

        return false;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", back_number=" + back_number +
                ", weight=" + weight +
                ", height=" + height +
                ", annual_income=" + annual_income +
                ", team=" + team +
                '}';
    }
}





