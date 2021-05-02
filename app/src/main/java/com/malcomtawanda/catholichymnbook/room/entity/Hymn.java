package com.malcomtawanda.catholichymnbook.room.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "hymn_table")
public class  Hymn {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "hymn_title")
    private String hymnTitle;

    @ColumnInfo(name = "hymnist")
    private String hymnist;

    @ColumnInfo(name = "hymn_lyrics")
    private String hymnLyrics;

    @ColumnInfo(name = "is_favorite_hymn")
    private Boolean isHymnFavorite;

    @ColumnInfo(name = "hymn_number")
    private int hymnNumber;

    public Hymn(String hymnTitle, String hymnist, String hymnLyrics, Boolean isHymnFavorite, int hymnNumber) {
        this.hymnTitle = hymnTitle;
        this.hymnist = hymnist;
        this.hymnLyrics = hymnLyrics;
        this.isHymnFavorite = isHymnFavorite;
        this.hymnNumber = hymnNumber;
    }

    /*Hymn attributes that may be omitted*/
    @Ignore
    @ColumnInfo(name = "hymn_tag")
    private String hymnTag;

    @Ignore
    @ColumnInfo(name = "hymn_category")
    private String hymnCategory;

    @Ignore
    @ColumnInfo(name = "hymn_publishing_date")
    private String hymnPublishingDate;

    @Ignore
    @ColumnInfo(name = "hymn_publisher")
    private String hymnPublisher;

    @Ignore
    @ColumnInfo(name = "hymn_URL")
    private String hymnURL;

    @Ignore
    @ColumnInfo(name = "hymn_copyright_info")
    private String hymnCopyrightInformation;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHymnTitle() {
        return hymnTitle;
    }

    public void setHymnTitle(String hymnTitle) {
        this.hymnTitle = hymnTitle;
    }

    public String getHymnist() {
        return hymnist;
    }

    public void setHymnist(String hymnist) {
        this.hymnist = hymnist;
    }

    public Boolean getHymnFavorite() {
        return isHymnFavorite;
    }

    public int getHymnNumber() {
        return hymnNumber;
    }

    public String getHymnLyrics() {
        return hymnLyrics;
    }

    public void setHymnLyrics(String hymnLyrics) {
        this.hymnLyrics = hymnLyrics;
    }

    public void setHymnFavorite(Boolean hymnFavorite) {
        isHymnFavorite = hymnFavorite;
    }

    public void setHymnNumber(int hymnNumber) {
        this.hymnNumber = hymnNumber;
    }
}
