package com.goowhere.goowherebootstrap;

import com.goowhere.core.AppContext;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// TODO add this to the new application Main
//@ComponentScan({
//				"com.goowhere.core",
//				"com.goowhere.sms",
//				"com.goowhere.pre_check",
//				"com.goowhere.goowherebootstrap",
//})
//@EnableJpaRepositories(basePackages = {
//				"com.goowhere.core.service",
//				"com.goowhere.pre_check",
//				"com.goowhere.goowherebootstrap"})
//@EntityScan({
//				"com.goowhere.core.entityModel",
//				"com.goowhere.sms",
//				"com.goowhere.goowherebootstrap.model"})

public abstract class GoowhereBootstrapApplication extends AppContext {

}
