package com.ducnt7.bean;

import java.util.List;
import java.util.Map;

public class SearchResult {

    private SearchParam oParam;
    private String sQuery;
    private String sOptMaker;
    private String sOptPriceFilter;
    private int iLimit;
    private int iTotal;
    private int iItemPageCount;
    private int iCachePageNum;
    private List<Item> lstItem;
    private List<Item> lstSuggestItem;
    private List<String> lstRelationWord;
    private List<String> lstPopularWord;
    private List<String> lstSuggestion;
    private Map<String, String> mMaker;
    private Map<String, String> mCgt1;
    private Map<String, String> mCgt2;
    private Map<String, String> mCgt3;
    private Map<Integer, String> mCgtName;
    private int iStatus;

    public int getiLimit() {
        return iLimit;
    }

    public void setiLimit(int iLimit) {
        this.iLimit = iLimit;
    }

    public SearchParam getoParam() {
        return oParam;
    }

    public void setoParam(SearchParam oParam) {
        this.oParam = oParam;
    }

    public int getiItemPageCount() {
        return iItemPageCount;
    }

    public void setiItemPageCount(int iItemPageCount) {
        this.iItemPageCount = iItemPageCount;
    }

    public int getiCachePageNum() {
        return iCachePageNum;
    }

    public void setiCachePageNum(int iCachePageNum) {
        this.iCachePageNum = iCachePageNum;
    }

    public List<String> getLstSuggestion() {
        return lstSuggestion;
    }

    public void setLstSuggestion(List<String> lstSuggestion) {
        this.lstSuggestion = lstSuggestion;
    }

    public List<Item> getLstSuggestItem() {
        return lstSuggestItem;
    }

    public void setLstSuggestItem(List<Item> lstSuggestItem) {
        this.lstSuggestItem = lstSuggestItem;
    }

    public Map<String, String> getmCgt2() {
        return mCgt2;
    }

    public void setmCgt2(Map<String, String> mCgt2) {
        this.mCgt2 = mCgt2;
    }

    public Map<String, String> getmCgt3() {
        return mCgt3;
    }

    public void setmCgt3(Map<String, String> mCgt3) {
        this.mCgt3 = mCgt3;
    }

    public int getiStatus() {
        return iStatus;
    }

    public void setiStatus(int iStatus) {
        this.iStatus = iStatus;
    }

    public Map<Integer, String> getmCgtName() {
        return mCgtName;
    }

    public void setmCgtName(Map<Integer, String> mCgtName) {
        this.mCgtName = mCgtName;
    }

    public String getsQuery() {
        return sQuery;
    }

    public void setsQuery(String sQuery) {
        this.sQuery = sQuery;
    }

    public int getiTotal() {
        return iTotal;
    }

    public void setiTotal(int iTotal) {
        this.iTotal = iTotal;
    }

    public String getsOptMaker() {
        return sOptMaker;
    }

    public void setsOptMaker(String sOptMaker) {
        this.sOptMaker = sOptMaker;
    }

    public String getsOptPriceFilter() {
        return sOptPriceFilter;
    }

    public void setsOptPriceFilter(String sPriceFilter) {
        this.sOptPriceFilter = sPriceFilter;
    }

    public Map<String, String> getmMaker() {
        return mMaker;
    }

    public void setmMaker(Map<String, String> mMaker) {
        this.mMaker = mMaker;
    }

    public List<Item> getLstItem() {
        return lstItem;
    }

    public void setLstItem(List<Item> lstItem) {
        this.lstItem = lstItem;
    }

    public List<String> getLstRelationWord() {
        return lstRelationWord;
    }

    public void setLstRelationWord(List<String> lstRelationWord) {
        this.lstRelationWord = lstRelationWord;
    }

    public List<String> getLstPopularWord() {
        return lstPopularWord;
    }

    public void setLstPopularWord(List<String> lstPopularWord) {
        this.lstPopularWord = lstPopularWord;
    }

    public Map<String, String> getmCgt1() {
        return mCgt1;
    }

    public void setmCgt1(Map<String, String> mCgt1) {
        this.mCgt1 = mCgt1;
    }
}