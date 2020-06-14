package com.eden.site.service;


import com.eden.mid.domain.param.app.AddAppParam;
import com.eden.mid.domain.param.app.QueryAppParam;
import com.eden.mid.domain.result.app.AppResult;

import java.util.List;

public interface AppService {

    Long add(AddAppParam addAppParam);

    List<AppResult> queryList(QueryAppParam queryAppParam);
}
