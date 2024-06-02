docker build . -t catdogdb
docker volume create mysql-volume
docker run --name=catdog -p 3306:3306 -v mysql-volume:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root -d catdogdb
