package com.desafio.brasilprev.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails{
	private static final long serialVersionUID = 1L;
	private Client client;
	
	public UserPrincipal(Client client) {
		// TODO Auto-generated constructor stub
	this.client = client;
	
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> authorities= new ArrayList<GrantedAuthority>();
		this.client.getPermissionList().forEach(permission ->{
			GrantedAuthority authority = new SimpleGrantedAuthority(permission);
			authorities.add(authority);
		});
	
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.client.getPassword();
	}

	@Override
	public String getUsername() {
		return this.client.getLogin();
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
	
	
}
