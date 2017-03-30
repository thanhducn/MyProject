package com.ducnt7.controllers;

import com.ducnt7.services.TopRankingService;
import com.ducnt7.utils.FitsCommon;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by DucNT7 on 3/3/2017.
 */

@RestController
//@PropertySource(value = "classpath:/application.properties")
public class SearchController {

    @Autowired
    private Environment env;

    private TopRankingService repository;
    private FitsCommon common;

    @ApiOperation(value = "getSearch")
    //@RequestMapping(path = "/search", method = RequestMethod.GET, produces = "application/json", params = {"opt_cgt1"})
    @RequestMapping(path = "/search", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity findItemWithName(@RequestParam(value = "opt_cgt1", defaultValue = "デザイン／マルチメディア") String name) throws IOException {
        String sUrl = env.getProperty("FITS.search.url");
        //System.out.println(sUrl + name); // TODO json is null... how to retrieve plain json body?
        String json = common.readJsonFromUrl(sUrl);
        System.out.println(json);
        return new ResponseEntity<>(json, HttpStatus.OK);
        //return "OK";
    }

    /*public ResponseEntity findItemWithName( @RequestParam(value = "opt_cgt1") String name) {
        return new ResponseEntity<>(repository.getTopRankingProduct(), HttpStatus.OK);
    }*/

}
