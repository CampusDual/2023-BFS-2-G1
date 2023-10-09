package com.ontimize.finants.model.core.service;

import com.ontimize.finants.api.core.service.IIncomeService;
import com.ontimize.finants.model.core.dao.ExpenseDao;
import com.ontimize.finants.model.core.dao.IncomeDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Lazy
@Service("IncomeService")

public class IncomeService implements IIncomeService {

    @Autowired
    private IncomeDao incomeDao;
    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;


    @Override
    public EntityResult incomeQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        keyMap.put(IncomeDao.ATTR_USER_, authentication.getName());
        return this.daoHelper.query(this.incomeDao, keyMap, attrList);
    }

    @Override
    public EntityResult incomeInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        attrMap.put(IncomeDao.ATTR_USER_, authentication.getName());
        return this.daoHelper.insert(this.incomeDao, attrMap);
    }

    @Override
    public EntityResult incomeUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        keyMap.put(IncomeDao.ATTR_USER_, authentication.getName());
        return this.daoHelper.update(this.incomeDao, attrMap, keyMap);
    }

    @Override
    public EntityResult incomeDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.incomeDao, keyMap);
    }

    @Override
    public EntityResult totalIncomeDayQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        keyMap.put(IncomeDao.ATTR_USER_, authentication.getName());
        return this.daoHelper.query(this.incomeDao, keyMap, attrList,IncomeDao.QUERY_INCOME_AMOUNT );
    }

}