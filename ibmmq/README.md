
### To run the project start the mq docker container
docker run --env LICENSE=accept --env MQ_QMGR_NAME=QM1 \
           --publish 1414:1414 \
           --publish 9443:9443 \
           --detach \
           ibmcom/mq

### to run the Integration tests run 
mvn verify


### The connection default conf
cat /mnt/mqm/data/qmgrs/QM1/@ipcc/AMQCLCHL.TAB
