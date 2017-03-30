package com.ducnt7.utils;

import com.ducnt7.bean.Item;
import com.ducnt7.bean.SearchResult;
import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by DucNT7 on 3/3/2017.
 */
@Component
public class TopRankingUtil {

    private final String RANK = "rank";
    private final String FIELDS = "fields";
    @Autowired
    private Environment env;

    /**
     * getTopRanking
     */
    public SearchResult getTopRanking() {
        return getTopRankingProduct();
    }

    /**
     * getTopRankingProduct
     *
     * @return SearchResult
     */
    private SearchResult getTopRankingProduct() {
        try {
            String sImgURL = env.getProperty("FITS.img.url");
            String sUrl = env.getProperty("FITS.ranking.url");
            SearchResult oSearchResult = new SearchResult();
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<String> entity = new HttpEntity<String>(FitsCommon.JSON, headers);
            ResponseEntity<String> responseEntity = restTemplate.exchange(sUrl, HttpMethod.GET, entity, String.class);
            HttpStatus statusCode = responseEntity.getStatusCode();
            if (statusCode != HttpStatus.OK) {
                oSearchResult.setiStatus(FitsCommon.NG);
                return oSearchResult;
            }
            JSONObject jsonResponse = FitsCommon.getJson(responseEntity.getBody());
            JSONObject objStatus = jsonResponse.getJSONObject(FitsCommon.STATUS);
            if (objStatus.getInt(FitsCommon.SUSSESS) != FitsCommon.OK) {
                oSearchResult.setiStatus(FitsCommon.NG);
                //logger.error(" function getTopRankingProduct() Fail to get data from url: " + sUrl);
                return null;
            }
            int iTotal = jsonResponse.getInt(FitsCommon.TOTAL);

            oSearchResult.setiTotal(iTotal);

            List<Item> lstItem = new ArrayList<Item>();
            JSONArray arrItem = FitsCommon.getJSONArray(FitsCommon.ITEMS, jsonResponse);
            if (arrItem == null) {
                return oSearchResult;
            }
            JSONObject objItem = null;
            int iRank = 0;
            String sId = FitsCommon.EMPTY_STRING;
            String sTitle = FitsCommon.EMPTY_STRING;
            String sPrice = FitsCommon.EMPTY_STRING;
            String sCcopy = FitsCommon.EMPTY_STRING;
            JSONArray arrayURL = null;
            JSONArray arrIURL = null;
            JSONArray arrMaker = null;
            JSONArray arrDstat = null;
            String sMakern = FitsCommon.EMPTY_STRING;
            JSONObject objItemCurrent = null;
            Item oItem = null;
            for (int i = 0; i < arrItem.length(); i++) {
                objItemCurrent = arrItem.getJSONObject(i);
                oItem = new Item();
                iRank = objItemCurrent.getInt(RANK);
                oItem.setiRank(iRank);
                objItem = objItemCurrent.getJSONObject(FIELDS);
                sId = FitsCommon.getString(FitsCommon.ID, objItem);
                oItem.setsId(sId);
                sTitle = FitsCommon.getString(FitsCommon.TITLE, objItem);
                oItem.setsTitle(sTitle);
                sPrice = FitsCommon.getString(FitsCommon.PRICE, objItem);
                oItem.setsPrice(sPrice);
                oItem.setlSdprice59998(FitsCommon.getlong(FitsCommon.SDPRICE59998, objItem));
                String sText = FitsCommon.getString(FitsCommon.TEXT, objItem);
                oItem.setsText(sText);
                arrayURL = FitsCommon.getJSONArray(FitsCommon.URL, objItem);
                if (arrayURL != null && StringUtils.isNotEmpty(arrayURL.getString(0))) {
                    oItem.setsUrl(arrayURL.getString(0));
                }
                arrIURL = FitsCommon.getJSONArray(FitsCommon.IURL, objItem);
                if (arrIURL != null && arrIURL.getString(0) != null && StringUtils.isNotEmpty(arrIURL.getString(0))) {
                    if (!(arrIURL.getString(0).toUpperCase().indexOf("noimage.jpg".toUpperCase()) >= 0)) {
                        oItem.setsIUrl(arrIURL.getString(0).replace(env.getProperty("FITS.img.urltemp"), sImgURL));
                    } else {
                        oItem.setsIUrl("images/noimage.jpg");
                    }
                } else {
                    oItem.setsIUrl("images/noimage.jpg");
                }
                sCcopy = FitsCommon.getString(FitsCommon.CCOPY, objItem);
                oItem.setsCcopy(sCcopy);
                arrMaker = FitsCommon.getJSONArray(FitsCommon.MAKER, objItem);
                if (arrMaker != null) {
                    oItem.setsMaker(arrMaker.getString(0));
                } else
                    oItem.setsMaker(FitsCommon.EMPTY_STRING);
                arrDstat = FitsCommon.getJSONArray(FitsCommon.DSTAT, objItem);
                if (arrDstat != null) {
                    oItem.setsDstat(arrDstat.getString(0));
                } else
                    oItem.setsDstat(FitsCommon.EMPTY_STRING);
                sMakern = FitsCommon.getString(FitsCommon.MAKERN, objItem);
                oItem.setsMakern(sMakern);
                lstItem.add(oItem);
            }
            oSearchResult.setLstItem(lstItem);
            return oSearchResult;
        } catch (Exception ex) {
            //logger.error("Have error at method getTopRankingProduct() with content: " + ex.getMessage());
            return null;
        }
    }
}
