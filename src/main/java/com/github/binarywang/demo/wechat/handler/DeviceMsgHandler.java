package com.github.binarywang.demo.wechat.handler;


import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * DeviceMsgHandler
 *
 * @author lzw
 * @date 2018/4/24 15:16
 **/
@Component
public class DeviceMsgHandler extends AbstractHandler {



    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMpXmlMessage,
                                    Map<String, Object> map,
                                    WxMpService wxMpService,
                                    WxSessionManager wxSessionManager) {
        switch (wxMpXmlMessage.getEvent()) {
            case "bind":
                logger.info("绑定成功");
                break;
            case "unbind":
                logger.info("解绑成功");
                break;
            default:
                break;
        }
        return null;
    }
}
