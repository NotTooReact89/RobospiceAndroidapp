package com.putti.robospiceandroidapp;

/**
 * Created by sharandhanala on 19/04/16.
 */
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.api.client.util.Key;

public class Event {

    /*@Key
    private Integer NewsID;*/
    @Key
    private String Title;
    @Key
    private String Synopsis;
    @Key
    private String Description;
    @Key
    private String ordering;
    @Key
    private String startDate;
    @Key
    private String eventDateTime;
    @Key
    private String OriginalImageURL;
    @Key
    private String thumbnailImageURL;
    @Key
    private String ImageDate;
    @Key
    private String ShareURL;
    @Key
    private String MediaURL;
    @Key
    private String UpdatedDate;

    /**
     * No args constructor for use in serialization
     */
    public Event() {
    }

    /**
     * @param startDate
     * @param Description
     * @param eventDateTime
     * @param ImageDate
     * @param thumbnailImageURL
     * @param ShareURL
     * @param NewsID
     * @param Title
     * @param UpdatedDate
     * @param OriginalImageURL
     * @param ordering
     * @param Synopsis
     * @param MediaURL
     */
    public Event(Integer NewsID, String Title, String Synopsis, String Description, String ordering, String startDate, String eventDateTime, String OriginalImageURL, String thumbnailImageURL, String ImageDate, String ShareURL, String MediaURL, String UpdatedDate) {
        //this.NewsID = NewsID;
        this.Title = Title;
        this.Synopsis = Synopsis;
        this.Description = Description;
        this.ordering = ordering;
        this.startDate = startDate;
        this.eventDateTime = eventDateTime;
        this.OriginalImageURL = OriginalImageURL;
        this.thumbnailImageURL = thumbnailImageURL;
        this.ImageDate = ImageDate;
        this.ShareURL = ShareURL;
        this.MediaURL = MediaURL;
        this.UpdatedDate = UpdatedDate;
    }

    /**
     * @return The NewsID
     */
    //@JsonProperty("NewsID")
    /*public Integer getNewsID() {
        return NewsID;
    }*/

    /**
     * @param NewsID The NewsID
     */ 
    //@JsonProperty("NewsID")
    /*public void setNewsID(Integer NewsID) {
        this.NewsID = NewsID;
    }

    public Event withNewsID(Integer NewsID) {
        this.NewsID = NewsID;
        return this;
    }*/

    /**
     * @return The Title
     */
    //@JsonProperty("Title")
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title The Title
     */
    //@JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Event withTitle(String Title) {
        this.Title = Title;
        return this;
    }

    /**
     * @return The Synopsis
     */
    //@JsonProperty("Synopsis")
    public String getSynopsis() {
        return Synopsis;
    }

    /**
     * @param Synopsis The Synopsis
     */
    //@JsonProperty("Synopsis")
    public void setSynopsis(String Synopsis) {
        this.Synopsis = Synopsis;
    }

    public Event withSynopsis(String Synopsis) {
        this.Synopsis = Synopsis;
        return this;
    }

    /**
     * @return The Description
     */
    //@JsonProperty("Description")
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description The Description
     */
    //@JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Event withDescription(String Description) {
        this.Description = Description;
        return this;
    }

    /**
     * @return The ordering
     */
   // @JsonProperty("ordering")
    public String getOrdering() {
        return ordering;
    }

    /**
     * @param ordering The ordering
     */
    //@JsonProperty("ordering")
    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    public Event withOrdering(String ordering) {
        this.ordering = ordering;
        return this;
    }

    /**
     * @return The startDate
     */
   // @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate The startDate
     */
    //@JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Event withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * @return The eventDateTime
     */
   // @JsonProperty("eventDateTime")
    public String getEventDateTime() {
        return eventDateTime;
    }

    /**
     * @param eventDateTime The eventDateTime
     */
   // @JsonProperty("eventDateTime")
    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public Event withEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
        return this;
    }

    /**
     * @return The OriginalImageURL
     */
   // @JsonProperty("OriginalImageURL")
    public String getOriginalImageURL() {
        return OriginalImageURL;
    }

    /**
     * @param OriginalImageURL The OriginalImageURL
     */
   // @JsonProperty("OriginalImageURL")
    public void setOriginalImageURL(String OriginalImageURL) {
        this.OriginalImageURL = OriginalImageURL;
    }

    public Event withOriginalImageURL(String OriginalImageURL) {
        this.OriginalImageURL = OriginalImageURL;
        return this;
    }

    /**
     * @return The thumbnailImageURL
     */
   // @JsonProperty("thumbnailImageURL")
    public String getThumbnailImageURL() {
        return thumbnailImageURL;
    }

    /**
     * @param thumbnailImageURL The thumbnailImageURL
     */
    //@JsonProperty("thumbnailImageURL")
    public void setThumbnailImageURL(String thumbnailImageURL) {
        this.thumbnailImageURL = thumbnailImageURL;
    }

    public Event withThumbnailImageURL(String thumbnailImageURL) {
        this.thumbnailImageURL = thumbnailImageURL;
        return this;
    }

    /**
     * @return The ImageDate
     */
   // @JsonProperty("ImageDate")
    public String getImageDate() {
        return ImageDate;
    }

    /**
     * @param ImageDate The ImageDate
     */
   // @JsonProperty("ImageDate")
    public void setImageDate(String ImageDate) {
        this.ImageDate = ImageDate;
    }

    public Event withImageDate(String ImageDate) {
        this.ImageDate = ImageDate;
        return this;
    }

    /**
     * @return The ShareURL
     */
   // @JsonProperty("ShareURL")
    public String getShareURL() {
        return ShareURL;
    }

    /**
     * @param ShareURL The ShareURL
     */
  //  @JsonProperty("ShareURL")
    public void setShareURL(String ShareURL) {
        this.ShareURL = ShareURL;
    }

    public Event withShareURL(String ShareURL) {
        this.ShareURL = ShareURL;
        return this;
    }

    /**
     * @return The MediaURL
     */
   // @JsonProperty("MediaURL")
    public String getMediaURL() {
        return MediaURL;
    }

    /**
     * @param MediaURL The MediaURL
     */
  //  @JsonProperty("MediaURL")
    public void setMediaURL(String MediaURL) {
        this.MediaURL = MediaURL;
    }

    public Event withMediaURL(String MediaURL) {
        this.MediaURL = MediaURL;
        return this;
    }

    /**
     * @return The UpdatedDate
     */
  //  @JsonProperty("UpdatedDate")
    public String getUpdatedDate() {
        return UpdatedDate;
    }

    /**
     * @param UpdatedDate The UpdatedDate
     */
  //  @JsonProperty("UpdatedDate")
    public void setUpdatedDate(String UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
    }

    public Event withUpdatedDate(String UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


    @Override
    public int hashCode() {
        return new HashCodeBuilder()./*append(NewsID).*/append(Title).append(Synopsis).append(Description).append(ordering).append(startDate).append(eventDateTime).append(OriginalImageURL).append(thumbnailImageURL).append(ImageDate).append(ShareURL).append(MediaURL).append(UpdatedDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return new EqualsBuilder()./*append(NewsID, rhs.NewsID).*/append(Title, rhs.Title).append(Synopsis, rhs.Synopsis).append(Description, rhs.Description).append(ordering, rhs.ordering).append(startDate, rhs.startDate).append(eventDateTime, rhs.eventDateTime).append(OriginalImageURL, rhs.OriginalImageURL).append(thumbnailImageURL, rhs.thumbnailImageURL).append(ImageDate, rhs.ImageDate).append(ShareURL, rhs.ShareURL).append(MediaURL, rhs.MediaURL).append(UpdatedDate, rhs.UpdatedDate).isEquals();
    }

}

