-- Adicionando participantes
INSERT INTO tb_participante(nome, email) VALUES('José Silva', 'jose@gmail.com');
INSERT INTO tb_participante(nome, email) VALUES('Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante(nome, email) VALUES('Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participante(nome, email) VALUES('Teresa Silva', 'teresa@gmail.com');

-- Adicionando atividades
INSERT INTO tb_atividade(nome, descricao, preco, categoria_id) VALUES('Curso de HTML', 'Aprenda HTML de forma prática', 80.0, 1);
INSERT INTO tb_atividade(nome, descricao, preco, categoria_id) VALUES('Oficina de Github', 'Controle versões de seus projetos', 50.0, 2);

-- Adicionando categorias
INSERT INTO tb_categoria(descricao) VALUES('Curso');
INSERT INTO tb_categoria(descricao) VALUES('Oficina');

-- Adicionando blocos associados as atividades
INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES('2017-09-25 08:00:00', '2017-09-25 11:00:00', 1);
INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES('2017-09-25 14:00:00', '2017-09-25 18:00:00', 2);
INSERT INTO tb_bloco(inicio, fim, atividade_id) VALUES('2017-09-26 08:00:00', '2017-09-26 11:00:00', 2);

-- Associando participantes as atividades
INSERT INTO tb_atividade_participante(participante_id, atividade_id) VALUES(1,1);
INSERT INTO tb_atividade_participante(participante_id, atividade_id) VALUES(1,2);

INSERT INTO tb_atividade_participante(participante_id, atividade_id) VALUES(2,1);

INSERT INTO tb_atividade_participante(participante_id, atividade_id) VALUES(3,1);
INSERT INTO tb_atividade_participante(participante_id, atividade_id) VALUES(3,2);

INSERT INTO tb_atividade_participante(participante_id, atividade_id) VALUES(4,2);