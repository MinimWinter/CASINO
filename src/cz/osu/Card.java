package cz.osu;

public class Card {
    private final String color;
    private final String rank;
    private final String shape;

    public Card(String color, String rank, String shape)    //parametrický konstruktor
    {
        this.color = color;
        this.rank = rank;
        this.shape = shape;
    }

    //metody
    public String getColor()
    {
        return color;
    }

    public String getRank()
    {
        return rank;
    }

    public String getShape()
    {
        return shape;
    }

    public String getInfo()
    {
        return "Color: " + color + "; Rank: " + rank + "; Shape:" + shape;
    }

}
