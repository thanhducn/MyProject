package com.ducnt7.bean;

/**
 * Created by DucNT7 on 3/3/2017.
 */

public class Item {
    private String sId;
    private String sTitle;
    private String sText;
    private String sCcopy;
    private String sIUrl;
    private String sUrl;
    private String sMakern;
    private String sMaker;
    private String sDstat;
    private int iRank;
    private int iRes;
    private long fScore;
    private long lPrice;
    private long lSdprice59998;
    private int iStflg;
    private String sPrice;

    public int getiRank() {
        return iRank;
    }

    public void setiRank(int iRank) {
        this.iRank = iRank;
    }

    public String getsPrice() {
        return sPrice;
    }

    public void setsPrice(String sPrice) {
        this.sPrice = sPrice;
    }

    public String getsIUrl() {
        return sIUrl;
    }

    public void setsIUrl(String sIUrl) {
        this.sIUrl = sIUrl;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public String getsText() {
        return sText;
    }

    public void setsText(String sText) {
        this.sText = sText;
    }

    public String getsCcopy() {
        return sCcopy;
    }

    public void setsCcopy(String sCcopy) {
        this.sCcopy = sCcopy;
    }

    public String getsUrl() {
        return sUrl;
    }

    public void setsUrl(String sUrl) {
        this.sUrl = sUrl;
    }

    public String getsMakern() {
        return sMakern;
    }

    public void setsMakern(String sMakern) {
        this.sMakern = sMakern;
    }

    public String getsMaker() {
        return sMaker;
    }

    public void setsMaker(String sMaker) {
        this.sMaker = sMaker;
    }

    public String getsDstat() {
        return sDstat;
    }

    public void setsDstat(String sDstat) {
        this.sDstat = sDstat;
    }

    public long getlPrice() {
        return lPrice;
    }

    public void setlPrice(long lPrice) {
        this.lPrice = lPrice;
    }

    public int getiRes() {
        return iRes;
    }

    public void setiRes(int iRes) {
        this.iRes = iRes;
    }

    public float getlScore() {
        return fScore;
    }

    public void setlScore(long fScore) {
        this.fScore = fScore;
    }

    public long getlSdprice59998() {
        return lSdprice59998;
    }

    public void setlSdprice59998(long lSdprice59998) {
        this.lSdprice59998 = lSdprice59998;
    }

    /**
     * @return the iStflg
     */
    public int getiStflg() {
        return iStflg;
    }

    /**
     * @param iStflg the iStflg to set
     */
    public void setiStflg(int iStflg) {
        this.iStflg = iStflg;
    }
}
