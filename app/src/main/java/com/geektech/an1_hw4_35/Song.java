package com.geektech.an1_hw4_35;

import java.io.Serializable;

public class Song implements Serializable {
    private String number, name , singer , time;

    public Song(String number, String name, String singer, String time) {
        this.number = number;
        this.name = name;
        this.singer = singer;
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
