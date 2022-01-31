# Repository basic_elk
Elasticsearch, Kibana, Beats, Logstash(ELK Stack) 등을 학습합니다.

로컬에서 도커를 띄워 ElasticSearch, Kibana 컨테이너를 실행하고

SpringBoot Kotlin 프로젝트에서 실행하는 단계까지 진행되었습니다.


# SpringBoot
* version 2.6.3

# Docker
1. ElasticSeacrh
* version 7.10.1
* docker image pull & container start

2. Kibana
* version 7.10.1
* docker image pull & container start
*   docker run -d --link {elasticsearch 컨테이너 ID}:elasticsearch -p 5601:5601 --name kibana7 docker.elastic.co/kibana/kibana:7.10.1


# ElasticSearch data check
### http://localhost:9200/blog/_doc/2


# Kibana check
### http://localhost:5601/
