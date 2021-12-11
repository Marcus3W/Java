package Java_Generics.Challenge;

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
