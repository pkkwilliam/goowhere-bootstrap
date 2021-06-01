package mo.bitcode.bitcodebootstrap.sms.sms_texting;

import mo.bitcode.bitcodebootstrap.model.BitCodeUserProfile;
import mo.bitcode.sms.SmsProviderServiceInterface;
import mo.bitcode.sms.SmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * Author: Ka Kei Pun
 * Date: 8/16/20
 * Version: 1.0.0
 */

@Service
public class BitCodeSmsService extends SmsService<BitCodeUserProfile> {

  private static final Logger LOGGER = LoggerFactory.getLogger(BitCodeSmsService.class);

  public BitCodeSmsService(SmsProviderServiceInterface smsProviderService) {
    super(smsProviderService);
  }

}