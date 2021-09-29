# 10ynews for Spring Boot
* Original : [Kenu Heo](https://github.com/kenu/10ynews)
* 10년 전 오늘 뉴스
* **역사를 잊은 민족에게 미래는 없다** - 단재 신채호
## Build & Run
```
git clone https://github.com/platanus-kr/10ynews-spring-boot
cd 10ynews-spring-boot
sh gradlew build
java -jar build/libs/tenynews-0.0.1-SNAPSHOT.jar
```
* http://localhost:8080

## License
* [MIT](https://github.com/kenu/10ynews/blob/main/LICENSE)

## EC2 install
* AMI Linux 2 instance with 80 port open in Security Group
* First install env with git, Java 11, nginx
* `curl -o install-env.sh -L https://raw.githubusercontent.com/platanus-kr/10ynews-spring-boot/master/scripts/install-env.sh && sh install-env.sh && rm -rf install-env.sh`
* Open instance public ip in browser
