package com.ducnt7.utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Created by DucNT7 on 3/3/2017.
 */
public class FitsCommon {
    public static final String STATUS = "status";
    public static final String TOTAL = "total";
    public static final String ITEMS = "items";
    // item
    public static final String ID = "id";
    public static final String TITLE = "title";
    public static final String TEXT = "text";
    public static final String URL = "url";
    public static final String IURL = "iurl";
    public static final String CCOPY = "ccopy";
    public static final String PRICE = "price";
    public static final String MAKER = "maker";
    public static final String MAKERN = "makern";
    public static final String DSTAT = "dstat";
    public static final String EMPTY_STRING = "";
    public static final int OK = 1;
    public static final int NG = 0;
    public static final String SUSSESS = "success";
    public static final String JSON = "json";
    public static final String itemId = "&item_id=";
    // Json response key.
    public static final String RESULT = "result";
    public static final String SDPRICE59998 = "sdprice59998";

    public static final String money = "円";

    public static JSONObject getJson(String dataJson) {
        JSONObject jObject = new JSONObject();
        try {
            jObject = new JSONObject(dataJson);

            // return json Object convert from json string
            return jObject;
        } catch (Exception ex) {
            //logger.error("Have error at method getJson() with content:" + ex.getMessage());
            return null;
        }
    }

    // public static JSONObject readJsonFromUrl(String url) throws IOException,
    // JSONException {
    // try {
    // InputStream is = new URL(url).openStream();
    // BufferedReader rd = new BufferedReader(new InputStreamReader(is,
    // Charset.forName("Shift_JIS")));
    // String jsonText = readAll(rd);
    // System.out.println("jsonText::" + jsonText);
    // JSONObject json = new JSONObject(jsonText);
    // System.out.println(json);
    //
    // is.close();
    // return json;
    // }
    // catch(Exception ex)
    // {
    // logger.error("error readJsonFromUrl::" +ex.getMessage());
    // return null;
    // }
    // }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static String readJsonFromUrl(String surl) throws IOException {
        URL url = null;
        try {
            url = new URL(surl);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        HttpURLConnection request = null;
        InputStream is = null;
        try {
            request = (HttpURLConnection) url.openConnection();
            request.setRequestMethod("GET");
            request.connect();
            is = (InputStream) request.getInputStream();
            System.out.println("input stream :: " + is);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        JSONObject json;
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            //System.out.println("json text :: " + jsonText);
            //json = new JSONObject(jsonText);

            request.disconnect();
            return jsonText;
        } finally {
            is.close();
        }
    }

    public static JSONArray getJSONArray(String sKey, JSONObject jsonObj) {
        JSONArray arrObj = new JSONArray();
        if (jsonObj.isNull(sKey)) {
            return null;
        }

        try {
            arrObj = jsonObj.getJSONArray(sKey);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //logger.error("Have error at method getJSONArray() with content:" + e.getMessage());
            return arrObj = null;
        }
        return arrObj;
    }

    public static String getString(String sKey, JSONObject jsonObj) {
        String sValue;
        if (jsonObj.isNull(sKey)) {
            return null;
        }

        try {
            sValue = jsonObj.getString(sKey);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //logger.error("Have error at method getString() with content:" + e.getMessage());
            return sValue = null;
        }

        return sValue;
    }

    public static long getlong(String sKey, JSONObject jsonObj) {
        long sValue = 0;
        if (jsonObj.isNull(sKey)) {
            return 0;
        }

        try {
            sValue = jsonObj.getLong(sKey);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //logger.error("Have error at method getlong() with content:" + e.getMessage());
            return sValue;
        }

        return sValue;
    }
}
