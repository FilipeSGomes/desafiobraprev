package com.desafio.brasilprev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private ImplementsUserDetailsService userDetailsService;
	
	@Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests()
			.antMatchers(HttpMethod.GET, "/").permitAll()
			.antMatchers(HttpMethod.PUT, "/").permitAll()
			.antMatchers(HttpMethod.DELETE, "/").permitAll()
			.antMatchers(HttpMethod.POST, "/").permitAll()
			.anyRequest().authenticated()
			.and().formLogin().permitAll()
			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
			
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication() 
			.withUser("Test").password("{noop}1234").roles("ADMIN");
		auth.inMemoryAuthentication() 
		.withUser("Filipe").password("{noop}1234").roles("ADMIN");
		auth.inMemoryAuthentication() 
		.withUser("BrasilPrev").password("{noop}1234").roles("ADMIN");
		auth.inMemoryAuthentication() 
		.withUser("Isabella").password("{noop}1234").roles("ADMIN");
		auth.userDetailsService(userDetailsService)
			.passwordEncoder(new BCryptPasswordEncoder());
	}

}
