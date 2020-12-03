package com.regionosago.cms.services;

import com.regionosago.cms.persistence.entities.User;
import com.regionosago.cms.persistence.entities.enums.Role;
import com.regionosago.cms.persistence.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService  {    //implements UserDetailsService

    private final UserRepository userRepository;

    public Optional<User> findByLogin(String login){
        return userRepository.findByLogin(login);
    }

//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//        User user;
//        Optional<User> userOptional = userRepository.findByLogin(username);
//        if (userOptional.isEmpty()){
//            throw new UsernameNotFoundException("Invalid login or password");
//        }else{
//            user = userOptional.get();
//        }
//        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), mapRoleToAuthorities(user.getRole())) {
//        };
//
//    }
//
//    private Collection<? extends GrantedAuthority> mapRoleToAuthorities(Role role){
//        List<Role> roles = new ArrayList<>();
//        roles.add(role);
//        return roles.stream().map(userRole -> new SimpleGrantedAuthority((userRole.name()))).collect(Collectors.toList());
//    }
}
