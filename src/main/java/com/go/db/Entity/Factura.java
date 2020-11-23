package com.go.db.Entity;

import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="FACTURA")
public class Factura {

	

	    
	    @Id
	    @Column(name="ID")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    
	      
	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "fecha", nullable = false)
	    private Calendar registDate;
	    
	    @JoinColumn(name = "cliente_fk", nullable = false)
	    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    private Cliente customer;
	    
	   	    
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "factura")
	    private List<LineaFactura> lines;


		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public Calendar getRegistDate() {
			return registDate;
		}


		public void setRegistDate(Calendar registDate) {
			this.registDate = registDate;
		}


		public Cliente getCustomer() {
			return customer;
		}


		public void setCustomer(Cliente customer) {
			this.customer = customer;
		}


		public List<LineaFactura> getLines() {
			return lines;
		}


		public void setLines(List<LineaFactura> lines) {
			this.lines = lines;
		}


		public Factura(long id, Calendar registDate, Cliente customer, List<LineaFactura> lines) {
			super();
			this.id = id;
			this.registDate = registDate;
			this.customer = customer;
			this.lines = lines;
		}


		public Factura() {
			super();
		}

	
	    
}
