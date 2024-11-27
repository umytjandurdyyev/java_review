package com.cydeo;

public class TeamTest {

    public static void main(String[] args) {

        FootballPlayer beckham = new FootballPlayer("Beckham");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer lebron = new BaseballPlayer("Lebron");

//        Team liverpool = new Team("Liverpool");

        Team<FootballPlayer> liverpool = new Team<>("Liverpool");

        // technically nothing wrong, but we need a mechanism which accepts only Player
        // when T extends Player
//        Team<String> brokenTeam = new Team<>("this will not work");

        liverpool.addPlayer(beckham);
//        liverpool.addPlayer(pat);
//        liverpool.addPlayer(lebron);

        System.out.println(liverpool.numPlayers());
    }
}
