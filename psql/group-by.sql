select 
    department_id as kode,
    count(*) as jumlah_karyawan,
    (sum(salary) * 12) as total_salary
from employees
group by department_id
order by kode;