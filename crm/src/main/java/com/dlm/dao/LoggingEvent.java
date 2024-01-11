package com.dlm.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 黎明
 * @since 2024-01-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("logging_event")
@ApiModel(value="LoggingEvent对象", description="")
public class LoggingEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long timestmp;

    private String formattedMessage;

    private String loggerName;

    private String levelString;

    private String threadName;

    private Integer referenceFlag;

    private String arg0;

    private String arg1;

    private String arg2;

    private String arg3;

    private String callerFilename;

    private String callerClass;

    private String callerMethod;

    private String callerLine;

    @TableId(value = "event_id", type = IdType.AUTO)
    private Long eventId;


}
