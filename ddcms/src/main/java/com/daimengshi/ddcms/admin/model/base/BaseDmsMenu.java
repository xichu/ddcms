package com.daimengshi.ddcms.admin.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDmsMenu<M extends BaseDmsMenu<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "DmsMenu:add";
    public static final String ACTION_DELETE = "DmsMenu:delete";
    public static final String ACTION_UPDATE = "DmsMenu:update";


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

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setSuperId(java.lang.String superId) {
		set("super_id", superId);
	}
	
	public java.lang.String getSuperId() {
		return getStr("super_id");
	}

	public void setTypeId(java.lang.String typeId) {
		set("type_id", typeId);
	}
	
	public java.lang.String getTypeId() {
		return getStr("type_id");
	}

}
