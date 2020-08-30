package com.reviewboard.sungwook.Service;

import com.reviewboard.sungwook.Domain.PostRepository;
import com.reviewboard.sungwook.Web.Dto.PostSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public long save(PostSaveRequestDto requestDto){
        return postRepository.save(requestDto.toEntinity()).getId();
    }
}
