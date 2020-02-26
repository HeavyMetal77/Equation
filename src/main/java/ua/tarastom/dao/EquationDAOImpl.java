package ua.tarastom.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import ua.tarastom.entity.EquationModel;

import java.util.List;

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
            currentSession.close();
        }
    }

    @Override
    public List<EquationModel> getEquations() {
        List resultList;
        Session currentSession = sessionFactory.getCurrentSession();
        try {
            currentSession.beginTransaction();
            Query from_equationModel = currentSession.createQuery("from EquationModel", EquationModel.class);
            resultList = from_equationModel.getResultList();
        } finally {
            currentSession.close();
        }
        return resultList;
    }
}
