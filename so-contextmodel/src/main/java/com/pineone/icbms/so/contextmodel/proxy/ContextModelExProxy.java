package com.pineone.icbms.so.contextmodel.proxy;

import com.pineone.icbms.so.contextmodel.entity.ContextModel;
import com.pineone.icbms.so.domain.entity.Domain;

import java.util.List;

/**
 * Created by melvin on 2016. 8. 2..
 */
public interface ContextModelExProxy {
    //
    String registerContextModel(ContextModel contextModel);
    List<ContextModel> retrieveContextModelListFromSDA();
    ContextModel retrieveContextModelDetail(String contextModelName);
    List<String> retrieveContextModelEvent(String contextModelId);
}
