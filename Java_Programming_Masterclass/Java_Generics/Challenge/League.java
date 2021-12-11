package Java_Generics.Challenge;

import java.util.ArrayList;

public class League<T extends Team> implements Comparable<League<T>> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int drew = 0;

    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in this league");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to " + this.name);
            return true;
        }
    }

    public int numTeams() {
        return this.teams.size();
    }

    public void matchResult(League<T> opponent, int homeScore, int awayScore) {
        String message;

        if (homeScore > awayScore) {
            won++;
            message = " beat ";
        } else if (homeScore == awayScore) {
            drew++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, awayScore, homeScore);
        }
    }

    public int ranking() {
        return (won * 3) + drew;
    }

    @Override
    public int compareTo(League<T> league) {
        if (this.ranking() > league.ranking()) {
            return -1;
        }
        else {
            if (this.ranking() < league.ranking()) {
                return 1;
            }
        }
        return 0;
    }
}
