package com.desafio.brasilprev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.desafio.brasilprev.domain.Client;
import com.desafio.brasilprev.repository.ClientRepository;


@Repository
public class ImplementsUserDetailsService implements UserDetailsService{

	@Autowired
	private ClientRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Client user = usuarioRepository.findByFirstName(name);
		System.out.println(user.getPassword());
		System.out.println(user.getUsername());
	    if (user == null) {
	      throw new UsernameNotFoundException("Usuário não encontrado!");
	    }
		return user;
	}

}