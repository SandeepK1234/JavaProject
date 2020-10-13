/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author lenovo
 */
@Entity
@Table(name = "TICKET", catalog = "", schema = "17CS107")
@NamedQueries({
    @NamedQuery(name = "Ticket_1.findAll", query = "SELECT t FROM Ticket_1 t")
    , @NamedQuery(name = "Ticket_1.findByTicketId", query = "SELECT t FROM Ticket_1 t WHERE t.ticketId = :ticketId")
    , @NamedQuery(name = "Ticket_1.findByPassengerId", query = "SELECT t FROM Ticket_1 t WHERE t.passengerId = :passengerId")
    , @NamedQuery(name = "Ticket_1.findByBookDate", query = "SELECT t FROM Ticket_1 t WHERE t.bookDate = :bookDate")
    , @NamedQuery(name = "Ticket_1.findByTicketDescription", query = "SELECT t FROM Ticket_1 t WHERE t.ticketDescription = :ticketDescription")})
public class Ticket_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TICKET_ID")
    private BigDecimal ticketId;
    @Basic(optional = false)
    @Column(name = "PASSENGER_ID")
    private BigInteger passengerId;
    @Basic(optional = false)
    @Column(name = "BOOK_DATE")
    private String bookDate;
    @Basic(optional = false)
    @Column(name = "TICKET_DESCRIPTION")
    private String ticketDescription;

    public Ticket_1() {
    }

    public Ticket_1(BigDecimal ticketId) {
        this.ticketId = ticketId;
    }

    public Ticket_1(BigDecimal ticketId, BigInteger passengerId, String bookDate, String ticketDescription) {
        this.ticketId = ticketId;
        this.passengerId = passengerId;
        this.bookDate = bookDate;
        this.ticketDescription = ticketDescription;
    }

    public BigDecimal getTicketId() {
        return ticketId;
    }

    public void setTicketId(BigDecimal ticketId) {
        BigDecimal oldTicketId = this.ticketId;
        this.ticketId = ticketId;
        changeSupport.firePropertyChange("ticketId", oldTicketId, ticketId);
    }

    public BigInteger getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(BigInteger passengerId) {
        BigInteger oldPassengerId = this.passengerId;
        this.passengerId = passengerId;
        changeSupport.firePropertyChange("passengerId", oldPassengerId, passengerId);
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        String oldBookDate = this.bookDate;
        this.bookDate = bookDate;
        changeSupport.firePropertyChange("bookDate", oldBookDate, bookDate);
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        String oldTicketDescription = this.ticketDescription;
        this.ticketDescription = ticketDescription;
        changeSupport.firePropertyChange("ticketDescription", oldTicketDescription, ticketDescription);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ticketId != null ? ticketId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket_1)) {
            return false;
        }
        Ticket_1 other = (Ticket_1) object;
        if ((this.ticketId == null && other.ticketId != null) || (this.ticketId != null && !this.ticketId.equals(other.ticketId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "demo1.Ticket_1[ ticketId=" + ticketId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
