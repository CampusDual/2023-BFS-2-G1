package com.ontimize.finants.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface IGroupService {
    public EntityResult groupQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
    public EntityResult groupInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
    public EntityResult groupUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
    public EntityResult groupDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
    public EntityResult getGroupsByMemberQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
    public EntityResult getGroupMembersQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
    public EntityResult getAvailableMembersQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
    public EntityResult getGroupMovements(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
    public EntityResult getGroupMembersWithBalanceQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
    public EntityResult getGroupMovementsQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
    public EntityResult getGroupMovementsDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
    public EntityResult getGroupMembersWithBalanceDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
    public EntityResult getGroupMovementsByUser(Map<String, Object> keyMap, String user) throws OntimizeJEERuntimeException;
    public EntityResult getAvailableUsersForGroupQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
    public EntityResult getSettlingMovementsQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
}
