-- Table: public.loginsa1

-- DROP TABLE IF EXISTS public.loginsa1;

CREATE TABLE IF NOT EXISTS public.loginsa1
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    app_account_name character varying(255) COLLATE pg_catalog."default",
    application character varying(255) COLLATE pg_catalog."default",
    department character varying COLLATE pg_catalog."default",
    is_active boolean NOT NULL,
    job_title character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT loginsa1_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.loginsa1
    OWNER to postgres;