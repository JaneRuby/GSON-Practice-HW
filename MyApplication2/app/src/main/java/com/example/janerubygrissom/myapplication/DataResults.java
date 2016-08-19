package com.example.janerubygrissom.myapplication;

/**
 * Created by janerubygrissom on 8/15/16.
 */
public class DataResults {
    String name;
    Comics comics;
    Stories stories;
    Thumbnail thumbnail;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Comics getComics() {
        return comics;
    }

    public void setComics(Comics comics) {
        this.comics = comics;
    }

    public Stories getStories() {
        return stories;
    }

    public void setStories(Stories stories) {
        this.stories = stories;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }
}
