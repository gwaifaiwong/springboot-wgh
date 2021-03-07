package com.gwaifaiwong.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangguihui
 * @date 2021/1/18
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "jwt")
public class JwtSecurityProperties {
    /** Request Header : Authorization */
    private String header;

    /** 令牌前缀，最后留个空格 Bearer */
    private String tokenStartWith;

    /** Base64对该令牌进行编码 */
    private String base64Secret;

    /**返回令牌前缀 */
    private Long tokenValidityInSeconds;

    /**返回令牌前缀 */
    public String getTokenStartWith() {
        return tokenStartWith + " ";
    }


}
