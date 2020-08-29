package com.goowhere.goowherebootstrap.sms.sms_userprofile;

import com.goowhere.goowherebootstrap.model.GooWhereUserProfile;
import com.goowhere.sms.sms_userprofile.SmsUserProfileRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Author: Ka Kei Pun
 * Date: 8/16/20
 * Version: 1.0.0
 */

@NoRepositoryBean
public interface GooWhereSmsUserProfileRepository<ChildProfile extends GooWhereUserProfile> extends SmsUserProfileRepository<ChildProfile> {
}
