select
    e.employee_id as nik,
    e.first_name as nama,
    e.job_id,
    (select j.job_title from jobs j where j.job_id = e.job_id) as jabatan,
    (select j2.min_salary from jobs j2 where j2.job_id = e.job_id) as minimun_salary
from employees e
limit 10;

select
    e.employee_id as nik,
    e.first_name as nama,
    e.salary as gaji_sebulan
from 
    employees e
where 
    e.salary < any (
        select 
            round(avg(j.max_salary)) as gaji_rata 
        from jobs j 
        group by j.job_id
        having avg(j.max_salary) < 20000
    );

create table test_table (
    id                  serial                  primary key,
    first_name          character varying(60)   not null,
    birtdate            date                    not null,
    is_active           boolean                             default false,
    balance             decimal                 not null    default 0,
    created_datetime    timestamp                not null    default now()
);

insert into test_table(first_name, birtdate, is_active, balance, password) values ('Dimas Maryanto', '2019-02-13', true, 0, 'test');

ALTER TABLE test_table ADD COLUMN password character varying(60)

alter table test_table add constraint  uq_pass unique (password)

    Column     |         Type          | Collation | Nullable |                    Default                     
----------------+-----------------------+-----------+----------+------------------------------------------------
 location_id    | integer               |           | not null | nextval('locations_location_id_seq'::regclass)
 street_address | character varying(40) |           |          | 
 postal_code    | character varying(12) |           |          | 
 city           | character varying(30) |           |          | 
 state_province | character varying(25) |           |          | 
 country_id     | character varying(2)  |           |          | 
Indexes:


insert into locations (street_address, postal_code, city, state_province, country_id) values ('Bandung', '40626', 'Bandung', 'Jawa Barat', 11);