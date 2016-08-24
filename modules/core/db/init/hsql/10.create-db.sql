-- begin CECIP_ORDER
create table CECIP_ORDER (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_DATE date not null,
    CUSTOMER varchar(255),
    --
    primary key (ID)
)^
-- end CECIP_ORDER
-- begin CECIP_PRODUCT
create table CECIP_PRODUCT (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end CECIP_PRODUCT
-- begin CECIP_ORDER_LINE
create table CECIP_ORDER_LINE (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36) not null,
    PRICE decimal(19, 2),
    ORDER_ID varchar(36),
    --
    primary key (ID)
)^
-- end CECIP_ORDER_LINE
