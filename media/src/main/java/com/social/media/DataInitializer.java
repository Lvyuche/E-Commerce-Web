package com.social.media;

import com.social.media.models.SocialGroup;
import com.social.media.models.SocialPost;
import com.social.media.models.SocialProfile;
import com.social.media.models.SocialUser;
import com.social.media.repositories.SocialGroupRepository;
import com.social.media.repositories.SocialPostRepository;
import com.social.media.repositories.SocialProfileRepository;
import com.social.media.repositories.SocialUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {
   private final SocialUserRepository socialUserRepository;
   private final SocialGroupRepository socialGroupRepository;
   private final SocialPostRepository socialPostRepository;
   private final SocialProfileRepository socialProfileRepository;

   public DataInitializer(SocialUserRepository socialUserRepository, SocialGroupRepository socialGroupRepository, SocialPostRepository socialPostRepository, SocialProfileRepository socialProfileRepository) {
      this.socialUserRepository = socialUserRepository;
      this.socialGroupRepository = socialGroupRepository;
      this.socialPostRepository = socialPostRepository;
      this.socialProfileRepository = socialProfileRepository;
   }

   @Bean
   public CommandLineRunner initializeData(){
      return args -> {
         SocialUser user1 = new SocialUser();
         SocialUser user2 = new SocialUser();
         SocialUser user3 = new SocialUser();

         socialUserRepository.save(user1);
         socialUserRepository.save(user2);
         socialUserRepository.save(user3);

         SocialGroup group1 = new SocialGroup();
         SocialGroup group2 = new SocialGroup();

         group1.getSocialUsers().add(user1);
         group1.getSocialUsers().add(user2);

         group2.getSocialUsers().add(user2);
         group2.getSocialUsers().add(user3);

         socialGroupRepository.save(group1);
         socialGroupRepository.save(group2);

         user1.getGroups().add(group1);
         user2.getGroups().add(group1);
         user2.getGroups().add(group2);
         user3.getGroups().add(group2);

         socialUserRepository.save(user1);
         socialUserRepository.save(user2);
         socialUserRepository.save(user3);

         SocialPost post1 = new SocialPost();
         SocialPost post2 = new SocialPost();
         SocialPost post3 = new SocialPost();

         post1.setSocialUser(user1);
         post2.setSocialUser(user2);
         post3.setSocialUser(user3);

         socialPostRepository.save(post1);
         socialPostRepository.save(post2);
         socialPostRepository.save(post3);

         SocialProfile profile1 = new SocialProfile();
         SocialProfile profile2 = new SocialProfile();
         SocialProfile profile3 = new SocialProfile();

         profile1.setUser(user1);
         profile2.setUser(user2);
         profile3.setUser(user3);

         socialProfileRepository.save(profile1);
         socialProfileRepository.save(profile2);
         socialProfileRepository.save(profile3);

         // FETCH TYPES
         System.out.println("FETCHING SOCIAL USER");
         socialUserRepository.findById(1L);
      };
   }
}
