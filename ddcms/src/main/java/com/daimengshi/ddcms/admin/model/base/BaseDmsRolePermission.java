package com.daimengshi.ddcms.admin.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDmsRolePermission<M extends BaseDmsRolePermission<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "DmsRolePermission:add";
    public static final String ACTION_DELETE = "DmsRolePermission:delete";
    public static final String ACTION_UPDATE = "DmsRolePermission:update";


    @Override
    protected String addAction() {
        return ACTION_ADD;
    }

    @Override
    protected String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
    protected String updateAction() {
        return ACTION_UPDATE;
    }


	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setRid(java.lang.String rid) {
		set("rid", rid);
	}
	
	public java.lang.String getRid() {
		return getStr("rid");
	}

	public void setPid(java.lang.String pid) {
		set("pid", pid);
	}
	
	public java.lang.String getPid() {
		return getStr("pid");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
