package mo.bitcode.bitcodebootstrap.security;

import mo.bitcode.bitcodebootstrap.sms.sms_userprofile.BitCodeSmsUserProfileService;
import mo.bitcode.core.security.AppSecurityConfig;
import mo.bitcode.core.security.jwt.JwtUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/** Author: Ka Kei Pun Date: 8/16/20 Version: 1.0.0 */

//@Configuration
//@EnableWebSecurity
public class BitCodeAppSecurity extends AppSecurityConfig {

  // Not sure if no bean found is legit or not, seems everything is working fine
  @SuppressWarnings("all")
  public BitCodeAppSecurity(
          JwtUtil jwtUtil,
          BitCodeSmsUserProfileService bitCodeSmsUserProfileService) {
    super(jwtUtil, bitCodeSmsUserProfileService);
  }

}
