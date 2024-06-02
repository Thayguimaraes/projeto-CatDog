docker build . -t catdogfront
docker run --name=catdogfront -p 4000:4000 -d catdogfront 
