INSERT INTO `vat` (id, value, description) VALUES
(3501,19,'Standard VAT'),
(3502,9,'livrarea de proteze și accesorii ale acestora, cu excepția protezelor dentare scutite de taxă;livrarea de produse ortopedice;livrarea de medicamente de uz uman și veterinar;livrarea următoarelor bunuri: alimente, inclusiv băuturi, cu excepția băuturilor alcoolice, destinate consumului uman și animal, animale și păsări vii din specii domestice, semințe, plante și ingrediente folosite în prepararea alimentelor, produse folosite pentru a completa sau înlocui alimentele; livrarea apei pentru irigații în agricultură;livrarea de îngrășăminte și de pesticide folosite în agricultură, semințe și alte produse agricole destinate însămânțării sau plantării, precum și prestările de servicii de tipul celor specifice folosite în sectorul agricol;serviciile de alimentare cu apă şi canalizare.'),
(3503,5,'manualele școlare, cărțile, ziarele și revistele, cu excepția celor destinate exclusiv sau în principal publicității;serviciile constând în permiterea accesului la castele, muzee, case memoriale, monumente istorice, monumente de arhitectură și arheologice, grădini zoologice și botanice, bâlciuri, parcuri de distracții și parcuri recreative ale căror activități sunt încadrate la codurile CAEN 9321 și 9329, târguri, expoziții și evenimente culturale, evenimente sportive, cinematografe, altele decât cele scutite;livrarea locuințelor ca parte a politicii sociale, inclusiv a terenului pe care sunt construite;cazarea în cadrul sectorului hotelier sau al sectoarelor cu funcție similară, inclusiv închirierea terenurilor amenajate pentru camping;serviciile de restaurant și de catering, cu excepția băuturilor alcoolice, altele decât berea;dreptul de utilizare a facilităților sportive ale căror activități sunt încadrate la codurile CAEN 9311 și 9313, în scopul practicării sportului și educației fizice, altele decât cele scutite;transportul de persoane cu trenurile sau vehiculele istorice cu tracțiune cu aburi pe linii înguste, în scop turistic sau de agrement;transportul de persoane folosind instalațiile de transport pe cablu, în scop turistic sau de agrement (telecabină, telegondolă, telescaun, teleski);transportul de persoane cu vehicule cu tracțiune animală folosite în scop turistic sau de agrement;transportul de persoane cu ambarcațiuni folosite în scop turistic sau de agrement;livrarea alimentelor de înaltă valoare calitativă, adică a produselor montane, eco și tradiționale.');

INSERT INTO `product_final` (id,name, description_short, description_long) VALUES
(1,'Coca-Cola', null, null),
(2,'Fanta', null, null),
(3,'Sprite', null, null),
(4,'Nestea', null, null),
(5,'Dorna', null, null),
(6,'Espresso', '20 ml of coffee from 9g of fresh grounded coffee', null),
(7,'Espresso Double', '40 ml of coffee from 18g of fresh grounded coffee', null),
(8,'Cappuccino', '1 shot of espresso with milk cream', null),
(9,'Latte', null, null),
(10,'Irish', '1 shot of coffee with 20ml of Irish and cream on top', null);

INSERT INTO `product_final_price`(id, vat_id, price_no_vat, product_final_id, price_final, creation_date, active) VALUES
(1,3502,5.50,1,0.00,now(), true),
(2,3502,5.50,2,0.00,now(), true),
(3,3502,5.50,3,0.00,now(), true),
(4,3502,5.50,4,0.00,now(), true),
(5,3502,5.50,5,0.00,now(), true);

INSERT INTO `category` (id, name, category_id) VALUES
(1,'Drinks',null),
(2,'Soft-Drinks',1),
(3,'Coffee',1),
(4,'Cocktail',1);

INSERT INTO `product_category` (category_id, product_final_id) VALUES
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(3, 6),
(3, 7),
(3, 8),
(3, 9),
(3, 10);

INSERT INTO `user_role` (id, name, description) VALUES
(1,'customer', 'Has limited access'),
(2,'administrator', 'Has full access');

