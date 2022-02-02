# Repository basic_elk
Elasticsearch, Kibana, Beats, Logstash(ELK Stack) 등을 학습합니다.

로컬에서 도커를 띄워 ElasticSearch, Kibana 컨테이너를 실행하고

SpringBoot Kotlin 프로젝트에서 실행하는 단계까지 진행되었습니다.



# Version
* SpringBoot 2.6.3
* ELK 7.16.3


# Install a ELK Stack (Elasticsearch + Kibana + Logstash) on docker
### docker container github
* deviantony/docker-elk github

1. git clone https://github.com/deviantony/docker-elk.git
2. cd docker-elk
3. docker-compose build && docker-compose up -d

### docker container start
* docker-compose up -d


# modify ELK setting
### local Repo => https://github.com/comeevery-git/docker-elk.git
* Elasticsearch Config
* Kibana Config
* Logstash Config
* Filebeat Config
* docker-compose.yml

