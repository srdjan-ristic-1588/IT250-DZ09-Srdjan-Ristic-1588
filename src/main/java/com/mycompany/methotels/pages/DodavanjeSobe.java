/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.pages;

import com.mycompany.methotels.entities.Hoteli;
import com.mycompany.methotels.interfaces.HotelsDAO;
import com.mycompany.methotels.entities.Sobe;
import java.util.ArrayList;
import java.util.List;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;

/**
 *
 * @author BASKETBALL IN HEART
 */
public class DodavanjeSobe {

    @Property
    @Persist
    private Sobe sobe;
    @Property
    private Sobe onesoba;
    @Property
    private List<Sobe> sveSobe;
    @Inject
    private HotelsDAO hd;

    void onActivate() {
        if (sveSobe == null) {
            sveSobe = new ArrayList<Sobe>();
        }
        sveSobe = hd.getListaSvihSoba();
    }

    @CommitAfter
    Object onSuccess() {
        hd.dodajIliUpdatujSobu(sobe);
        sobe = new Sobe();
        return this;
    }

    @CommitAfter
    Object onActionFromDelete(int id) {
        hd.deleteSoba(id);
        return this;
    }

    @CommitAfter
    Object onActionFromEdit(Sobe sobee) {
        sobe = sobee;
        return this;
    }

    public JSONObject getOptions() {
        JSONObject json = new JSONObject();
        json.put("bJQueryUI", "true");
        json.put("bStateSave", true);
        json.put("bAutoWidth", true);
        return json;
    }
}
