create table tb_cidade (
    id_cidade bigint not null primary key,
    nome varchar(50) not null,
    qnt_habitantes bigint
);

insert into tb_cidade
    (id_cidade, nome, qnt_habitantes)
values
    (1, 'São Paulo', 12396371),
    (2, 'Rio de Janeiro', 12396372);