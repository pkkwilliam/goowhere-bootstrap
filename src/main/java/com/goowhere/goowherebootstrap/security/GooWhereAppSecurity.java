package com.goowhere.goowherebootstrap.security;

import com.goowhere.core.security.AppSecurityConfig;
import com.goowhere.core.security.jwt.JwtUtil;
import com.goowhere.goowherebootstrap.sms.sms_userprofile.GooWhereSmsUserProfileService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/** Author: Ka Kei Pun Date: 8/16/20 Version: 1.0.0 */

@Configuration
@EnableWebSecurity
public class GooWhereAppSecurity extends AppSecurityConfig {

  // Not sure if no bean found is legit or not, seems everything is working fine
  @SuppressWarnings("all")
  public GooWhereAppSecurity(
          JwtUtil jwtUtil,
          GooWhereSmsUserProfileService gooWhereSmsUserProfileService) {
    super(jwtUtil, gooWhereSmsUserProfileService);
  }

}
