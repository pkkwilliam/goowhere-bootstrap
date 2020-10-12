package com.goowhere.goowherebootstrap.model;


import com.goowhere.sms.model.SmsUserProfile;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.MappedSuperclass;


/**
 * Author: Ka Kei Pun
 * Date: 8/16/20
 * Version: 1.0.0
 */

@MappedSuperclass
public class GooWhereUserProfile<GooWhereUserRole extends GrantedAuthority> extends SmsUserProfile<GooWhereUserRole> {

}
