insert into PRODUCT (ID, TX_NAME)values(35455, 'T-SHIRT');
insert into BRAND (ID, TX_NAME)values(1, 'ZARA');
insert into PRODUCT_PRICE (ID, NU_PRICELIST,ID_BRAND,DT_STARTDATE,DT_ENDDATE,ID_PRODUCT,NU_PRIORITY,NU_PRICE,TX_CURR)values(1,1,1,TO_DATE('2020-06-14-00.00.00','YYYY-MM-DD-HH24.MI.SS'),TO_DATE('2020-12-31-23.59.59','YYYY-MM-DD-HH24.MI.SS'),35455,0,35.50,'EUR');
insert into PRODUCT_PRICE (ID, NU_PRICELIST,ID_BRAND,DT_STARTDATE,DT_ENDDATE,ID_PRODUCT,NU_PRIORITY,NU_PRICE,TX_CURR)values(2,2,1,TO_DATE('2020-06-14-15.00.00','YYYY-MM-DD-HH24.MI.SS'),TO_DATE('2020-06-14-18.30.00','YYYY-MM-DD-HH24.MI.SS'),35455,1,25.45,'EUR');
insert into PRODUCT_PRICE (ID, NU_PRICELIST,ID_BRAND,DT_STARTDATE,DT_ENDDATE,ID_PRODUCT,NU_PRIORITY,NU_PRICE,TX_CURR)values(3,3,1,TO_DATE('2020-06-15-00.00.00','YYYY-MM-DD-HH24.MI.SS'),TO_DATE('2020-06-15-11.00.00','YYYY-MM-DD-HH24.MI.SS'),35455,1,30.50,'EUR');
insert into PRODUCT_PRICE (ID, NU_PRICELIST,ID_BRAND,DT_STARTDATE,DT_ENDDATE,ID_PRODUCT,NU_PRIORITY,NU_PRICE,TX_CURR)values(4,4,1,TO_DATE('2020-06-15-16.00.00','YYYY-MM-DD-HH24.MI.SS'),TO_DATE('2020-12-31-23.59.59','YYYY-MM-DD-HH24.MI.SS'),35455,1,38.95,'EUR');