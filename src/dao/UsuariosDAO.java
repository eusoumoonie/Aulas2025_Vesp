/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Criteria;
import bean.Usuarios;

/**
 *
 * @author u11249767105
 */
public class UsuariosDAO extends AbstractDAO{

    @Override
    public void insert(Object object) {
     
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {

        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit;
    }

    @Override
    public void delete(Object object) {
                session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit;
    }

    @Override
    public Object list(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        session.beginTransaction();
        Criteria criteria = session.createCriteria(usuarios.class)
        session.getTransaction().commit;
    }

    @Override
    public Object listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
