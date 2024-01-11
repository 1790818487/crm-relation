package com.dlm.service.impl;

import com.dlm.dao.LoggingEvent;
import com.dlm.mapper.LoggingEventMapper;
import com.dlm.service.ILoggingEventService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黎明
 * @since 2024-01-04
 */
@Service
public class LoggingEventServiceImpl extends ServiceImpl<LoggingEventMapper, LoggingEvent> implements ILoggingEventService {

}
