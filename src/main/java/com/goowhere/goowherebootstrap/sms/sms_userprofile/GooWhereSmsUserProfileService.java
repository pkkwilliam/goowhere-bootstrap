package com.goowhere.goowherebootstrap.sms.sms_userprofile;

import com.goowhere.core.security.jwt.JwtUtil;
import com.goowhere.goowherebootstrap.model.GooWhereUserProfile;
import com.goowhere.sms.sms_userprofile.SmsUserProfileService;

/**
 * Author: Ka Kei Pun
 * Date: 8/24/20
 * Version: 1.0.0
 */

public class GooWhereSmsUserProfileService<ChildProfile extends GooWhereUserProfile> extends SmsUserProfileService<ChildProfile> {

  private static final String GOO_WHERE_SID_PREFIX = "gw";

  public GooWhereSmsUserProfileService(JwtUtil jwtUtil, GooWhereSmsUserProfileRepository gooWhereSmsUserProfileRepository) {
    super(jwtUtil, gooWhereSmsUserProfileRepository);
  }

  @Override
  protected String getSidPrefix() {
    return this.GOO_WHERE_SID_PREFIX;
  }

  @Override
  public ChildProfile generateEmptyProfile() {
    return (ChildProfile) new GooWhereUserProfile();
  }
}
