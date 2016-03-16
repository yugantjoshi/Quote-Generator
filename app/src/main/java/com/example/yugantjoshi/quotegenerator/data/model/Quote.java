package com.example.yugantjoshi.quotegenerator.data.model;

import com.google.gson.annotations.SerializedName;

public class Quote {

    @SerializedName("quoteText")
    public String quoteText;

    @SerializedName("quoteAuthor")
    public String quoteAuthor;

    @SerializedName("senderName")
    public String senderName;

    @SerializedName("senderLink")
    public String senderLink;

    @SerializedName("quoteLink")
    public String quoteLink;

    @Override
    public String toString() {
        return "Quote{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                ", senderName='" + senderName + '\'' +
                ", senderLink='" + senderLink + '\'' +
                ", quoteLink='" + quoteLink + '\'' +
                '}';
    }

}