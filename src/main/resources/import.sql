INSERT INTO role(id_role, enabled, name) VALUES (1, true, 'admin');
INSERT INTO user_data(id_user, enabled, password, username, id_role) VALUES (1, true , '$2a$12$6A6llPNSzkhS6x5MaW0pk.voKaiyTmoKszmOp2wEdfoVIr7jk4ENG', 'hugo', 1);

insert into exchange_country (ISO_CODE_ORI,ISO_CODE_DES,TIPO_CAMBIO) values ('PEN','DOL',0.26);
insert into exchange_country (ISO_CODE_ORI,ISO_CODE_DES,TIPO_CAMBIO) values ('PEN','EUR',0.24);
insert into exchange_country (ISO_CODE_ORI,ISO_CODE_DES,TIPO_CAMBIO) values ('DOL','EUR',0.92);
insert into exchange_country (ISO_CODE_ORI,ISO_CODE_DES,TIPO_CAMBIO) values ('DOL','PEN',3.85);
insert into exchange_country (ISO_CODE_ORI,ISO_CODE_DES,TIPO_CAMBIO) values ('EUR','DOL',1.09);
insert into exchange_country (ISO_CODE_ORI,ISO_CODE_DES,TIPO_CAMBIO) values ('EUR','PEN',4.15);