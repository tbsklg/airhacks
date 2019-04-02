
package com.airhacks.ping.boundary;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author airhacks.com
 */
//@Interceptors(CallTracer.class)
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class Pingy {

    @PersistenceContext
    EntityManager em;

    @Resource
    UserTransaction tx;

    @PostConstruct
    public void init() {
        System.out.println("--- initialized");
    }


    public void save(Ping ping) {
        try {
            //only with UserTransactions, you get a per-tx timeout
            tx.setTransactionTimeout(10);
        } catch (SystemException ex) {
            Logger.getLogger(Pingy.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            tx.begin();
        } catch (NotSupportedException | SystemException ex) {
            Logger.getLogger(Pingy.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.em.merge(ping);

        try {
            tx.commit();
        } catch (RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException | SystemException ex) {
            Logger.getLogger(Pingy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Ping> all() {
        return this.em.createNamedQuery("all", Ping.class).getResultList();
    }


}
