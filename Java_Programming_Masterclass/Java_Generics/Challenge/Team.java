package Java_Generics.Challenge;

public abstract class Team<T> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int drew = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void matchResult(Team<T> opponent, int homeScore, int awayScore) {
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
    public int compareTo(Team<T> team) {
        if (ranking() > team.ranking()) {
            return -1;
        }
        else {
            if (this.ranking() < team.ranking()) {
                return 1;
            }
        }
        return 0;
    }

}
