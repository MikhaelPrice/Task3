-- Table: public.postings

-- DROP TABLE IF EXISTS public.postings;

CREATE TABLE IF NOT EXISTS public.postings //вспомогательная таблица
(
    "Mat. Doc." bigint,
    "Item" bigint,
    "Doc. Date" date,
    "Pstng Date" date,
    "Material Description" text COLLATE pg_catalog."default",
    "Quantity" bigint,
    "BUn" text COLLATE pg_catalog."default",
    "Amount LC" text COLLATE pg_catalog."default",
    "Crcy" text COLLATE pg_catalog."default",
    "User Name" text COLLATE pg_catalog."default"
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.postings
    OWNER to postgres;