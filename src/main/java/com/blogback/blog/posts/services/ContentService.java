package com.blogback.blog.posts.services;

import com.blogback.blog.posts.models.PostModel;
import com.blogback.blog.posts.repositories.ContentRepository;
import org.springframework.stereotype.Service;

@Service
public class ContentService implements ContentRepository {


    @Override
    public long createPostContent(Long idContent) {
        return 0;
    }

    @Override
    public void savePostContent(Object postContent) {

    }

    @Override
    public boolean existsByIdPost(long idPost) {
        return false;
    }
}
