create table reservation(
    nom_client varchar(150) not null ,
    Numero_telephone varchar(10) not null,
    Adress_email varchar(50) not null,
    numero_chambre int primary key ,
    description_chambre varchar(250) not null,
    date_reservation TIMESTAMP
);