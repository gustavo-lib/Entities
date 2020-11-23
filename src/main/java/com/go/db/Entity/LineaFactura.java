package com.go.db.Entity;

import javax.persistence.*;

@Entity
@Table(name = "linea_factura")
public class LineaFactura {
	
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre_producto", nullable = false)
    private String product;
    
    @Column(name = "precio", nullable = false)
    private double price;
    
    @Column(name = "total", nullable = false)
    private double quantity;
    
    @ManyToOne
    @JoinColumn(name = "fk_factura", nullable = false, updatable = false)
    private Factura factura;
    
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name= "producto_fk")
    Producto producto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Factura getfactura() {
		return factura;
	}

	public void setfactura(Factura factura) {
		this.factura = factura;
	}

	public LineaFactura(Long id, String product, double price, double quantity, Factura factura) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.factura = factura;
	}

	public LineaFactura() {
		super();
	}
    
    

}
