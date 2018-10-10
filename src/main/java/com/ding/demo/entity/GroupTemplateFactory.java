package com.ding.demo.entity;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.StringTemplateResourceLoader;

/**
 * @author DingShiWei
 * @since 2018/10/9 14:31
 * Description: demo
 */
public class GroupTemplateFactory {
    private static GroupTemplate groupTemplate = null;

    public static GroupTemplate getOnlyGroupTemplate(StringTemplateResourceLoader resourceLoader, Configuration cfg){
        if (null == groupTemplate){
            groupTemplate = new GroupTemplate(resourceLoader, cfg);
        }
        return groupTemplate;
    }
}
