package com.reviewboard.sungwook.Web;

import com.reviewboard.sungwook.Service.PostService;
import com.reviewboard.sungwook.Web.Dto.PostSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class PostApiController {
    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public long save(@RequestBody PostSaveRequestDto requestDto){
        return postService.save(requestDto);
    }
}
