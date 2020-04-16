package com.desafio.brasilprev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Client;
import com.desafio.brasilprev.domain.UserPrincipal;
import com.desafio.brasilprev.repository.ClientRepository;

@Repository
public class ImplementsUserDetailsService implements UserDetailsService {

	@Autowired
	private ClientRepository repository;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Client client = repository.findByLogin(login);
		if (client == null) {
			throw new UsernameNotFoundException("User not found!");
		}
		UserPrincipal user = new UserPrincipal(client);

		return user;
	}

}