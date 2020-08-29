package com.goowhere.goowherebootstrap.sms.sms_userprofile;

import com.goowhere.goowherebootstrap.model.GooWhereUserProfile;
import com.goowhere.sms.sms_userprofile.SmsUserProfileService;
import org.springframework.stereotype.Service;

/**
 * Author: Ka Kei Pun
 * Date: 8/24/20
 * Version: 1.0.0
 */

@Service
public class GooWhereSmsUserProfileService<ChildProfile extends GooWhereUserProfile> extends SmsUserProfileService<ChildProfile> {

  private static final String GOO_WHERE_SID_PREFIX = "gw";

  public GooWhereSmsUserProfileService(GooWhereSmsUserProfileRepository gooWhereSmsUserProfileRepository) {
    super(gooWhereSmsUserProfileRepository);
  }

  @Override
  protected String getSidPrefix() {
    return this.GOO_WHERE_SID_PREFIX;
  }

}
