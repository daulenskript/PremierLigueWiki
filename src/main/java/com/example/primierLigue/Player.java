package com.example.primierLigue;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name ="player_stats")
@Table(name = "player_stats")
public class Player {
    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "player_sequence"
    )
    @Column(name = "player_name" , unique = true, nullable = false , columnDefinition = "TEXT")
    private String name;
    @Column(name = "nation" , nullable = false , columnDefinition = "TEXT")
    private String nation;
    @Column(name = "position"  , columnDefinition = "TEXT")
    private String position;
    @Column(name = "age" , nullable = false)
    private int age;
    @Column(name = "matches_played" )
    private int matches_played;
    @Column(name = "starts" )
    private int starts;
    //f
    @Column(name = "minutes_played" )
    private Double minutes_played;
    @Column(name = "goals" )
    private Double goals;
    @Column(name = "assist" )
    private Double assist;
    @Column(name = "penalties_scored" )
    private Double penalties_scored;
    @Column(name = "red_cards" )
    private Double red_cards;
    @Column(name = "yellow_cards" )
    private Double yellow_cards;
    @Column(name = "expected_goals" )
    private Double expected_goals;
    @Column(name = "expected_assists" )
    private Double expected_assists;
    @Column(name = "team_name" )
    private String team_name;

    public Player(String team_name, Double expected_assists, Double expected_goals, Double yellow_cards, Double red_cards, Double penalties_scored, Double assist, Double goals, Double minutes_played, int starts, int matches_played, int age, String position, String nation, String name) {
        this.team_name = team_name;
        this.expected_assists = expected_assists;
        this.expected_goals = expected_goals;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.penalties_scored = penalties_scored;
        this.assist = assist;
        this.goals = goals;
        this.minutes_played = minutes_played;
        this.starts = starts;
        this.matches_played = matches_played;
        this.age = age;
        this.position = position;
        this.nation = nation;
        this.name = name;
    }

    public Player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMatches_played() {
        return matches_played;
    }

    public void setMatches_played(int matches_played) {
        this.matches_played = matches_played;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public Double getMinutes_played() {
        return minutes_played;
    }

    public void setMinutes_played(Double minutes_played) {
        this.minutes_played = minutes_played;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssist() {
        return assist;
    }

    public void setAssist(Double assist) {
        this.assist = assist;
    }

    public Double getPenalties_scored() {
        return penalties_scored;
    }

    public void setPenalties_scored(Double penalties_scored) {
        this.penalties_scored = penalties_scored;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(Double red_cards) {
        this.red_cards = red_cards;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(Double yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public Double getExpected_goals() {
        return expected_goals;
    }

    public void setExpected_goals(Double expected_goals) {
        this.expected_goals = expected_goals;
    }

    public Double getExpected_assists() {
        return expected_assists;
    }

    public void setExpected_assists(Double expected_assists) {
        this.expected_assists = expected_assists;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", matches_played=" + matches_played +
                ", starts=" + starts +
                ", minutes_played=" + minutes_played +
                ", goals=" + goals +
                ", assist=" + assist +
                ", penalties_scored=" + penalties_scored +
                ", red_cards=" + red_cards +
                ", yellow_cards=" + yellow_cards +
                ", expected_goals=" + expected_goals +
                ", expected_assists=" + expected_assists +
                ", team_name='" + team_name + '\'' +
                '}';
    }
}
