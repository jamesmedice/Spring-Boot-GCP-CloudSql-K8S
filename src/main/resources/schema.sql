create database IF NOT EXISTS marketplace;

use marketplace; 

drop table if exists inventory;

create table inventory
(
    id              integer     NOT NULL AUTO_INCREMENT,
    itemName        varchar(50) NOT NULL,
    itemPrice       float,
    itemDescription varchar(50),
    itemSupplier    varchar(50) NOT NULL DEFAULT 'Factory',
    quantity        integer,
    primary key (id)
);
