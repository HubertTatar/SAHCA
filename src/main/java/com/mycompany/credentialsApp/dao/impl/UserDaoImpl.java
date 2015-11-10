package com.mycompany.credentialsApp.dao.impl;

import com.mycompany.credentialsApp.dao.UserDao;
import com.mycompany.credentialsApp.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    // ------------------------
    // PRIVATE FIELDS
    // ------------------------

    // An EntityManager will be automatically injected from entityManagerFactory
    // setup on DatabaseConfig class.
    @PersistenceContext
    private EntityManager entityManager;

    // ------------------------
    // PUBLIC METHODS
    // ------------------------

    /**
     * Save the user in the database.
     */
    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Override
    public List<User> search(String criteria, String value) {
        return entityManager.createQuery(String.format("from User where %s = '%s'", criteria, value)).getResultList();
    }

    /**
     * Delete the user from the database.
     */
    @Override
    public void delete(User user) {
        if (entityManager.contains(user))
            entityManager.remove(user);
        else
            entityManager.remove(entityManager.merge(user));
    }

    /**
     * Return all the users stored in the database.
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAll() {
        return entityManager.createQuery("from User").getResultList();
    }

    /**
     * Return the user having the passed email.
     */
    @Override
    public User getByEmail(String email) {
        return (User) entityManager.createQuery(
                "from User where email = :email")
                .setParameter("email", email)
                .getSingleResult();
    }

    /**
     * Return the user having the passed id.
     */
    @Override
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }

    /**
     * Update the passed user in the database.
     */
    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

}