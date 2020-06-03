package com.example.testrecyclerview.Model;


import java.util.Date;

public class Article {

    private String mTitle;
    private String mOrigins;
    private String mContent;
    private String mAuthor;
    private Date mDate;
    private int mCovertPic;




    public Article (String title, String origins, String content, String author, Date date, int covertPic){
        mTitle = title;
        mOrigins = origins;
        mContent = content;
        mAuthor = author;
        mDate = date;
        mCovertPic = covertPic;

//        this.setTitle(title);
//        this.setOrigins(origins);
//        this.setContent(content);
//        this.setAuthor(author);
//        this.setDate(date);
//        this.setCovertPic(covertPic);
    }


//    public void setTitle(String title) {
//        mTitle = title;
//    }
//
//    public void setOrigins(String origins) {
//        mOrigins = origins;
//    }
//
//    public void setContent(String content) {
//        mContent = content;
//    }
//
//    public void setAuthor(String author) {
//        mAuthor = author;
//    }
//
//    public void setDate(Date date) {
//        mDate = date;
//    }
//
//    public void setCovertPic(String covertPic) {
//        mCovertPic = covertPic;
//    }

    public String getTitle(){
        return mTitle;
    }

    public String getOrigins() {
        return mOrigins;
    }

    public String getContent() {
        return mContent;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public Date getDate() {
        return mDate;
    }

    public int getCovertPic() {
        return mCovertPic;
    }


    }
