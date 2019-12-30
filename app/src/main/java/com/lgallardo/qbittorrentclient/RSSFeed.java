/*
 *   Copyright (c) 2014-2015 Luis M. Gallardo D.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the GNU Lesser General Public License v3.0
 *   which accompanies this distribution, and is available at
 *   http://www.gnu.org/licenses/lgpl.html
 *
 */

package com.lgallardo.qbittorrentclient;

import java.util.ArrayList;

public class RSSFeed {

    public String channelTitle;
    public String channelLink;
    public String channelFilter;
    public String channelPubDate;
    public ArrayList<RSSFeedItem> items;
    public boolean autodDownload;
    public boolean notifyNew;
    public int itemCount;
    public boolean resultOk;

    public RSSFeed() {

    }

    public RSSFeed(String title, String link, boolean autodDownload, boolean notifyNew) {
        this.channelTitle = title;
        this.channelLink = link;
        this.autodDownload = autodDownload;
        this.notifyNew = notifyNew;
    }

    public RSSFeed(String title, String link) {
        this(title, link, true, false);
    }


    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public String getChannelLink() {
        return channelLink;
    }

    public void setChannelLink(String channelLink) {
        this.channelLink = channelLink;
    }

    public String getChannelFilter() {

        return (channelFilter == null)?"":channelFilter;
    }

    public void setChannelFilter(String channelFilter) {
        this.channelFilter = channelFilter;
    }

    public ArrayList<RSSFeedItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<RSSFeedItem> items) {
        this.items = items;
    }

    public String getChannelPubDate() {
        return channelPubDate;
    }

    public void setChannelPubDate(String channelPubDate) {
        this.channelPubDate = channelPubDate;
    }

    public boolean getAutodDownload() {
        return autodDownload;
    }

    public void setAutodDownload(boolean autodDownload) {
        this.autodDownload = autodDownload;
    }

    public boolean getNotifyNew() {
        return notifyNew;
    }

    public void setNotifyNew(boolean notifyNew) {
        this.notifyNew = notifyNew;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public boolean isResultOk() {
        return resultOk;
    }

    public void setResultOk(boolean resultOk) {
        this.resultOk = resultOk;
    }
}