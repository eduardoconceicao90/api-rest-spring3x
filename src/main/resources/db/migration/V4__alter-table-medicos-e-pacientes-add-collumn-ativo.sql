alter table medicos add ativo boolean;
update medicos set ativo = true;

alter table pacientes add ativo boolean;
update pacientes set ativo = true;