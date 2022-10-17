-- Table: public.logins

-- DROP TABLE IF EXISTS public.logins;

CREATE TABLE IF NOT EXISTS public.logins //вспомогательная таблица
(
    "Application" text COLLATE pg_catalog."default",
    "AppAcountName" text COLLATE pg_catalog."default",
    "IsActive" boolean,
    "JobTitle" text COLLATE pg_catalog."default",
    "Department" text COLLATE pg_catalog."default"
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.logins
    OWNER to postgres;

COPY logins FROM 'D:\A1_Task\logins.csv' WITH DELIMITER ';' CSV HEADER;