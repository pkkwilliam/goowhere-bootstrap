package mo.bitcode.bitcodebootstrap.sms.sms_userprofile;

import mo.bitcode.bitcodebootstrap.model.BitCodeUserProfile;
import mo.bitcode.sms.sms_userprofile.SmsUserProfileRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Author: Ka Kei Pun
 * Date: 8/16/20
 * Version: 1.0.0
 */

@NoRepositoryBean
public interface BitCodeSmsUserProfileRepository<ChildProfile extends BitCodeUserProfile> extends SmsUserProfileRepository<ChildProfile> {
}
