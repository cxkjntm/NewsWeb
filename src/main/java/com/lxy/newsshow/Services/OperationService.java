package com.lxy.newsshow.Services;

import com.lxy.newsshow.Mappers.OperationMapper;
import com.lxy.newsshow.entities.OperationHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationService {
    @Autowired
    OperationMapper operationMapper;
    public boolean Insertoperations(OperationHistory operationHistory){
        boolean flag = operationMapper.InsertOperations(operationHistory);
        if (flag) return true;
        else  return false;
    }
}
