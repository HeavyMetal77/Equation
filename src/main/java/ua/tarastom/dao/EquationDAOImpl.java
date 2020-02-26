package ua.tarastom.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import ua.tarastom.entity.EquationModel;

@Repository
public class EquationDAOImpl implements EquationDAO {

    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
            .addAnnotatedClass(EquationModel.class).buildSessionFactory();



    @Override
    public void saveResult(EquationModel equationModel) {
        Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.beginTransaction();
            currentSession.save(equationModel);
            currentSession.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
