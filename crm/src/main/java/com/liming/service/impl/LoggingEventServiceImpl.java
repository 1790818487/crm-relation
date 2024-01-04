package com.liming.service.impl;

import com.liming.dao.LoggingEvent;
import com.liming.mapper.LoggingEventMapper;
import com.liming.service.ILoggingEventService;
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
