package mo.bitcode.bitcodebootstrap.sms.sms_userprofile;

import mo.bitcode.bitcodebootstrap.model.BitCodeUserProfile;
import mo.bitcode.core.security.jwt.JwtUtil;
import mo.bitcode.sms.sms_userprofile.SmsUserProfileService;

/**
 * Author: Ka Kei Pun
 * Date: 8/24/20
 * Version: 1.0.0
 */

public class BitCodeSmsUserProfileService<ChildProfile extends BitCodeUserProfile> extends SmsUserProfileService<ChildProfile> {

  private static final String GOO_WHERE_SID_PREFIX = "gw";

  public BitCodeSmsUserProfileService(JwtUtil jwtUtil, BitCodeSmsUserProfileRepository bitCodeSmsUserProfileRepository) {
    super(bitCodeSmsUserProfileRepository);
  }

  @Override
  protected String getSidPrefix() {
    return this.GOO_WHERE_SID_PREFIX;
  }

  @Override
  public ChildProfile generateEmptyProfile() {
    return (ChildProfile) this.createDefaultRepositoryObject(new BitCodeUserProfile());
  }
}
