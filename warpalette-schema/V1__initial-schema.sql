create table public.manufacturers
(
    id   bigserial
        primary key,
    name varchar(255)
);

alter table public.manufacturers
    owner to war_user;

create table public.product_lines
(
    id              bigserial
        primary key,
    manufacturer_id bigint
        constraint product_lines_manufacturers_fk
            references public.manufacturers,
    name            varchar(255)
);

alter table public.product_lines
    owner to war_user;

create table public.paints
(
    id              bigserial
        primary key,
    manufacturer_id bigint
        constraint paints_manufacturers_fk
            references public.manufacturers,
    product_line_id bigint
        constraint paints_product_lines_fk
            references public.product_lines,
    color           varchar(255),
    name            varchar(255)
);

alter table public.paints
    owner to war_user;

create table public.users
(
    id       bigserial
        primary key,
    username varchar(255)
);

alter table public.users
    owner to war_user;

create table public.user_paints
(
    user_id bigint
        constraint users_paints_users_fk
            references public.users,
    paint_id bigint
        constraint users_paints_paints_fk
            references public.paints
);



