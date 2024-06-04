gradle build
sudo docker build . -t catdogback
sudo docker run --name=catdogback -p 8080:8080 --network catdognet -d catdogback 
