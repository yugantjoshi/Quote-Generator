package com.example.yugantjoshi.quotegenerator.User;

/**
 * Created by yugantjoshi on 3/8/16.
 */

        import javax.annotation.Generated;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class User {

    @SerializedName("quoteText")
    @Expose
    private String quoteText;
    @SerializedName("quoteAuthor")
    @Expose
    private String quoteAuthor;
    @SerializedName("senderName")
    @Expose
    private String senderName;
    @SerializedName("senderLink")
    @Expose
    private String senderLink;
    @SerializedName("quoteLink")
    @Expose
    private String quoteLink;

    /**
     *
     * @return
     * The quoteText
     */
    public String getQuoteText() {
        return quoteText;
    }

    /**
     *
     * @param quoteText
     * The quoteText
     */
    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    /**
     *
     * @return
     * The quoteAuthor
     */
    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    /**
     *
     * @param quoteAuthor
     * The quoteAuthor
     */
    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    /**
     *
     * @return
     * The senderName
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     *
     * @param senderName
     * The senderName
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     *
     * @return
     * The senderLink
     */
    public String getSenderLink() {
        return senderLink;
    }

    /**
     *
     * @param senderLink
     * The senderLink
     */
    public void setSenderLink(String senderLink) {
        this.senderLink = senderLink;
    }

    /**
     *
     * @return
     * The quoteLink
     */
    public String getQuoteLink() {
        return quoteLink;
    }

    /**
     *
     * @param quoteLink
     * The quoteLink
     */
    public void setQuoteLink(String quoteLink) {
        this.quoteLink = quoteLink;
    }

}