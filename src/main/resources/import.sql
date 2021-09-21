INSERT INTO laboratorio (id,nome) VALUES (1, 'GSK');
INSERT INTO laboratorio (id,nome) VALUES (2, 'Teuto Bras');
INSERT INTO laboratorio (id,nome) VALUES (3, 'União Química');
INSERT INTO laboratorio (id,nome) VALUES (4, 'Novafarma');
INSERT INTO laboratorio (id,nome) VALUES (5, 'Teuto');
INSERT INTO laboratorio (id,nome) VALUES (6, 'Ariston/Blau');
INSERT INTO laboratorio (id,nome) VALUES (7, 'Aurobindo');
INSERT INTO laboratorio (id,nome) VALUES (8, 'Eurofarma');
INSERT INTO laboratorio (id,nome) VALUES (9, 'Agila');
INSERT INTO laboratorio (id,nome) VALUES (10, 'Cristalia');
INSERT INTO laboratorio (id,nome) VALUES (11, 'Blau');
INSERT INTO laboratorio (id,nome) VALUES (12, 'Biochimico');
INSERT INTO laboratorio (id,nome) VALUES (13, 'Aspen Pharma');
INSERT INTO laboratorio (id,nome) VALUES (14, 'Abl');
INSERT INTO laboratorio (id,nome) VALUES (15, 'Mylan');
INSERT INTO laboratorio (id,nome) VALUES (16, 'Hypofarma');
INSERT INTO laboratorio (id,nome) VALUES (17, 'Halex Istar');
INSERT INTO laboratorio (id,nome) VALUES (18, 'Isofarma');
INSERT INTO laboratorio (id,nome) VALUES (19, 'Fresenius Kabi');
INSERT INTO laboratorio (id,nome) VALUES (20, 'Sanobiol');
INSERT INTO laboratorio (id,nome) VALUES (21, 'Neo');
INSERT INTO laboratorio (id,nome) VALUES (22, 'Santisa');
INSERT INTO laboratorio (id,nome) VALUES (23, 'Pfizer');
INSERT INTO laboratorio (id,nome) VALUES (24, 'Wyeth');
INSERT INTO laboratorio (id,nome) VALUES (25, 'JP');
INSERT INTO laboratorio (id,nome) VALUES (26, 'B. Braun');
INSERT INTO laboratorio (id,nome) VALUES (27, 'Astellas');
INSERT INTO laboratorio (id,nome) VALUES (28, 'Libra');
INSERT INTO laboratorio (id,nome) VALUES (29, 'Novartis/Msd');
INSERT INTO laboratorio (id,nome) VALUES (30, 'Neoquimica');
INSERT INTO laboratorio (id,nome) VALUES (31, 'Nova Farma');

INSERT INTO grupo_medicamento (id,nome) VALUES (1, 'Aciclovir');
INSERT INTO grupo_medicamento (id,nome) VALUES (2, 'Amicacina');
INSERT INTO grupo_medicamento (id,nome) VALUES (3, 'Amoxicilina + Clavulanato');
INSERT INTO grupo_medicamento (id,nome) VALUES (4, 'Ampicilina');
INSERT INTO grupo_medicamento (id,nome) VALUES (5, 'Ampicilina + Sulbactam');
INSERT INTO grupo_medicamento (id,nome) VALUES (6, 'Anfotericina B');
INSERT INTO grupo_medicamento (id,nome) VALUES (7, 'Azitromicina');
INSERT INTO grupo_medicamento (id,nome) VALUES (8, 'Benzilpenicilina Cristalina');
INSERT INTO grupo_medicamento (id,nome) VALUES (9, 'Cefalotina');
INSERT INTO grupo_medicamento (id,nome) VALUES (10, 'Cefepime');
INSERT INTO grupo_medicamento (id,nome) VALUES (11, 'Ceftriaxona IV');
INSERT INTO grupo_medicamento (id,nome) VALUES (12, 'Cefuroxima');
INSERT INTO grupo_medicamento (id,nome) VALUES (13, 'Clindamicina');
INSERT INTO grupo_medicamento (id,nome) VALUES (14, 'Ciprofloxacino');
INSERT INTO grupo_medicamento (id,nome) VALUES (15, 'Daptomicina');
INSERT INTO grupo_medicamento (id,nome) VALUES (16, 'Fluconazol');
INSERT INTO grupo_medicamento (id,nome) VALUES (17, 'Ganciclovir');
INSERT INTO grupo_medicamento (id,nome) VALUES (18, 'Gentamicina');
INSERT INTO grupo_medicamento (id,nome) VALUES (19, 'Linezolida');
INSERT INTO grupo_medicamento (id,nome) VALUES (20, 'Meropenem');
INSERT INTO grupo_medicamento (id,nome) VALUES (21, 'Metronidazol');
INSERT INTO grupo_medicamento (id,nome) VALUES (22, 'Micafungina');
INSERT INTO grupo_medicamento (id,nome) VALUES (23, 'Oxacilina');
INSERT INTO grupo_medicamento (id,nome) VALUES (24, 'Piperacilina + Tazobactam');
INSERT INTO grupo_medicamento (id,nome) VALUES (25, 'Polimixina B');
INSERT INTO grupo_medicamento (id,nome) VALUES (26, 'Sulfametoxazol + Trimetoprima');
INSERT INTO grupo_medicamento (id,nome) VALUES (27, 'Teicoplanina');
INSERT INTO grupo_medicamento (id,nome) VALUES (28, 'Vancomicina');

INSERT INTO via_administracao (id, nome) VALUES(1,'IM - Intramuscular');
INSERT INTO via_administracao (id, nome) VALUES(2,'IV - Intravenoso');
INSERT INTO via_administracao (id, nome) VALUES(3,'IV direto - Intravenoso direto');
INSERT INTO via_administracao (id, nome) VALUES(4,'IV infusao - Intravenoso infusao');






--1 - Aciclovir
INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (1, '1 - Zovirax – GSK(1)', 1, 1, 250, null, 'FRASCOAMPOLA','MILIGRAMA', '6 horas TA', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '60 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (1, 4, 1, null,  10, 10, 25, 'AD', 'IV Infusão: 10ml de AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (1, 4, 2, 1,  2.5, 3.5, 7, 'SF', 'Aspirar 1ml do frasco + 2,5ml de SF 0,9%');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (2, '2 - Ezopen – Teuto Bras(2)', 1, 2, 250, null, 'FRASCOAMPOLA','MILIGRAMA', '6 horas TA', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '60 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (2, 4, 1, null,  10, 10, 25, 'AD', 'IV Infusão: 10ml de AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (2, 4, 2, 1,  2.5, 3.5, 7, 'SF', 'Aspirar 1ml do frasco + 2,5ml de SF 0,9%');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (3, '3 - Aciclovir – Teuto Bras(2)', 1, 2, 250, null, 'FRASCOAMPOLA','MILIGRAMA', '6 horas TA', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '60 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (3, 4, 1, null,  10, 10, 25, 'AD', 'IV Infusão: 10ml de AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (3, 4, 2, 1,  2.5, 3.5, 7, 'SF', 'Aspirar 1ml do frasco + 2,5ml de SF 0,9%');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (4, '4 - Univir – União Química(3)', 1, 3, 250, null, 'FRASCOAMPOLA','MILIGRAMA', '6 horas TA', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '60 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (4, 4, 1, null,  10, 10, 25, 'AD', 'IV Infusão: 10ml de AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (4, 4, 2, 1,  2.5, 3.5, 7, 'SF', 'Aspirar 1ml do frasco + 2,5ml de SF 0,9%');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (5, '5 - Zynvir – Novafarma(4)', 1, 4, 250, null, 'FRASCOAMPOLA','MILIGRAMA', '6 horas TA', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '60 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (5, 4, 1, null,  10, 10, 25, 'AD', 'IV Infusão: 10ml de AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (5, 4, 2, 1,  2.5, 3.5, 7, 'SF', 'Aspirar 1ml do frasco + 2,5ml de SF 0,9%');


--2 - Amicacina
INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (6, '6 - Sulfato de Amicacina – Teuto Bras(2)', 2, 2, 100, 50, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '61 minutos');		
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (6, 1, 2, 2,  18, 20, 5, 'SF', 'Aspirar  1  ampola  de 100  mg  +  18  ml  SF 0,9% = 5 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (6, 2, 2, 2,  18, 20, 5, 'SF', 'Aspirar  1  ampola  de 100  mg  +  18  ml  SF 0,9% = 5 mg/ml');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (7, '7 - Amicilon – Ariston/Blau(6)', 2, 6, 100, 50, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '62 minutos');		
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (7, 1, 2, 2,  18, 20, 5, 'SF', 'Aspirar  1  ampola  de 100  mg  +  18  ml  SF 0,9% = 5 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (7, 2, 2, 2,  18, 20, 5, 'SF', 'Aspirar  1  ampola  de 100  mg  +  18  ml  SF 0,9% = 5 mg/ml');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (8, '8 - Amicacina – Novafarma(4)', 2, 4, 100, 50, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '63 minutos');		
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (8, 1, 2, 2,  18, 20, 5, 'SF', 'Aspirar  1  ampola  de 100  mg  +  18  ml  SF 0,9% = 5 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (8, 2, 2, 2,  18, 20, 5, 'SF', 'Aspirar  1  ampola  de 100  mg  +  18  ml  SF 0,9% = 5 mg/ml');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (9, '9 - Sulfato de Amicacina – Teuto Bras(2)', 2, 2, 500, 250, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '64 minutos');		
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (9, 1, 2, 2,  100, 100, 5, 'SF', 'Aspirar  1  ampola  de 500 mg + 100 ml SF = 5 mg/ml (ATENÇÃO:  administrar  a  dose  prescrita em  Bomba  de  Serin- ga)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (9, 2, 2, 2,  100, 100, 5, 'SF', 'Aspirar  1  ampola  de 500 mg + 100 ml SF = 5 mg/ml (ATENÇÃO:  administrar  a  dose  prescrita em  Bomba  de  Serin- ga)');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (10, '10 - Sulfato de Amicacina – Novafarma(4)', 2, 4, 500, 250, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '65 minutos');		
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (10, 1, 2, 2,  100, 100, 5, 'SF', 'Aspirar  1  ampola  de 500 mg + 100 ml SF = 5 mg/ml (ATENÇÃO:  administrar  a  dose  prescrita em  Bomba  de  Serin- ga)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (10, 2, 2, 2,  100, 100, 5, 'SF', 'Aspirar  1  ampola  de 500 mg + 100 ml SF = 5 mg/ml (ATENÇÃO:  administrar  a  dose  prescrita em  Bomba  de  Serin- ga)');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (11, '11 - Amicilon – Ariston/Blau(6)', 2, 6, 500, 250, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', 'Concentração   máxima para    pacientes    com restrição hídrica até 10 mg/ml.', '66 minutos');		
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (11, 1, 2, 2,  100, 100, 5, 'SF', 'Aspirar  1  ampola  de 500 mg + 100 ml SF = 5 mg/ml (ATENÇÃO:  administrar  a  dose  prescrita em  Bomba  de  Serin- ga)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (11, 2, 2, 2,  100, 100, 5, 'SF', 'Aspirar  1  ampola  de 500 mg + 100 ml SF = 5 mg/ml (ATENÇÃO:  administrar  a  dose  prescrita em  Bomba  de  Serin- ga)');


--3 - Amoxicilina + Clavulanato
INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (12, '12 - Amoxicilina+Clavulanato – Aurobindo(7)', 3, 7, 1000, null, 'FRASCOAMPOLA','MILIGRAMA', '4 horas TA 6 horas REF', 'Compatível    com    SG 5%.', '40 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (12, 4, 1, null,  20, 20, 50, 'AD', 'IV direto: 20 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (12, 4, 2, 20,  100, 100, 10, 'SF', 'IV infusão:100 ml SF');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (13, '13 - Amoxicilina+Clavulanato – Eurofarma(8)', 3, 8, 1000, null, 'FRASCOAMPOLA','MILIGRAMA', '4 horas TA 6 horas REF', 'Compatível    com    SG 5%.', '40 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (13, 4, 1, null,  20, 20, 50, 'AD', 'IV direto: 20 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (13, 4, 2, 20,  100, 100, 10, 'SF', 'IV infusão:100 ml SF');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (14, '14 - Doclaxin – Ariston/Blau(6)', 3, 6, 1000, null, 'FRASCOAMPOLA','MILIGRAMA', '4 horas TA', '.', '40 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (14, 4, 1, null,  20, 20, 50, 'AD', 'IV direto: 20 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (14, 4, 2, 20,  100, 100, 10, 'SF', 'IV infusão:100 ml SF');


--4 - Ampicilina
INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (15, '15 - Cilinon – Ariston/Blau(6)', 4, 6, 500, null, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', '.', '15 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (15, 1, 1, null,  2, 2, 250, 'AD', 'IM: 2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (15, 1, 2, 2,  18, 20, 25, 'SF', 'Aspirar 1 frasco + 18 ml SF = 25 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (15, 3, 1, null,  2, 2, 250, 'AD', 'IV direto: 2 ml AD ');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (15, 3, 2, 2,  18, 20, 25, 'SF', 'Aspirar 1 frasco + 18 ml SF = 25 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (15, 4, 1, null,  2, 2, 250, 'AD', 'IV infusão: 2 ml SF');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (15, 4, 2, 2,  18, 20, 25, 'SF', 'Aspirar 1 frasco + 18 ml SF = 25 mg/ml');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (16, '16 - Ampicilina Sodica – Teuto Bras(2)', 4, 2, 500, null, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', '.', '15 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (16, 1, 1, null,  2, 2, 250, 'AD', 'IM: 2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (16, 1, 2, 2,  18, 20, 25, 'SF', 'Aspirar 1 frasco + 18 ml SF = 25 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (16, 3, 1, null,  2, 2, 250, 'AD', 'IV direto: 2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (16, 3, 2, 2,  18, 20, 25, 'SF', 'Aspirar 1 frasco + 18 ml SF = 25 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (16, 4, 1, null,  2, 2, 250, 'AD', 'IV infusão: 2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (16, 4, 2, 2,  18, 20, 25, 'SF', 'Aspirar 1 frasco + 18 ml SF = 25 mg/ml');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (17, '17 - Ampicilina Sodica – Teuto Bras(2)', 4, 2, 1000, null, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', '.', '15 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (17, 1, 1, null,  3, 3, 333.33, 'AD', 'IM: 3 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (17, 1, 2, 3,  37, 40, 25, 'SF', 'Aspirar 1 frasco + 37 ml SF = 25 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (17, 3, 1, null,  3, 3, 333.33, 'AD', 'IV direto: 3 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (17, 3, 2, 3,  37, 40, 25, 'SF', 'Aspirar 1 frasco + 37 ml SF = 25 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (17, 4, 1, null,  3, 3, 333.33, 'AD', 'IV infusão: 3 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (17, 4, 2, 3,  37, 40, 25, 'SF', 'Aspirar 1 frasco + 37 ml SF = 25 mg/ml');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (18, '18 - Cilinon – Ariston/Blau(6)', 4, 6, 1000, null, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar sobras', '.', '15 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (18, 1, 1, null,  5, 5, 200, 'AD', 'IM: 5 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (18, 1, 2, 5,  35, 40, 25, 'SF', 'Aspirar 1 frasco + 35 ml SF = 25 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (18, 3, 1, null,  5, 5, 200, 'AD', 'IV direto: 5 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (18, 3, 2, 5,  35, 40, 25, 'SF', 'Aspirar 1 frasco + 35 ml SF = 25 mg/ml');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (18, 4, 1, null,  5, 5, 200, 'AD', 'IV infusão: 5 ml SF');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (18, 4, 2, 5,  35, 40, 25, 'SF', 'Aspirar 1 frasco + 35 ml SF = 25 mg/ml');


INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (19, '19 - Ampicilina + Sulbactam – Novafarma(4)', 5, 4, 1000, null, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar Sobras', 'Calcular   a   dose   com base  na  concentração de Ampicilina.', '15 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (19, 1, 1, null,  3.2, 3.2, 312.5, 'AD', 'IM: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (19, 1, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (19, 3, 1, null,  3.2, 3.2, 312.5, 'AD', 'IV direto: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (19, 3, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (19, 4, 1, null,  3.2, 3.2, 312.5, 'AD', 'IV infusão: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (19, 4, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (20, '20 -Ampicilina + Sulbactam – Eurofarma(8)', 5, 8, 1000, null, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar Sobras', 'Calcular   a   dose   com base  na  concentração de Ampicilina.', '15 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (20, 1, 1, null,  3.2, 3.2, 312.5, 'AD', 'IM: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (20, 1, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (20, 3, 1, null,  3.2, 3.2, 312.5, 'AD', 'IV direto: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (20, 3, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (20, 4, 1, null,  3.2, 3.2, 312.5, 'AD', 'IV infusão: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (20, 4, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (21, '21 - Ampicilina + Sulbactam – Agila(9) ', 5, 9, 1000, null, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar Sobras', 'Calcular   a   dose   com base  na  concentração de Ampicilina.', '15 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (21, 1, 1, null,  3.2, 3.2, 312.5, 'AD', 'IM: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (21, 1, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (21, 3, 1, null,  3.2, 3.2, 312.5, 'AD', 'IV direto: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (21, 3, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (21, 4, 1, null,  3.2, 3.2, 312.5, 'AD', 'IV infusão: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (21, 4, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');

INSERT INTO medicamento (id,nome,grupo_medicamento_id,laboratorio_id,quantidade_apresentacao,concentracao_inicial,embalagem_apresentada,unidade_medida, info_sobra, info_observacao, info_tempo_administracao) VALUES (22, '22 - Libractan – Libra(28)', 5, 28, 1000, null, 'FRASCOAMPOLA','MILIGRAMA', 'Descartar Sobras', 'Calcular   a   dose   com base  na  concentração de Ampicilina.', '15 minutos');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (22, 1, 1, null,  3.2, 3.2, 312.5, 'AD', 'IM: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (22, 1, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (22, 3, 1, null,  3.2, 3.2, 312.5, 'AD', 'IV direto: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (22, 3, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (22, 4, 1, null,  3.2, 3.2, 312.5, 'AD', 'IV infusão: 3,2 ml AD');	
INSERT INTO diluicao_configuracao (medicamento_id,via_administracao_id,sequencia,volume_aspirado,volume_adicionado,volume_final,concentracao,diluente,modo_preparo) VALUES (22, 4, 2, 3.2,  30, 30, 33.33, 'SF', 'Aspirar 1 frasco + 30 ml   SF   =   30   mg/ml (ampicilina)');
