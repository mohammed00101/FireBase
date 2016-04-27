package mno.mohamed_youssef.firebase;

/**
 * Created by Mohamed Yossif on 27/04/2016.
 */
public class DinosaurFacts {



    long height;
    double length;
    long weight;

    public DinosaurFacts() {
        // empty default constructor, necessary for Firebase to be able to deserialize blog posts
    }

    public long getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public long getWeight() {
        return weight;
    }
}