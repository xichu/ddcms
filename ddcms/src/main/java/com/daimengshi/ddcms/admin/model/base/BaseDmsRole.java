package com.daimengshi.ddcms.admin.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDmsRole<M extends BaseDmsRole<M>> extends JbootModel<M> implements IBean {

    public static final String ACTION_ADD = "DmsRole:add";
    public static final String ACTION_DELETE = "DmsRole:delete";
    public static final String ACTION_UPDATE = "DmsRole:update";


    @Override
    public String addAction() {
        return ACTION_ADD;
    }

    @Override
    public String deleteAction() {
        return ACTION_DELETE;
    }

    @Override
    public String updateAction() {
        return ACTION_UPDATE;
    }


	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setDesc(java.lang.String desc) {
		set("desc", desc);
	}
	
	public java.lang.String getDesc() {
		return getStr("desc");
	}

	public void setKey(java.lang.String key) {
		set("key", key);
	}
	
	public java.lang.String getKey() {
		return getStr("key");
	}

	public void setIsOpen(java.lang.String isOpen) {
		set("is_open", isOpen);
	}
	
	public java.lang.String getIsOpen() {
		return getStr("is_open");
	}

}