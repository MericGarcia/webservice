-- Table: calcul

-- DROP TABLE calcul;

CREATE TABLE calcul
(
  id bigserial NOT NULL,
  "time" timestamp,
  leftOperand numeric(19,2),
  operator varchar(50),
  rightOperand numeric(19,2),
  CONSTRAINT calcul_pkey PRIMARY KEY (id)
);

ALTER TABLE calcul
  OWNER TO test;
