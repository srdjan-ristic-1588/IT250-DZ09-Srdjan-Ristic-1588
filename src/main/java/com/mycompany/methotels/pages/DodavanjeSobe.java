/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.pages;



import com.mycompany.methotels.data.Sobe;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

/**
 *
 * @author BASKETBALL IN HEART
 */
public class DodavanjeSobe {

    @Property
    private Sobe soba;
    @Inject
    private Session session;

    @Property
    private ArrayList<Sobe> sobe;

    void onActivate() {
        if (sobe == null) {
            sobe = new ArrayList<Sobe>();
        }
        sobe = (ArrayList<Sobe>) session.createCriteria(Sobe.class).list();
    }

    @CommitAfter
    Object onSuccess() {
        session.persist(soba);
        return this;
    }
}
