package com.ducnt7.services;

import com.ducnt7.bean.SearchResult;

/**
 * Created by DucNT7 on 3/3/2017.
 */

public interface TopRankingService {
    public SearchResult getTopRankingProduct(String name);
}
