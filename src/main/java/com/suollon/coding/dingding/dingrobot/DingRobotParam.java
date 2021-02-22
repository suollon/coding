package com.suollon.coding.dingding.dingrobot;

import java.io.Serializable;
import java.util.List;

/**
 * 使用自定义机器人
 * （1）获取到Webhook地址后，用户可以向这个地址发起HTTP POST 请求，即可实现给该钉钉群发送消息。注意，发起POST请求时，必须将字符集编码设置成UTF-8。
 * （2）当前自定义机器人支持文本 (text)、链接 (link)、markdown(markdown)、ActionCard、FeedCard消息类型，大家可以根据自己的使用场景选择合适的消息类型，达到最好的展示样式。
 * （3）自定义机器人发送消息时，可以通过手机号码指定“被@人列表”。在“被@人列表”里面的人员收到该消息时，会有@消息提醒(免打扰会话仍然通知提醒，首屏出现“有人@你”)。
 * （4）当前机器人尚不支持应答机制 (该机制指的是群里成员在聊天@机器人的时候，钉钉回调指定的服务地址，即Outgoing机器人)。
 * @author hzwwl
 * @date 2019/9/6 17:02
 */
public class DingRobotParam implements Serializable {

    /**
     * 自定义机器人支持文本 (text)、链接 (link)、markdown(markdown)、ActionCard、FeedCard消息类型
     * 消息类型，此时固定为：text
     * 必填
     */
    private String msgtype;

    /**
     * 消息内容
     * 必填
     */
    private String content;

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static class At implements Serializable {
        /**
         * 被@人的手机号(在content里添加@人的手机号)
         * 非必填
         */
        private List<String> atMobiles;

        /**
         * @ 所有人时：true，否则为：false
         * 非必填
         */
        private Boolean isAtAll;

        public List<String> getAtMobiles() {
            return atMobiles;
        }

        public void setAtMobiles(List<String> atMobiles) {
            this.atMobiles = atMobiles;
        }

        public Boolean isAtAll() {
            return isAtAll;
        }

        public void setAtAll(Boolean atAll) {
            isAtAll = atAll;
        }
    }

}
