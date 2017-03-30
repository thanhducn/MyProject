package com.ducnt7.services;

import com.ducnt7.bean.SearchResult;
import com.ducnt7.utils.TopRankingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DucNT7 on 3/3/2017.
 */
@Service
public class TopRankingServiceImpl implements TopRankingService {

    @Autowired
    private TopRankingUtil topRankingUtil;

    @Override
    public SearchResult getTopRankingProduct(String name) {
        SearchResult result = new SearchResult();
        result = topRankingUtil.getTopRanking();
        return result;
    }
}
