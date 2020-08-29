package com.goowhere.goowherebootstrap.sms.sms_auth;

import com.goowhere.core.security.jwt.JwtUtil;
import com.goowhere.goowherebootstrap.model.GooWhereUserProfile;
import com.goowhere.goowherebootstrap.sms.sms_userprofile.GooWhereSmsUserProfileService;
import com.goowhere.sms.sms_auth.SmsAuthService;
import com.goowhere.sms.sms_texting.SmsService;

/**
 * Author: Ka Kei Pun
 * Date: 8/27/20
 * Version: 1.0.0
 */

public class GooWhereSmsAuthService extends SmsAuthService {

  public GooWhereSmsAuthService(JwtUtil jwtUtil, SmsService smsService, GooWhereSmsUserProfileService gooWhereSmsUserProfileService) {
    super(jwtUtil, smsService, gooWhereSmsUserProfileService);
  }

  @Override
  protected GooWhereUserProfile generateEmptyProfile() {
    return new GooWhereUserProfile();
  }
}
