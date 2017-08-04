package kr.co.tjeit.practice.test1.datas;

import java.util.Calendar;

/**
 * Created by the on 2017-08-04.
 */

public class NewsData {

    private String newsName;
    private Calendar newsDate;
    private String newsText;
    private int newsImage;

    public NewsData(String newsName) {
        this.newsName = newsName;
    }

    public NewsData(String newsName, Calendar newsDate, String newsText, int newsImage) {
        this.newsName = newsName;
        this.newsDate = newsDate;
        this.newsText = newsText;
        this.newsImage = newsImage;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public Calendar getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Calendar newsDate) {
        this.newsDate = newsDate;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public int getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(int newsImage) {
        this.newsImage = newsImage;
    }
}
