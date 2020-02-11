select 
    first_name, 
    salary as gaji_perbulan,
    salary + 1000 as gaji_plus 
from employees;

select 
    date '2017-03-30' + date '2017-03-15' as jumlah_hari_kerja;
