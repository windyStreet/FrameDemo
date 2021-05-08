package com.log4f2;

/**
 * @author windyStreet
 * @codetime 2021-05-07 9:14
 */
public class Des {
    /**
     * 导入jar包
     * log4j-1.2-api-2.11.2.jar
     * log4j-core-2.11.2.jar
     * log4j-slf4j-impl-2.11.2.jar
     * slf4j-api-1.7.30.jar
     */
    /**
     * 创建log4j2.xml
     */

    /**
     * <?xml version="1.0" encoding="UTF-8"?>
     * <Configuration status="INFO">
     *     <Appenders>
     *         <Console name="Console" target="SYSTEM_OUT">
     *             <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
     *         </Console>
     *     </Appenders>
     *     <Loggers>
     *         <Root level="info">
     *             <AppenderRef ref="Console"/>
     *         </Root>
     *     </Loggers>
     * </Configuration>
     */
}
