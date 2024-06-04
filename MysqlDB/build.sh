docker build . -t catdogdb
docker volume create mysql-volume
docker network create catdognet
docker run --name=catdog -p 3306:3306 -v mysql-volume:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root --network catdognet -d catdogdb 
