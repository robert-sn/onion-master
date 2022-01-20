CREATE TABLE product_final (
  id int(11) NOT NULL AUTO_INCREMENT,
  uuid varchar(128),
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
  vat_id int(11),
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

CREATE TABLE user (
    id int(11) NOT NULL AUTO_INCREMENT,
    username varchar(500) DEFAULT NULL,
    password varchar(500) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE user_role (
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(500) DEFAULT NULL,
    description varchar(500) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE user_user_role (
    user_id int(11) NOT NULL,
    user_role_id varchar(500) DEFAULT NULL,
    FOREIGN KEY (user_id) REFERENCES user (id),
    FOREIGN KEY (user_role_id) REFERENCES user_role (id)
);

CREATE TABLE shopping_cart (
    id int(11) NOT NULL AUTO_INCREMENT,
    uuid varchar(128),
    timestamp datetime DEFAULT 1,
    PRIMARY KEY (id)
);

CREATE TABLE cart_products (
    id int(11) NOT NULL AUTO_INCREMENT,
    shopping_cart_uuid varchar(128) NOT NULL,
    product_final_uuid varchar(128) NOT NULL,
    quantity int(11) DEFAULT 1,
    PRIMARY KEY (id)
);

CREATE TABLE user_cart (
    id int(11) NOT NULL AUTO_INCREMENT,
    shopping_cart_id int(11) NOT NULL,
    user_id varchar(128),
    active tinyint DEFAULT 0,
    PRIMARY KEY (id),
    FOREIGN KEY (shopping_cart_id) REFERENCES shopping_cart (id),
    FOREIGN KEY (user_id) REFERENCES product_final (id)
);

