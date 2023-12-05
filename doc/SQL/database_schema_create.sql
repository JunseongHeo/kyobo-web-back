CREATE DATABASE kyobo;

CREATE USER 'kyobo'@'%' identified by 'kyobo!';

GRANT ALL PRIVILEGES ON kyobo.* to 'kyobo'@'%';

FLUSH PRIVILEGES;