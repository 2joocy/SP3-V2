/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  William Pfaffe
 * Created: 22-02-2017
 */
INSERT INTO BOOK (ID, TITLE) VALUES (null, 'book-3');
set @book1 = LAST_INSERT_ID();
INSERT INTO BOOK (ID, TITLE) VALUES (null, 'book-4');
set @book2 = LAST_INSERT_ID();
INSERT INTO CUSTOMER (ID, CNAME, CUSTOMERTYPE) VALUES (null, 'Børge Larsen', CustomerType.GOLD);
set @customer1 = LAST_INSERT_ID();
INSERT INTO CUSTOMER (ID, CNAME, CUSTOMERTYPE) VALUES (null, 'Børge Andersen', CustomerType.IRON);
set @customer2 = LAST_INSERT_ID();

