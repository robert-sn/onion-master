CREATE TABLE product_final (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(3500) NOT NULL,
  description_short varchar(3200) DEFAULT NULL,
  description_long varchar(6400) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE vat (
  id int(11) NOT NULL AUTO_INCREMENT,
  value float DEFAULT NULL,
  description varchar(6400) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE product_final_price (
  id int(11) NOT NULL AUTO_INCREMENT,
  product_final_id int(11) NOT NULL,
  price_no_vat float DEFAULT NULL,
  vat_id int(11) NOT NULL,
  price_final float DEFAULT NULL,
  creation_date datetime DEFAULT NULL,
  active boolean DEFAULT '0',
  PRIMARY KEY (id),
  FOREIGN KEY (vat_id) REFERENCES vat (id),
  FOREIGN KEY (product_final_id) REFERENCES product_final (id)
);

CREATE TABLE category (
	id int(11) NOT NULL AUTO_INCREMENT,
	name varchar(500) DEFAULT NULL,
	category_id  int(11),
	PRIMARY KEY (id),
	FOREIGN KEY (category_id) REFERENCES category (id)
);

CREATE TABLE product_category (
    product_final_id int(11) NOT NULL,
    category_id int(11) NOT NULL,
    FOREIGN KEY (category_id) REFERENCES category (id),
    FOREIGN KEY (product_final_id) REFERENCES product_final (id)
);