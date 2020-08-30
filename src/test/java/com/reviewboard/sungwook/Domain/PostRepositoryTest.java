package com.reviewboard.sungwook.Domain;


import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void 글생성_저장(){

        //given
        Posts test_post = Posts.builder()
                .title("hello world")
                .content("It is first content")
                .author("aaa")
                .build();

        //when
        postRepository.save(test_post);

        //then
        List<Posts> postsList = postRepository.findAll();

        Posts findpost = postsList.get(0);
        assertThat(findpost.getTitle()).isEqualTo(test_post.getTitle());
        assertThat(findpost.getContent()).isEqualTo(test_post.getContent());
        assertThat(findpost.getAuthor()).isEqualTo(test_post.getAuthor());

    }
}