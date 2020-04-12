package com.umang.lucientinnovationinterview.product;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="body_html")
	private String bodyHtml;
	
	@Column(name="vendor")
	private String vendor;
	
	@Column(name="product_type")
	private String productType;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="handle")
	private String handle;
	
	@Column(name="updated_at")
	private Date updatedAt;
	
	@Column(name="published_at")
	private Date publishedAt;
	
	@Column(name="template_suffix")
	private String templateSuffix;
	
	@Column(name="published_scope")
	private String publishedScope;
	
	@Column(name="tags")
	private String tags;
	
	@Column(name="admin_graphql_api_id")
	private String adminGraphqlApiId;
	


}

