package com.example.nimish.sparkles;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by nimish on 11/02/18.
 */

public class Message {
    private String content,username,date;

    public Message(){

    }
    public Message(String content,String username,String date){
        this.content=content;
        this.username=username;
        this.date=date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        //date= DateFormat.getDateTimeInstance().format(new Date());
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
