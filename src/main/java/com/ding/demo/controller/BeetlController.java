package com.ding.demo.controller;

import com.ding.demo.entity.GroupTemplateFactory;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author DingShiWei
 * @since 2018/10/9 11:53
 * Description: demo
 */
public class BeetlController {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(BeetlController.class);
        //模板资源加载器 6种
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        try {
            //配置类
            Configuration cfg = Configuration.defaultConfiguration();
            GroupTemplate gt = GroupTemplateFactory.getOnlyGroupTemplate(resourceLoader,cfg);
            Template t = gt.getTemplate("hello,${name}");
            t.binding("name", "beetl");
            String str = t.render();
            System.out.println(str);
        }catch (Exception e){
            logger.error(e.getMessage());
        }
    }
}
