CREATE TABLE customer
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    first_name VARCHAR(255)                            NOT NULL,
    last_name  VARCHAR(255)                            NOT NULL,
    cpf        VARCHAR(255)                            NOT NULL,
    email      VARCHAR(255)                            NOT NULL,
    password   VARCHAR(255)                            NOT NULL,
    zip_code   VARCHAR(255)                            NOT NULL,
    street     VARCHAR(255)                            NOT NULL,
    number     INT                                     NOT NULL,
    CONSTRAINT pk_client PRIMARY KEY (id)
);

ALTER TABLE customer ADD CONSTRAINT uc_customer_cpf UNIQUE (cpf);

ALTER TABLE customer ADD CONSTRAINT uc_customer_email UNIQUE (email);