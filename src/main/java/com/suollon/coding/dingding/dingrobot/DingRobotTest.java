package com.suollon.coding.dingding.dingrobot;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * 使用自定义机器人
 * （1）获取到Webhook地址后，用户可以向这个地址发起HTTP POST 请求，即可实现给该钉钉群发送消息。注意，发起POST请求时，必须将字符集编码设置成UTF-8。
 * （2）当前自定义机器人支持文本 (text)、链接 (link)、markdown(markdown)、ActionCard、FeedCard消息类型，大家可以根据自己的使用场景选择合适的消息类型，达到最好的展示样式。
 * （3）自定义机器人发送消息时，可以通过手机号码指定“被@人列表”。在“被@人列表”里面的人员收到该消息时，会有@消息提醒(免打扰会话仍然通知提醒，首屏出现“有人@你”)。
 * （4）当前机器人尚不支持应答机制 (该机制指的是群里成员在聊天@机器人的时候，钉钉回调指定的服务地址，即Outgoing机器人)。
 * @author hzwwl
 * @date 2019/9/7 17:19
 */
public class DingRobotTest {

    private static final String url = "https://oapi.dingtalk.com/robot/send?access_token=bd9d20217e7ead356ecd01f96624897f3bcdfeea61289087cc66de0e82bcddc9";

    /**
     * 具体使用的时候，在统一异常拦截逻辑里调用 sendDingMessage() 方法
     */
    public static void main(String[] args) {
        sendDingMessage();
    }

    private static void sendDingMessage() {
        DingRobotParam param = new DingRobotParam();
        param.setMsgtype("text");
        param.setContent("这是一条来自Test的测试信息");
        DingRobotParam.At at = new DingRobotParam.At();
        at.setAtMobiles(Arrays.asList("13261303345"));
        //at.setAtAll(true);

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE);
        HttpEntity entity = new HttpEntity(param, headers);
        DingRobotResponse response = restTemplate.postForObject(url, entity, DingRobotResponse.class);
    }
}
