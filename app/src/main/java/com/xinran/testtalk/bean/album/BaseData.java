package com.xinran.testtalk.bean.album;

import java.io.Serializable;

import com.baidu.android.itemview.helper.BaseStyle;

/**
 * @desc:网络数据类的基类
 * @date: 2015年7月3日 下午4:40:54
 *
 */
public abstract class BaseData extends BaseStyle implements Serializable {

    protected static final int STATUS_OK = 0;
    protected static final int STATUS_ERROR = -1;
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private transient int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
