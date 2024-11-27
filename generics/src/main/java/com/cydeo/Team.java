package com.cydeo;

import java.util.ArrayList;

public class Team<T extends Player> {

    // T is a generic type, it can be any class that extends Player
    private String name;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name; // left side is an object, right side is a parameter
    }

    public String getName() {
        return name;
    }

    public  boolean addPlayer(T player){
        if(members.contains(player)){
//            System.out.println(((Player)player).getName() + " is already on this team"); // casting
            System.out.println(player.getName() + " is already on this team"); // no need casting when T extends Player
            return false;
        }else{
            members.add(player);
            System.out.println((player.getName() + " picked for a team " + this.name)); // sout shortcut for print
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }
}
