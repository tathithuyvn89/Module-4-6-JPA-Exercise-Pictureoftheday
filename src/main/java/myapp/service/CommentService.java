package myapp.service;

import myapp.model.ImageComment;

import java.util.List;

public interface CommentService {
    List<ImageComment> findAll();
    ImageComment findOne(Long id);
    void save(ImageComment model);
    void delete(Long id);
}
