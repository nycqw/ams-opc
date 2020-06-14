package com.eden.site.service.impl;

import com.eden.core.lock.annotation.Lock;
import com.eden.mid.domain.param.app.AddAppParam;
import com.eden.mid.domain.param.app.QueryAppParam;
import com.eden.mid.domain.result.app.AppResult;
import com.eden.site.service.AppService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenqw
 * @version 1.0
 * @since 2020/5/18
 */
@Service
public class AppServiceImpl implements AppService {

    @Reference
    private com.eden.mid.intf.app.AppService appService;

    @Override
    @Lock
    public Long add(AddAppParam addAppParam) {
        return appService.add(addAppParam);
    }

    @Override
    public List<AppResult> queryList(QueryAppParam queryAppParam) {
        return appService.queryList(queryAppParam);
    }
}
