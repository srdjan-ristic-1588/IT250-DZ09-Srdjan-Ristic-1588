/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.entities;

import com.mycompany.methotels.pages.AbstractEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author BASKETBALL IN HEART
 */
@Entity
@Table(name = "sobe")
@NamedQueries({
    @NamedQuery(name = "Sobe.findAll", query = "SELECT s FROM Sobe s")})
public class Sobe extends AbstractEntity{
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ImeSobe")
    private String imeSobe;
    @Basic(optional = false)
    @Column(name = "Sprat")
    private int sprat;
    @Basic(optional = false)
    @Column(name = "TvInternetDjakuzi")
    private String tvInternetDjakuzi;

    public Sobe() {
    }

    public Sobe(Integer id) {
        this.id = id;
    }

    public Sobe(Integer id, String imeSobe, int sprat, String tvInternetDjakuzi) {
        this.id = id;
        this.imeSobe = imeSobe;
        this.sprat = sprat;
        this.tvInternetDjakuzi = tvInternetDjakuzi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImeSobe() {
        return imeSobe;
    }

    public void setImeSobe(String imeSobe) {
        this.imeSobe = imeSobe;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public String getTvInternetDjakuzi() {
        return tvInternetDjakuzi;
    }

    public void setTvInternetDjakuzi(String tvInternetDjakuzi) {
        this.tvInternetDjakuzi = tvInternetDjakuzi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sobe)) {
            return false;
        }
        Sobe other = (Sobe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.methotels.entities.Sobe[ id=" + id + " ]";
    }
    
}
