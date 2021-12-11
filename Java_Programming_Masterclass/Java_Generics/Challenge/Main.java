package Java_Generics.Challenge;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        FootballTeam astonVilla = new FootballTeam("Aston Villa");
        FootballTeam fulham = new FootballTeam("Fulham");
        FootballTeam brentford = new FootballTeam("Brentford");

        RugbyTeam leeds = new RugbyTeam("Leeds");
        RugbyTeam bath = new RugbyTeam("Bath");
        RugbyTeam londonWasps = new RugbyTeam("London Wasps");

        League<FootballTeam> premierLeague = new League<>("Premier League");
        // ADD TEAMS
        System.out.println("Football League Creation:");
        premierLeague.addTeam(astonVilla);
        premierLeague.addTeam(fulham);
        premierLeague.addTeam(brentford);
        //premierLeague.addTeam(leeds); Generic test. Doesn't allow me to add from a different type
        System.out.println(premierLeague.numTeams() + " teams are in the " + premierLeague.getName());

        // MATCHES
        astonVilla.matchResult(fulham, 1, 3); // villa 0
        astonVilla.matchResult(brentford, 0, 2); // villa 0

        fulham.matchResult(brentford, 1, 1); // fulham 4
        fulham.matchResult(astonVilla, 3, 2); // fulam 7

        brentford.matchResult(astonVilla, 1,0); // brentford 7
        brentford.matchResult(fulham, 5,0); // brentford 10

        System.out.println(astonVilla.getName() + " total points: " + astonVilla.ranking());  //Expected: Aston Villa 0
        System.out.println(fulham.getName() + " total points: " + fulham.ranking());  // Fulham 7
        System.out.println(brentford.getName() + " total points: " + brentford.ranking());  // Brentford 10

        premierLeague.showLeagueTable();








        System.out.println();
        System.out.println("Rugby League Creation:");
        League<RugbyTeam> championship = new League<>("Championship");
        championship.addTeam(leeds);
        championship.addTeam(bath);
        championship.addTeam(londonWasps);
        //championship.addTeam(brentford); Generic test. Doesn't allow me to add from a different type
        System.out.println(championship.numTeams() + " teams are in the " + championship.getName());


    }
}
