package com.eden.site.controller.app;

import com.eden.mid.domain.param.app.AddAppParam;
import com.eden.mid.domain.param.app.QueryAppParam;
import com.eden.mid.domain.result.app.AppResult;
import com.eden.site.service.AppService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chenqw
 * @version 1.0
 * @since 2020/5/18
 */
@RestController
@RequestMapping("/app")
@Api("应用管理")
public class AppController {

    @Resource
    private AppService applicationService;

    @PostMapping("add")
    public Long add(@RequestBody AddAppParam addAppParam) {
        return applicationService.add(addAppParam);
    }

    @PostMapping("list")
    public List<AppResult> queryList(@RequestBody QueryAppParam queryAppParam) {
        return applicationService.queryList(queryAppParam);
    }
}
