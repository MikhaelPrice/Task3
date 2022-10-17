-- Table: public.postingsa1

-- DROP TABLE IF EXISTS public.postingsa1;

CREATE TABLE IF NOT EXISTS public.postingsa1
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    amount_lc character varying(255) COLLATE pg_catalog."default",
    auth_posting boolean,
    b_un character varying(255) COLLATE pg_catalog."default",
    crcy character varying(255) COLLATE pg_catalog."default",
    doc_date character varying(255) COLLATE pg_catalog."default",
    item character varying(255) COLLATE pg_catalog."default",
    mat_doc character varying(255) COLLATE pg_catalog."default",
    material_description character varying(255) COLLATE pg_catalog."default",
    pstng_date character varying(255) COLLATE pg_catalog."default",
    quantity integer NOT NULL,
    user_name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT postingsa1_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.postingsa1
    OWNER to postgres;