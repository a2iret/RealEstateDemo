
INSERT INTO currencies (name, active) VALUES ('Доллары', true) ,('Сомы', true);

INSERT INTO price_type (name, active) VALUES ('За все', true),('За квадратный метр', true);

UPDATE exchange_options SET name = 'С доплатой продавца' WHERE id = 4;

INSERT INTO currency_rates(rate) VALUES()