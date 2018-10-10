package com.ding.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class BgMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "menu_id", type = IdType.AUTO)
    private Long menuId;

    private String menuName;

    private String menuPath;

    private String menuIcon;

    private Integer menuOrder;

    private String menuExplain;

    private Long menuCreator;

    private LocalDateTime menuCreateTime;

    private Long menuEditor;

    private LocalDateTime menuEditTime;

    private BigDecimal menuDelete;

    private Long menuDeleter;

    private LocalDateTime menuDeleteTime;

    private BigDecimal menuBan;

    private Long menuBanMan;

    private LocalDateTime menuBanTime;


}
