package com.ding.demo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author DingShiWei
 * @since 2018-10-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BgMenuTreepath implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long ancestor;

    private Long descendant;


}
