package io.fluentqa.feishu.tables;

import com.lark.oapi.Client;
import com.lark.oapi.service.bitable.v1.BitableService;
import com.lark.oapi.service.bitable.v1.model.CreateAppTableReq;

public class FeishuBitableService implements TableService {
    Client feishuOpenApiClient;
    BitableService bitableService;

    @Override
    public void createTable() {
//        bitableService.appTable()
//                .create(new CreateAppTableReq());
    }

    @Override
    public void syncTable() {

    }

    @Override
    public void captureEvent() {

    }
}
