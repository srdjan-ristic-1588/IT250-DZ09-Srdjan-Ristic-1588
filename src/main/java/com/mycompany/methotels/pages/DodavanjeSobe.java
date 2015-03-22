/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.pages;
import com.mycompany.methotels.data.Sobe;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 *
 * @author BASKETBALL IN HEART
 */
public class DodavanjeSobe {
    
    @Persist
    @Property
    private ArrayList<Sobe> sobe;
    @Property
    private Sobe soba;

    void onActivate() {
        if (sobe == null) {
            sobe = new ArrayList<Sobe>();
        }
    }

    Object onSuccess() {
        sobe.add(soba);
        return this;
    }
}
