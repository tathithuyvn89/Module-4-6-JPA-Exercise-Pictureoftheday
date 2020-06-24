package myapp.repository;

import myapp.model.ImageComment;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.xml.stream.events.Comment;
import java.util.List;
@Transactional
public class CommentRepositoryImpl implements CommentRepository {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<ImageComment> findAll() {
        TypedQuery<ImageComment> query= em.createQuery("select c from ImageComment c", ImageComment.class);
        return query.getResultList();
    }

    @Override
    public ImageComment findOne(Long id) {
        TypedQuery<ImageComment> query = em.createQuery("select c from ImageComment c where c.id=:id",ImageComment.class);
        query.setParameter("id",id);
        try {
            return query.getSingleResult();

        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(ImageComment model) {
            em.persist(model);

    }

    @Override
    public void delete(Long id) {
        em.remove(id);

    }
}
