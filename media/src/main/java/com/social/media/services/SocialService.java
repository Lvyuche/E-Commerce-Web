package com.social.media.services;

import com.social.media.models.SocialPost;
import com.social.media.models.SocialUser;
import com.social.media.repositories.SocialUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocialService {
   @Autowired
   SocialUserRepository socialUserRepository;
   public List<SocialUser> getAllUsers() {
      return socialUserRepository.findAll();
   }

   public SocialUser saveUser(SocialUser socialUser) {
      return socialUserRepository.save(socialUser);
   }

   public SocialUser deleteUser(Long id) {
      SocialUser socialUser = socialUserRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
      socialUserRepository.deleteById(id);
      return socialUser;
   }
}
