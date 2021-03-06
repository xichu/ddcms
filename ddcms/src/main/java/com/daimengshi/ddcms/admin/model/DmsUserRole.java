package com.daimengshi.ddcms.admin.model;

import com.daimengshi.ddcms.admin.model.base.BaseDmsUserRole;
import io.jboot.db.annotation.Table;

/**
 * Generated by Jboot.
 */
@Table(tableName = "dms_user_role", primaryKey = "id")
public class DmsUserRole extends BaseDmsUserRole<DmsUserRole> {
    public static final DmsUserRole dao = new DmsUserRole();


    /**
     * 通过rid获取关联的角色
     * @return
     */
    public  DmsRole getRole(){
        return DmsRole.dao.findFirst("select * from dms_role WHERE dms_role.id = ?",getStr("rid"));
    }

}
