package mo.bitcode.bitcodebootstrap.model;

import mo.bitcode.sms.model.SmsUserProfile;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.MappedSuperclass;


/**
 * Author: Ka Kei Pun
 * Date: 8/16/20
 * Version: 1.0.0
 */

@MappedSuperclass
public class BitCodeUserProfile<GooWhereUserRole extends GrantedAuthority, ChildProfile extends BitCodeUserProfile> extends SmsUserProfile<GooWhereUserRole, ChildProfile> {

}
