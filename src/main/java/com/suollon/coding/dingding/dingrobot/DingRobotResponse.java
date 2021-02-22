package com.suollon.coding.dingding.dingrobot;

import java.io.Serializable;

/**
 * @author hzwwl
 * @date 2019/9/7 17:54
 */
public class DingRobotResponse implements Serializable {

    private Long errcode;

    private String errmsg;

    public Long getErrcode() {
        return errcode;
    }

    public void setErrcode(Long errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
