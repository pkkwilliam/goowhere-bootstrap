package com.goowhere.goowherebootstrap.sms.sms_texting;

import com.goowhere.goowherebootstrap.model.GooWhereUserProfile;
import com.goowhere.sms.sms_texting.SmsProviderServiceInterface;
import com.goowhere.sms.sms_texting.SmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * Author: Ka Kei Pun
 * Date: 8/16/20
 * Version: 1.0.0
 */

@Service
public class GooWhereSmsService extends SmsService<GooWhereUserProfile> {

  private static final Logger LOGGER = LoggerFactory.getLogger(GooWhereSmsService.class);

  public GooWhereSmsService(SmsProviderServiceInterface smsProviderService) {
    super(smsProviderService);
  }

}