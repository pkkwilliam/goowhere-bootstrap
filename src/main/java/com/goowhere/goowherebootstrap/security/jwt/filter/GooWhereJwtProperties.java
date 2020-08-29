package com.goowhere.goowherebootstrap.security.jwt.filter;

import com.goowhere.core.security.jwt.filter.config.JwtProperties;
import org.springframework.stereotype.Component;

/**
 * Author: Ka Kei Pun
 * Date: 8/17/20
 * Version: 1.0.0
 */

@Component
public class GooWhereJwtProperties extends JwtProperties {

  @Override
  public int getJwtExpiration() {
    return 86400; // 1 day
  }

  @Override
  public String getJwtSecret() {
    return "FUQrVsGpJ9cPBAVNCWX26CfnekdgQG7j";
  }

}
