package myapp.service;

import myapp.model.ImageComment;
import myapp.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<ImageComment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public ImageComment findOne(Long id) {
        return commentRepository.findOne(id);
    }

    @Override
    public void save(ImageComment model) {
        commentRepository.save(model);

    }

    @Override
    public void delete(Long id) {
        commentRepository.delete(id);

    }
}
