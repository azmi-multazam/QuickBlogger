package com.jideguru.quickblogger.Posts.Models;

import java.util.List;

public class RootObject {
    public String nextPageToken;
    public List<Item> items;
    public String kind;
    public String etag;

    public RootObject(String nextPageToken, List<Item> items, String kind, String etag) {
        this.nextPageToken = nextPageToken;
        this.items = items;
        this.kind = kind;
        this.etag = etag;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }
}