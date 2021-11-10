INSERT INTO `vat` (id, value, description) VALUES
(3501,19,'Standard VAT'),
(3502,9,'livrarea de proteze și accesorii ale acestora, cu excepția protezelor dentare scutite de taxă;livrarea de produse ortopedice;livrarea de medicamente de uz uman și veterinar;livrarea următoarelor bunuri: alimente, inclusiv băuturi, cu excepția băuturilor alcoolice, destinate consumului uman și animal, animale și păsări vii din specii domestice, semințe, plante și ingrediente folosite în prepararea alimentelor, produse folosite pentru a completa sau înlocui alimentele; livrarea apei pentru irigații în agricultură;livrarea de îngrășăminte și de pesticide folosite în agricultură, semințe și alte produse agricole destinate însămânțării sau plantării, precum și prestările de servicii de tipul celor specifice folosite în sectorul agricol;serviciile de alimentare cu apă şi canalizare.'),
(3503,5,'manualele școlare, cărțile, ziarele și revistele, cu excepția celor destinate exclusiv sau în principal publicității;serviciile constând în permiterea accesului la castele, muzee, case memoriale, monumente istorice, monumente de arhitectură și arheologice, grădini zoologice și botanice, bâlciuri, parcuri de distracții și parcuri recreative ale căror activități sunt încadrate la codurile CAEN 9321 și 9329, târguri, expoziții și evenimente culturale, evenimente sportive, cinematografe, altele decât cele scutite;livrarea locuințelor ca parte a politicii sociale, inclusiv a terenului pe care sunt construite;cazarea în cadrul sectorului hotelier sau al sectoarelor cu funcție similară, inclusiv închirierea terenurilor amenajate pentru camping;serviciile de restaurant și de catering, cu excepția băuturilor alcoolice, altele decât berea;dreptul de utilizare a facilităților sportive ale căror activități sunt încadrate la codurile CAEN 9311 și 9313, în scopul practicării sportului și educației fizice, altele decât cele scutite;transportul de persoane cu trenurile sau vehiculele istorice cu tracțiune cu aburi pe linii înguste, în scop turistic sau de agrement;transportul de persoane folosind instalațiile de transport pe cablu, în scop turistic sau de agrement (telecabină, telegondolă, telescaun, teleski);transportul de persoane cu vehicule cu tracțiune animală folosite în scop turistic sau de agrement;transportul de persoane cu ambarcațiuni folosite în scop turistic sau de agrement;livrarea alimentelor de înaltă valoare calitativă, adică a produselor montane, eco și tradiționale.');

INSERT INTO `category` (id, name, category_id) VALUES
(10,'TV - Audio - Video',null),
(12,'TV',10),
(13,'Audio',10),
(14,'Video',10),
(20,'Laptop - Desktop - IT - Birotica',null),
(21,'Laptop',20),
(22,'Desktop',20),
(23,'IT',20),
(24,'Birotica',20),
(30,'Telefoane - Tablete',null),
(31,'Telefoane',30),
(32,'Tablete',30),
(40,'Electrocasnice mari',null),
(50,'Electrocasnice mici - Vesela',null),
(51,'Electrocasnice mici',50),
(52,'Vesela',50),
(60,'Cosmetice - Sanatate - Beauty',null),
(61,'Cosmetice',60),
(62,'Sanatate',60),
(63,'Beauty',60),
(70,'Incalzire - Racire - Purificare aer',null),
(71,'Incalzire',70),
(72,'Racire',70),
(73,'Purificare aer',70),
(80,'Curatenie - Intretinere casa', null),
(81,'Curatenie - Intretinere casa', 80),
(82,'Curatenie - Intretinere casa', 80);

INSERT INTO `product_final` (id,name, description_long) VALUES
(552,'Sony Turntable - PSLX350H','Sony Turntable - PSLX350H Belt Drive System 33-13 and 45 RPM Speeds Servo Speed Control Supplied Moving Magnet Phono Cartridge Bonded Diamond Stylus Static Balance Tonearm Pitch Control'),
(580,'Bose Acoustimass 5 Series III Speaker System - AM53BK','Bose Acoustimass 5 Series III Speaker System - AM53BK 2 Dual Cube Speakers With Two 2-12 Wide-range Drivers In Each Speaker Powerful Bass Module With Two 5-12 Woofers 200 Watts Max Power Black Finish'),
(4696,'Sony Switcher - SBV40S','Sony Switcher - SBV40S Eliminates Disconnecting And Reconnecting Cables Compact Design 4 AV Inputs With S-Video Jacks 1 AV Output With S-Video (YC)Jack 2 Audio Output'),
(5644,'Sony 5 Disc CD Player - CDPCE375','Sony 5 Disc CD Player- CDPCE375 5 Disc Changer Variable Line Output CD-RRW Playback Capability 20 Track Music Calendar Digital Servo Control Remote Commander Remote Control'),
(6284,'Bose 27028 161 Bookshelf Pair Speakers In White - 161WH','Bose 161 Bookshelf Speakers In White - 161WH Articulated Array Speaker Design High-Excursion Twiddler Drivers Magnetically Shielded Priced Per Pair White Finish'),
(6493,'Denon Stereo Tuner - TU1500RD','Denon Stereo Tuner - TU1500RD RDS Radio Data System AM-FM 40 Station Random Memory Rotary Tuning Knob Dot Matrix FL Display Optional Remote'),
(6726,'KitchenAid Pasta Roller And Cutter - KPRA','KitchenAid Pasta Roller And Cutter - KPRA One Pasta Roller Two Pasta Cutters Cleaning Brush Chrome Finish'),
(6742,'Panasonic Yeast Pro Automatic Breadmaker - SDYD250','Panasonic Yeast Pro Automatic Breadmaker - SDYD250 Patented Yeast Dispenser 2.5 lb To 1.5 lb Loaf Choice Of Bread And Baking Modes 13 Hour Countdown Digital Timer Nonstick Coating For Easy Cleanup'),
(7195,'Sony Vertical-In-The-Ear Stereo Headphones - MDRJ10','Sony Vertical-In-The-Ear Stereo Headphones - MDRJ10 Clip On Style 13.5 MM Driver Unit Blue Finish'),
(7783,'Panasonic 2-Line Integrated Telephone - KXTSC14W','Panasonic 2-Line Integrated Telephone - KXTSC14W Call Waiting 50-Station Caller ID Voice Mail Message-Waiting Indicator Speakerphone 3-Line LCD Display White Finish'),
(7936,'Panasonic Integrated Telephone System - KXTS108W','Panasonic Integrated Telephone System - KXTS108W 16 Digit LCD With Clock Hands Free Speakerphone Built-In Data Port 10-Station One-Touch Dialing 3-Step Ringer Volume White Finish'),
(8060,'Panasonic 2-Line Integrated Telephone System - KXTS208W','Panasonic 2-Line Integrated Telephone System - KXTS208W 3-Way Conference One-TouchSpeed Dialer Speakerphone White Finish'),
(8552,'Sony 300 Disc CD Changer - CDPCX355','Sony 300 Disc CD Changer - CDPCX355 MegaStorage Control CD-RCD-RW Playback 32 Step Program Play Control A1 II Custom File Memo CD Text Keyboard Input 2 Jog Dials Remote Control Black Finish'),
(9071,'Sony 400 Disc MegaStorage CD Changer - CDPCX455','Sony 400 Disc MegaStorage CD Changer - CDPCX455 MP3 Playback Capability CD-RCD-RW Playback Twin Jog Dial For Easy Disc Access MegaChanger Control Optical Digital Output Keyboard Input Remote Commander® Remote Control'),
(9312,'Panasonic Hands-Free Headset - KXTCA86','Panasonic Hands-Free Headset - KXTCA86 Comfort Fit And  Fold Design Noise Cancelling Microphone Standard 2.5mm Connection'),
(9314,'Panasonic Hands Free Headset  - KXTCA92','Panasonic Hands Free Headset - KXTCA92 Comfort Fit With Fold Design Noise Cancelling Microphone Volume Control Mute Standard 2.5mm Connection'),
(9355,'Cuisinart Convection-Oven-Toaster-Broiler With Exact Heat Sensor - TOB165WH','Cuisinart Convection-Oven-Toaster-Broiler With Exact Heat Sensor - TOB165WH 0.5 Cubic Foot Oven Capacity LED Indicators Individual Or Combination Settings Always Even Shade Control 4 Hour Automatic Shut Off Slide-Out Crumb Tray Includes Broiling Pan White Finish'),
(9546,'Frigidaire 24 White Built-In Dishwasher - FDB130WH','Frigidaire 24 FDB130RGS White Built-In Dishwasher - FDB130WH Convection Drying System QuietSound Sound Insulation Package 2 Wash Levels Adjustable Rinse Aid Dispenser Self Cleaning Filter White Finish'),
(9646,'Cuisinart Cordless Electric Kettle - KUA17','Cuisinart Cordless Electric Kettle - KUA17 1-34 Quart Capacity Automatic Shut-Off Indicator Light Splash Guard Spout Cord Storage In Base Chrome Finish');

-- INSERT INTO `product_final` (id,name, description_short, description_long) VALUES
-- (10,'Irish', '1 shot of coffee with 20ml of Irish and cream on top', null);
--
-- INSERT INTO `product_final_price`(id, vat_id, price_no_vat, product_final_id, price_final, creation_date, active) VALUES
-- (5,3502,5.50,5,0.00,now(), true);

-- INSERT INTO `product_category` (category_id, product_final_id) VALUES
-- (3, 10);

INSERT INTO `user_role` (id, name, description) VALUES
(1,'customer', 'Has limited access'),
(2,'administrator', 'Has full access');

